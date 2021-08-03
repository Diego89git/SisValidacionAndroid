package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.prueba.Adapters.Validacion_ApiAdapter;
import com.example.prueba.Clases.DetalleValidacion;
import com.example.prueba.Clases.Validacion;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<ArrayList<Validacion>> {
    Spinner validaciones;
    ListView detallesVal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        validaciones=findViewById(R.id.spValidaciones);
        Call<ArrayList<Validacion>> call= Validacion_ApiAdapter.getApiService().getValidacionesPendientes();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<ArrayList<Validacion>> call, Response<ArrayList<Validacion>> response) {
        ArrayList<Validacion> val= response.body();
        validaciones.setAdapter(new ArrayAdapter<Validacion>(this, android.R.layout.simple_spinner_item,val));
    }

    @Override
    public void onFailure(Call<ArrayList<Validacion>> call, Throwable t) {
        Log.d("Error","Error de coneccion");
    }
    public void actualizar(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity.class);
        finish();
        overridePendingTransition(0, 0);
        startActivity(i);
        overridePendingTransition(0, 0);
    }
    public void salir (View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Cierre de aplicacion");

        alertDialogBuilder.setMessage("Está seguro que desea salir");
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("SI",
            new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        finishAffinity(); System.exit(0);
                    }
                });
        alertDialogBuilder.setNeutralButton("CANCELAR",
                new DialogInterface.OnClickListener()
                { public void onClick(DialogInterface dialog, int id)
                {
                    dialog.cancel();
                }
                }) ;
        alertDialogBuilder.setNegativeButton("NO",
                new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
    public void verDetalleValidacion(View view){
        Validacion val=(Validacion)validaciones.getSelectedItem();
        int id_val=Integer.parseInt(val.getIdVal());
        Call<ArrayList<DetalleValidacion>> call= Validacion_ApiAdapter.getApiService().getDetalleValidacionById(id_val);
        call.enqueue(new DetalleVal());
    }
    class DetalleVal  implements Callback<ArrayList<DetalleValidacion>> {

        @Override
        public void onResponse(Call<ArrayList<DetalleValidacion>> call, Response<ArrayList<DetalleValidacion>> response) {
            int tamaño= response.body().size();
            Log.d("Si entro a lo bien","pero no se si vale CON TAmaño de "+tamaño);
            int i=0;
            ArrayList<DetalleValidacion> detval= response.body();
            detallesVal= findViewById(R.id.lisDetallesVal);
            detallesVal.setAdapter(new ArrayAdapter<DetalleValidacion>(getBaseContext(), android.R.layout.simple_spinner_item,detval));
        }

        @Override
        public void onFailure(Call<ArrayList<DetalleValidacion>> call, Throwable t) {
            Log.d("Error","Error de coneccion");
        }
    }
}
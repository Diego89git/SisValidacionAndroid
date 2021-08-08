package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONArray;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import retrofit2.http.Url;

public class login extends AppCompatActivity implements View.OnClickListener{

    EditText nombre;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        nombre = (EditText) findViewById(R.id.txtCorreo);
        pass = (EditText) findViewById(R.id.txtPassword);
        Button boton = (Button) findViewById(R.id.btnIngresar);
        boton.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Thread tr= new Thread(){
            @Override
            public void run() {
                final String resultado = enviarDatos(nombre.getText().toString(),pass.getText().toString());
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        int r= obtDatosJSON(resultado);
                        if (r>0){
                            Intent i = new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(i);
                        }else {
                            Toast.makeText(getApplicationContext(), "Usuario o Contraseña Incorrectos", Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        };
        tr.start();
    }

    public String enviarDatos (String nomb, String pass){
        URL url = null;
        String linea="";
        int respuesta=0;
        StringBuffer resul = null;

        try {
            url = new URL("http://192.168.100.30/proyecto/SisValidacionApiRest/restApi/auth?u="+nomb+"&&p="+pass);
            HttpURLConnection conection = (HttpURLConnection) url.openConnection();
            respuesta=conection.getResponseCode();
            resul = new StringBuffer();
            if (respuesta == HttpURLConnection.HTTP_OK){
                InputStream in =new BufferedInputStream(conection.getInputStream());
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                while ((linea=reader.readLine())!=null){
                    resul.append(linea);
                }
            }
        } catch (Exception e) {}
        return resul.toString();
    }

    public int obtDatosJSON (String response){
        int res=0;
        char sop = response.charAt(11);
        if (Character.compare(sop,'o')==0)
            res=1;
        return res;
    }


}
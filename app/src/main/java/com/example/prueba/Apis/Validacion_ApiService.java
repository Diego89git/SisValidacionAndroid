package com.example.prueba.Apis;

import com.example.prueba.Clases.DetalleValidacion;
import com.example.prueba.Clases.Validacion;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Validacion_ApiService {
    @GET("Validaciones?ValidacionesByEstado=PENDIENTE")
    Call<ArrayList<Validacion>> getValidacionesPendientes();

    @POST("Validaciones?DetalleValidacionById")
    Call<ArrayList<DetalleValidacion>> getDetalleValidacionById(@Query("ID_VAL_DET") int id_Val);
}

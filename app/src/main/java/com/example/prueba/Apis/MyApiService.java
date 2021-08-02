package com.example.prueba.Apis;

import com.example.prueba.Clases.Usuario;
import com.example.prueba.Clases.UsuarioRespuesta;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyApiService {
    @GET("usuario?usuarios")
    Call<UsuarioRespuesta> getUsuarioRespuesta();

    @GET("usuario?usuarios")
    Call<ArrayList<Usuario>> getUsuarios();
}

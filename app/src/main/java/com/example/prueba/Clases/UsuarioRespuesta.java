package com.example.prueba.Clases;

import com.example.prueba.Clases.Usuario;

import java.util.ArrayList;

public class UsuarioRespuesta {
    String status;
    ArrayList<Usuario> result;

    public ArrayList<Usuario> getResult() {
        return result;
    }

    public void setResult(ArrayList<Usuario> result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

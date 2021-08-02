package com.example.prueba.Clases;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Usuario {

    @SerializedName("CED_USU")
    @Expose
    private String cedUsu;
    @SerializedName("NOM_USU")
    @Expose
    private String nomUsu;
    @SerializedName("APE_USU")
    @Expose
    private String apeUsu;

    public String getCedUsu() {
        return cedUsu;
    }

    public void setCedUsu(String cedUsu) {
        this.cedUsu = cedUsu;
    }

    public String getNomUsu() {
        return nomUsu;
    }

    public void setNomUsu(String nomUsu) {
        this.nomUsu = nomUsu;
    }

    public String getApeUsu() {
        return apeUsu;
    }

    public void setApeUsu(String apeUsu) {
        this.apeUsu = apeUsu;
    }

}
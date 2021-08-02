package com.example.prueba.Clases;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DetalleValidacion {

    @SerializedName("ID_VAL_DET")
    @Expose
    private String idValDet;
    @SerializedName("ID_ACT")
    @Expose
    private String idAct;
    @SerializedName("NOM_ACT")
    @Expose
    private String nomAct;
    @SerializedName("CED_USU_PER")
    @Expose
    private String cedUsuPer;
    @SerializedName("OBS_ACT")
    @Expose
    private String obsAct;
    @SerializedName("NOM_USU")
    @Expose
    private String nomUsu;
    @SerializedName("APE_USU")
    @Expose
    private String apeUsu;

    public String getIdValDet() {
        return idValDet;
    }

    public void setIdValDet(String idValDet) {
        this.idValDet = idValDet;
    }

    public String getIdAct() {
        return idAct;
    }

    public void setIdAct(String idAct) {
        this.idAct = idAct;
    }

    public String getNomAct() {
        return nomAct;
    }

    public void setNomAct(String nomAct) {
        this.nomAct = nomAct;
    }

    public String getCedUsuPer() {
        return cedUsuPer;
    }

    public void setCedUsuPer(String cedUsuPer) {
        this.cedUsuPer = cedUsuPer;
    }

    public String getObsAct() {
        return obsAct;
    }

    public void setObsAct(String obsAct) {
        this.obsAct = obsAct;
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
    @Override
    public String toString(){
        return "ACT-00-"+this.idAct+"-"+this.nomAct+" - "+this.nomUsu+" "+this.apeUsu+" "+this.obsAct;
    }

}
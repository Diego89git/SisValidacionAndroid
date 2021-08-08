
package com.example.prueba.Clases;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Validacion {

    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("NOM_VAL")
    @Expose
    private String nomVal;
    @SerializedName("DES_VAL")
    @Expose
    private String desVal;
    @SerializedName("FEC_CRE_VAL")
    @Expose
    private String fecCreVal;
    @SerializedName("FEC_ACT_VAL")
    @Expose
    private String fecActVal;
    @SerializedName("ID_USU_CVAL")
    @Expose
    private String idUsuCval;
    @SerializedName("ID_USU_AVAL")
    @Expose
    private String idUsuAval;
    @SerializedName("EST_VAL")
    @Expose
    private String estVal;
    @SerializedName("OBS_VAL")
    @Expose
    private String obsVal;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomVal() {
        return nomVal;
    }

    public void setNomVal(String nomVal) {
        this.nomVal = nomVal;
    }

    public String getDesVal() {
        return desVal;
    }

    public void setDesVal(String desVal) {
        this.desVal = desVal;
    }

    public String getFecCreVal() {
        return fecCreVal;
    }

    public void setFecCreVal(String fecCreVal) {
        this.fecCreVal = fecCreVal;
    }

    public String getFecActVal() {
        return fecActVal;
    }

    public void setFecActVal(String fecActVal) {
        this.fecActVal = fecActVal;
    }

    public String getIdUsuCval() {
        return idUsuCval;
    }

    public void setIdUsuCval(String idUsuCval) {
        this.idUsuCval = idUsuCval;
    }

    public String getIdUsuAval() {
        return idUsuAval;
    }

    public void setIdUsuAval(String idUsuAval) {
        this.idUsuAval = idUsuAval;
    }

    public String getEstVal() {
        return estVal;
    }

    public void setEstVal(String estVal) {
        this.estVal = estVal;
    }

    public String getObsVal() {
        return obsVal;
    }

    public void setObsVal(String obsVal) {
        this.obsVal = obsVal;
    }

    @Override
    public String toString (){
        return getNomVal()+":"+getFecCreVal();
    }
}
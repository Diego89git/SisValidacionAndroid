
package com.example.prueba.Clases;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Validacion {

    @SerializedName("ID_VAL")
    @Expose
    private String idVal;
    @SerializedName("OBS_VAL")
    @Expose
    private String obsVal;
    @SerializedName("FEC_VAL")
    @Expose
    private String fecVal;
    @SerializedName("EST_VAL")
    @Expose
    private String estVal;

    public String getIdVal() {
        return idVal;
    }

    public void setIdVal(String idVal) {
        this.idVal = idVal;
    }

    public String getObsVal() {
        return obsVal;
    }

    public void setObsVal(String obsVal) {
        this.obsVal = obsVal;
    }

    public String getFecVal() {
        return fecVal;
    }

    public void setFecVal(String fecVal) {
        this.fecVal = fecVal;
    }

    public String getEstVal() {
        return estVal;
    }

    public void setEstVal(String estVal) {
        this.estVal = estVal;
    }
    @Override
    public String toString(){
        return "Validacion 000-"+this.idVal+" creada el:"+this.fecVal;
    }

}
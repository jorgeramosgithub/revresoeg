package com.ejcsoft.puntos.model;

/**
 * Created by Magda on 12/12/2016.
 */
public class Punto {
    double longitud;
    double latitud;

    public Punto(String latitud, String longitud) {
        this.latitud =  Double.parseDouble(latitud);
        this.longitud = Double.parseDouble(longitud);
    }

    public double getLongitud() {
        return longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}

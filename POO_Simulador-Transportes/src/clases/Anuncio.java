package clases;

import java.util.Random;

public class Anuncio {

    private String descripcion;
    private int duracionAnuncio;
    private double pesoPaquete;
    private int distanciaEnKm;
    private String medioTransporte;
    private boolean servicioEspecial;
    private boolean nextDay;
    
    private Random random;

    public Anuncio(String descripcion, double pesoPaquete, int distanciaEnKm, String medioTransporte, boolean servicioEspecial, boolean nextDay) {
        int tiempoRandom = (int)(Math.random() * 90 );
        duracionAnuncio = tiempoRandom;
        this.descripcion = descripcion;
        this.pesoPaquete = pesoPaquete;
        this.distanciaEnKm = distanciaEnKm;
        this.medioTransporte = medioTransporte;
        this.servicioEspecial = servicioEspecial;
        this.nextDay = nextDay;
    }

    public int getDuracionAnuncio() {
        return this.duracionAnuncio;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public double getPesoPaquete() {
        return this.pesoPaquete;
    }

    public int getDistanciaEnKm() {
        return this.distanciaEnKm;
    }

    public boolean getServicioEspecial() {
        return this.servicioEspecial;
    }

    public boolean getNextDay() {
        return this.nextDay;
    }
    
    public String getMedioTransporte(){
        return this.medioTransporte;
    }
    
    public void reducirDuracion(){
        this.duracionAnuncio -= 1;
    }
    
    @Override
    public String toString(){
        String res = " Descripcion: " + this.descripcion + "\n Peso del paquete: " + this.pesoPaquete+ "\n Distancia en Km: " + this.distanciaEnKm +
                            "\n Medio de transporte: " + this.medioTransporte  + "\n Servicio especial: " + this.servicioEspecial + "\n Next day: " + this.nextDay;
        return res;
    }

}
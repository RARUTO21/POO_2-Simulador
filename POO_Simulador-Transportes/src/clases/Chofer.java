package clases;

import java.util.ArrayList;

public class Chofer {

    private String nombre;    
    private ArrayList<Boolean> licencias;
    
    public Chofer(String nombre, int indiceLicencia) {
        
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

  
    public void agregarLicencia(int indiceLicencia) {
        licencias.add(indiceLicencia,true);
    }

    
    public ArrayList<Boolean> obtenerLicencias() {
        return this.licencias;
    }

}
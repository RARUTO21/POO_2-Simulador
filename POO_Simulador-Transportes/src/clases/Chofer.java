package clases;

import java.util.ArrayList;

public class Chofer {

    private String nombre;    
    private ArrayList<Boolean> licencias;
    
    public Chofer(String nombre, int indiceLicencia) {
        licencias = new ArrayList();
        for (int i = 0; i < 6 ; i++){
            if (i == indiceLicencia){
                 licencias.add(true);

            }else{
                 licencias.add(false);
            }
            
        }
        this.nombre = nombre;        
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

  
    public void agregarLicencia(int indiceLicencia) {
        licencias.set(indiceLicencia,true);
    }

    
    public ArrayList<Boolean> obtenerLicencias() {
        return this.licencias;
    }

}
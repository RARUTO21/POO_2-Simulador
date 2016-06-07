package clases;
/**
 * 
 */
public abstract class Vehiculo {
    protected double capacidadCargaDisponible;
    protected int vidaUtil;
    private final String id;
    private static int contadorID;
    
    private final int maxVidaUtil;
    
    
    public Vehiculo(int vidaUtil, String id, double capacidadCargaDisponible) {
        
        this.capacidadCargaDisponible = capacidadCargaDisponible;
        this.vidaUtil = vidaUtil;
        this.id = id + Integer.toString(contadorID);
        contadorID++;
        
        this.maxVidaUtil = vidaUtil;
    }
    
    public String getID() {
        return id;
    }

    public double getCapacidadCargaDisponibles() {
        return capacidadCargaDisponible;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    abstract public double calcularLitrosCombustibleXKm(int cantKm);
    
    abstract public void reparar();
    
    public void darMantenimiento(){
        this.vidaUtil = this.maxVidaUtil;
    }
    
    

}
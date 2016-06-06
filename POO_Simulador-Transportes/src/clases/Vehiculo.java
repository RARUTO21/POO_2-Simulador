package clases;
/**
 * 
 */
public abstract class Vehiculo {
    protected double capacidadCargaDisponible;
    protected int vidaUtil;
    private String id;
    private static int contadorID;
    
    

    /**
     * Constructor
     * @param String id 
     * @param int usosRestantes
     */
    public Vehiculo(int vidaUtil, String id) {
        this.vidaUtil = vidaUtil;
        this.id = id;
        // TODO implement here
        
    }
    
    /**
     * @return
     */
    public String getID() {
        // TODO implement here
        return id;
    }

    /**
     * @return
     */
    public double getCapacidadCargaDisponibles() {
        // TODO implement here
        return capacidadCargaDisponible;
    }

    

    /**
     * @return vidaUtil
     */
    public int getVidaUtil() {
        // TODO implement here
        return vidaUtil;
    }

    /**
     * @param int cantKm 
     * @return
     */
    abstract public double calcularLitrosCombustibleXKm(int cantKm);
    

}

import java.util.*;

/**
 * 
 */
public class Vehiculo {

    /**
     * Default constructor
     */
    public Vehiculo() {
    }

    /**
     * 
     */
    protected double capacidadCargaDisponible;

    /**
     * 
     */
    protected int vidaUtil;

    /**
     * 
     */
    private string id;

    /**
     * 
     */
    private int <<static>> contadorID;


    /**
     * @param String id 
     * @param int usosRestantes
     */
    public void Vehiculo(void String id, void int usosRestantes) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getID() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public double getCapacidadCargaDisponibles() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @return
     */
    public String getTipoVehiculo() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public int getVidaUtil() {
        // TODO implement here
        return 0;
    }

    /**
     * @param int cantKm 
     * @return
     */
    protected double <<abstract>> calcularLitrosCombustibleXKm(void int cantKm) {
        // TODO implement here
        return null;
    }

}
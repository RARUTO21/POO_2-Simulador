package clases;

/**
 * 
 */
public class Avion extends Vehiculo {

    public Avion() {
        super(5,"AVN",120000.0);
    }

    @Override
    public double calcularLitrosCombustibleXKm(int cantKm) {
        // TODO implement here
        return cantKm*12.34;
    }
    


}
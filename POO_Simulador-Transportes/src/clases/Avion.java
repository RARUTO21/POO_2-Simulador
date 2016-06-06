package clases;

/**
 * 
 */
public class Avion extends Vehiculo {

    public Avion() {
        super(5,"AVN");
    }

    @Override
    public double calcularLitrosCombustibleXKm(int cantKm) {
        // TODO implement here
        return cantKm*12.34;
    }

}
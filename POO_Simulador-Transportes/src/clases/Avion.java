package clases;

/**
 * 
 */
public class Avion extends Vehiculo {

    public Avion() {
        super(5,"AVN",1500.0);
    }

    @Override
    public double calcularLitrosCombustibleXKm(int cantKm) {
        // TODO implement here
        return cantKm*12.34;
    }
    


}
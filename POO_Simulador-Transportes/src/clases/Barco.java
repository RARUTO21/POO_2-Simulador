package clases;

public class Barco extends Vehiculo {

    /**
     * Default constructor
     */
    public Barco() {
        super(30,"BRC");
    }
    
    @Override
    public double calcularLitrosCombustibleXKm(int cantKm) {

        return cantKm*9.06;
    }

}
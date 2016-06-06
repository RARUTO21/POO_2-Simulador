package clases;



public class Ferry extends Vehiculo {

    public Ferry() {
        super(25,"FRY");
    }

    @Override
    public double calcularLitrosCombustibleXKm(int cantKm) {
        return 0.0d;
    }

}
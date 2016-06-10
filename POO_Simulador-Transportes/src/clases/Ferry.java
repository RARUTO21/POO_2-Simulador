package clases;



public class Ferry extends Vehiculo {

    public Ferry() {
        super(25,"FRY",802000.0);
        super.tipoVehiculo = "Marino";
    }

    @Override
    public double calcularLitrosCombustibleXKm(int cantKm) {
        return cantKm*10.61;
    }
    


}
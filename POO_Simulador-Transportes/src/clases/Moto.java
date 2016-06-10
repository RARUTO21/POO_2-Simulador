package clases;


public class Moto extends Vehiculo {

    public Moto() {
        super(20,"MOT",90.0);
        super.tipoVehiculo = "Terrestre";
    }

    @Override
    public double calcularLitrosCombustibleXKm(int cantKm) {
        return cantKm*1.4;
    }


}
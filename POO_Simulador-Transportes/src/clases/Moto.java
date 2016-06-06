package clases;


public class Moto extends Vehiculo {

    public Moto() {
        super(20,"MOT");
    }

    @Override
    public double calcularLitrosCombustibleXKm(int cantKm) {
        return 0.0d;
    }

}
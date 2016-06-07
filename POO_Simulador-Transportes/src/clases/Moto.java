package clases;


public class Moto extends Vehiculo {

    public Moto() {
        super(20,"MOT",90.0);
    }

    @Override
    public double calcularLitrosCombustibleXKm(int cantKm) {
        return cantKm*1.4;
    }
    
    @Override
    public void reparar(){
        super.vidaUtil = (int) super.vidaUtil / 5;
    }

}
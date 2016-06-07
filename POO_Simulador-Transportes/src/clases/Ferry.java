package clases;



public class Ferry extends Vehiculo {

    public Ferry() {
        super(25,"FRY",802000.0);
    }

    @Override
    public double calcularLitrosCombustibleXKm(int cantKm) {
        return cantKm*10.61;
    }
    
    @Override
    public void reparar(){
        super.vidaUtil = (int) super.vidaUtil / 5;
    }

}
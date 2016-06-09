package clases;



/**
 * 
 */
public class Carro extends Vehiculo {

    /**
     * Default constructor
     */
    
    public Carro() {
        super(40,"CAR",530.0);
        super.tipoVehiculo = "Terrestre";
    }

    /**
     * @param  cantKm 
     * @return
     */
    @Override
    public double calcularLitrosCombustibleXKm(int cantKm) {
        // TODO implement here
        return cantKm*3.9;
    }


}
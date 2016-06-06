package clases;


import java.util.*;

public class Empresa {
    private Empresa instance;
    private double fondos;
    private double precioXLitroCombustible;
    private double gastos;
    private double ganancias;
    private ArrayList <Vehiculo> vehiculos;
    private ArrayList <Chofer> choferes;
    private ArrayList <Anuncio> anuncios; 


   
    private Empresa() {
        // TODO implement here
    }

    /**
     * @return
     */
    public Empresa getInstance() {
        // TODO implement here
        if(instance == null){
            instance = new Empresa();
        }
        return instance;
    }

    /**
     * @param String nombre 
     * @param String tipoLicencia 
     * @return
     */
    public void contratarChofer( String nombre,  String tipoLicencia) {
        // TODO implement here
    }

    /**
     * @param Chofer chofer 
     * @param String tipoLicencia 
     * @return
     */
    public void capacitarChofer(Chofer chofer, String tipoLicencia) {
        // TODO implement here
    }

    /**
     * @return
     */
    public ArrayList<Chofer> getChoferes() {
        // TODO implement here
        return choferes;
    }

    /**
     * @return
     */
    public ArrayList<Vehiculo> getVehiculos() {
        // TODO implement here
        return vehiculos;
    }

    /**
     * @return
     */
    public ArrayList<Anuncio> getAnuncios() {
        // TODO implement here
        return anuncios;
    }

    public void darMantenimientoAVehiculo(Vehiculo vehiculo, double precio) {
        
    }

    /**
     * @param Vehiculo vehiculo 
     * @param double precio 
     * @return
     */
    public void comprarVehiculo(Vehiculo vehiculo, double precio) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void generarAnuncio() {
        // TODO implement here
    }

    /**
     * @param Anuncio anuncio 
     * @return
     */
    public void eliminarAnuncio( Anuncio anuncio) {
        // TODO implement here
    }

    /**
     * @return
     */
    public double getFondos() {
        // TODO implement here
        return fondos;
    }

    /**
     * @return
     */
    public double getPrecioXLitroCombustible() {
        // TODO implement here
        return precioXLitroCombustible;
    }

    /**
     * @param double precio 
     * @return
     */
    public void setPrecioXLitroCombustible( double precio) {
        // TODO implement here
    }

    /**
     * @param Chofer chofer 
     * @param Vehiculo vehiculo 
     * @param Anuncio anuncio 
     * @return
     */
    public void estimarCostosDeTransporte( Chofer chofer, Vehiculo vehiculo, Anuncio anuncio) {
        // TODO implement here
    }

    /**
     * @param Chofer chofer 
     * @param Vehiculo vehiculo 
     * @param Anuncio anuncio 
     * @return
     */
    public void realizarTransporte(Chofer chofer,Vehiculo vehiculo, Anuncio anuncio) {
        // TODO implement here
    }

    /**
     * @param double gastos 
     * @return
     */
    public void setGastos( double gastos) {
        // TODO implement here
    }

    /**
     * @param double ganancias 
     * @return
     */
    public void setGanancias(double ganancias) {
        // TODO implement here
    }

    /**
     * @return
     */
    public double getGastos() {
        // TODO implement here
        return gastos;
    }

    /**
     * @return
     */
    public double getGanancias() {
        // TODO implement here
        return ganancias;
    }

}
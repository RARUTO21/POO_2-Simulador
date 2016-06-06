package clases;


import java.util.*;


/**
 * 
 */
public class Empresa {
    private double fondos;
    private double precioXLitroCombustible;
    private double gastos;
    private double ganancias;
    private ArrayList <Vehiculo> vehiculos;
    private ArrayList <Chofer> choferes;
    private ArrayList <Anuncio> anuncio; 


    /**
     * Default constructor
     */
    public Empresa() {
    }

   
    /**
     * 
     */
     
    private void Empresa() {
        // TODO implement here
    }

    /**
     * @return
     */
    public Empresa getInstance() {
        // TODO implement here
        return null;
    }

    /**
     * @param String nombre 
     * @param String tipoLicencia 
     * @return
     */
    public void contratarChofer( String nombre,  String tipoLicencia) {
        // TODO implement here
        return null;
    }

    /**
     * @param Chofer chofer 
     * @param String tipoLicencia 
     * @return
     */
    public void capacitarChofer(Chofer chofer, String tipoLicencia) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ArrayList<Chofer> getChoferes() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ArrayList<Vehiculo> getVehiculos() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ArrayList<Anuncio> getAnuncios() {
        // TODO implement here
        return null;
    }

    /**
     * @param Vehiculo vehiculo 
     * @param double precio 
     * @return
     */
    public void darMantenimientoAVehiculo(Vehiculo vehiculo, double precio) {
        // TODO implement here
        return null;
    }

    /**
     * @param Vehiculo vehiculo 
     * @param double precio 
     * @return
     */
    public void repararVehiculo(Vehiculo vehiculo, double precio) {
        // TODO implement here
        return null;
    }

    /**
     * @param Vehiculo vehiculo 
     * @param double precio 
     * @return
     */
    public void comprarVehiculo(Vehiculo vehiculo, double precio) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void generarAnuncio() {
        // TODO implement here
        return null;
    }

    /**
     * @param Anuncio anuncio 
     * @return
     */
    public void eliminarAnuncio( Anuncio anuncio) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public double getFondos() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @return
     */
    public double getPrecioXLitroCombustible() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param double precio 
     * @return
     */
    public void setPrecioXLitroCombustible( double precio) {
        // TODO implement here
        return null;
    }

    /**
     * @param Chofer chofer 
     * @param Vehiculo vehiculo 
     * @param Anuncio anuncio 
     * @return
     */
    public void estimarCostosDeTransporte( Chofer chofer, Vehiculo vehiculo, Anuncio anuncio) {
        // TODO implement here
        return null;
    }

    /**
     * @param Chofer chofer 
     * @param Vehiculo vehiculo 
     * @param Anuncio anuncio 
     * @return
     */
    public void realizarTransporte(Chofer chofer,Vehiculo vehiculo, Anuncio anuncio) {
        // TODO implement here
        return null;
    }

    /**
     * @param double gastos 
     * @return
     */
    public void setGastos( double gastos) {
        // TODO implement here
        return null;
    }

    /**
     * @param double ganancias 
     * @return
     */
    public void setGanancias(double ganancias) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public double getGastos() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @return
     */
    public double getGanancias() {
        // TODO implement here
        return 0.0d;
    }

}
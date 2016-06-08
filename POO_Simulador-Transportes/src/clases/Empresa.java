package clases;

import java.util.*;

public class Empresa {

    private static Empresa instance;
    private double fondos;
    private double precioXLitroCombustible;
    private double gastos;
    private double ganancias;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Chofer> choferes;
    private ArrayList<Anuncio> anuncios;

    private Empresa() {
        // TODO implement here
        gastos = 0;
        ganancias = 0;

        vehiculos = new ArrayList();
        choferes = new ArrayList();
        anuncios = new ArrayList();
        
        // para pruebas ----> eliminar luego
        vehiculos.add(new Carro());
        fondos+=1000;
        
        //

    }

    public static Empresa getInstance() {
        if (instance == null) {
            instance = new Empresa();
        }
        return instance;
    }

    public void contratarChofer(String nombre, int tipoLicencia, double costoContratacion) {
        // TODO implement here

        choferes.add(new Chofer(nombre, tipoLicencia));
        gastos += costoContratacion;
        fondos -= costoContratacion;

    }

    public void capacitarChofer(Chofer chofer, int tipoLicencia) {
        // TODO implement here
        choferes.get(choferes.indexOf(chofer)).agregarLicencia(tipoLicencia);
    }

    public ArrayList<Chofer> getChoferes() {
        // TODO implement here
        return choferes;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        // TODO implement here
        return vehiculos;
    }

    public ArrayList<Anuncio> getAnuncios() {
        // TODO implement here
        return anuncios;
    }

    public void darMantenimientoAVehiculo(int vehiculo, double precio) throws Exception {

        fondos -= precio;
        gastos += precio;
        vehiculos.get(vehiculo).darMantenimiento();

    }

    public void comprarVehiculo(Vehiculo vehiculo, double precio) throws Exception {
        // TODO implement here
        fondos -= precio;
        vehiculos.add(vehiculo);

    }

    public void repararVehiculo(double costoReparacion) {
        fondos -= costoReparacion;
        gastos += costoReparacion;
    }

    public void generarAnuncio() {
        // TODO implement here

        //Establecer parámetros random
    }

    public void eliminarAnuncio(Anuncio anuncio) {
        // TODO implement here
        anuncios.remove(anuncio);
    }

    public double getFondos() {
        // TODO implement here
        return fondos;
    }

    public void setFondos(double fondos) {
        this.fondos = fondos;
    }

    public double getPrecioXLitroCombustible() {
        // TODO implement here
        return precioXLitroCombustible;
    }

    public void setPrecioXLitroCombustible(double precio) {
        // TODO implement here
        this.precioXLitroCombustible = precio;
    }

    public void estimarCostosDeTransporte(Chofer chofer, Vehiculo vehiculo, Anuncio anuncio) throws Exception {
        // TODO implement here

        //FALTA
    }

    public void realizarTransporte(Chofer chofer, Vehiculo vehiculo, Anuncio anuncio) {
        //FALTA
    }

    public void setGastos(double gastos) {
        // TODO implement here
        this.gastos = gastos;
    }

    public void setGanancias(double ganancias) {
        // TODO implement here
        this.ganancias = ganancias;
    }

    public double getGastos() {
        // TODO implement here
        return gastos;
    }

    public double getGanancias() {
        // TODO implement here
        return ganancias;
    }

}

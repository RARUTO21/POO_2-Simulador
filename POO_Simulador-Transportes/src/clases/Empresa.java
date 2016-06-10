package clases;

import java.util.*;
import java.util.Random;


public class Empresa {

    private static Empresa instance;
    private double fondos = 100;
    private double precioXLitroCombustible;
    private double gastos;
    private double ganancias;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Chofer> choferes;
    private ArrayList<Anuncio> anuncios;
    private ArrayList<Double> costoCapacitacion;

    private Empresa() {
        // TODO implement here
        gastos = 0;
        ganancias = 0;

        vehiculos = new ArrayList();
        choferes = new ArrayList();
        anuncios = new ArrayList();
        
        costoCapacitacion = new ArrayList();
        
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

   
    public void contratarChofer( String nombre,  int tipoLicencia, double costoContratacion) {
        // TODO implement here

        choferes.add(new Chofer(nombre, tipoLicencia));
        gastos += costoContratacion;
        fondos -= costoContratacion;

    }

    public void capacitarChofer(int chofer, int tipoLicencia, double costo) {
        fondos -= costo;
        gastos += costo; 
        
        choferes.get(chofer).agregarLicencia(tipoLicencia);
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
        gastos += precio; 

    }

    public void repararVehiculo(double costoReparacion) {
        fondos -= costoReparacion;
        gastos += costoReparacion;
    }

    public void generarAnuncio() {
        // TODO implement here
        
        String[] medioTransporte = {"Aéreo","Marino","Terrestre"};
        
        String[] descripciones = {"Necesito ayuda con mi paquete","¿Alguien que sea tan amable de entregar este paquete por mí?","Psss, ¿quiere ganarse una harinilla miher?","Esto se va a D Esc Ctrl Alt... Ayyyyy, F1"};
        
        int index = (int)(Math.random() * 3);
        
        System.out.println("Medio de transporte generado: "+ medioTransporte[index]);
        
        String medioRandom = medioTransporte[index];
        
        index = (int)(Math.random() * 4);
        
        String descripcion = descripciones[index];
        
        System.out.println("Descripción generada: "+ descripciones[index]);
        
        int distanciaEnKm = (int)(Math.random() * 120);

        double pesoPaquete;
        
        switch(medioRandom){
            case "Aéreo":{
                pesoPaquete =  Math.random() * 120000;
                anuncios.add(new Anuncio(descripcion,pesoPaquete,distanciaEnKm,medioRandom,(new Random()).nextBoolean(),(new Random()).nextBoolean()));
                break;
            }
            
            case "Marino":{
                pesoPaquete = Math.random() * 1000000;
                anuncios.add(new Anuncio(descripcion,pesoPaquete,distanciaEnKm,medioRandom,(new Random()).nextBoolean(),(new Random()).nextBoolean()));
                break;
            }
            
            case "Terrestre":{
                pesoPaquete = Math.random() * 750;
                anuncios.add(new Anuncio(descripcion,pesoPaquete,distanciaEnKm,medioRandom,(new Random()).nextBoolean(),(new Random()).nextBoolean()));
                break;
            }
        }
    
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

    public ArrayList<Double> estimarCostosDeTransporte(Chofer chofer, Vehiculo vehiculo, Anuncio anuncio) throws Exception {
        // TODO implement here
        
        ArrayList<Double> datos = new ArrayList();
     
        Double gastosTemp = vehiculo.calcularLitrosCombustibleXKm(anuncio.getDistanciaEnKm()) * this.getPrecioXLitroCombustible();
        
        Double  gananciasTemp = gastosTemp + (gastosTemp * 0.2);
        
        if(anuncio.getServicioEspecial()){
            gananciasTemp += (gananciasTemp *0.15);
        }
        
        if(anuncio.getNextDay()){
            gananciasTemp += (gananciasTemp *0.3);
        }
        
        datos.add(gastosTemp);
        datos.add(gananciasTemp);
        
        return datos;
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
    
    public ArrayList<Double> getCostoCapacitacion() {
        return costoCapacitacion;
    }

    public void setCostoCapacitacion(ArrayList<Double> costoCapacitacion) {
        this.costoCapacitacion = costoCapacitacion;
    }

}

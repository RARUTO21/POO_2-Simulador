package clases;

import java.util.*;
import java.util.Random;


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

   
    public void contratarChofer( String nombre,  int tipoLicencia, double costoContratacion) {
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
        
        String[] medioTransporte = {"Aire","Mar","Tierra"};
        
        String[] descripciones = {"Necesito ayuda con mi paquete","¿Alguien que sea tan amable de entregar este paquete por mí?","Psss, ¿quiere ganarse una harinilla miher?","Esto se va a D Esc Ctrl Alt... Ayyyyy, F1"};
        
        Random generadorRandom = null;
        int index = (int)(Math.random() * 3);//generadorRandom.nextInt(4)-1;
        System.out.println("Medio de transporte generado: "+ medioTransporte[index]);
        String medioRandom = medioTransporte[index];
        
        index = (int)(Math.random() * 4);//generadorRandom.nextInt(descripciones.length);
        String descripcion = descripciones[index];
        System.out.println("Descripción generada: "+ descripciones[index]);
        
        int distanciaEnKm = (int)(Math.random() * 120);//generadorRandom.nextInt((120 - 30) + 1) + 30;
        
        //boolean servicioEspecial = generadorRandom.nextBoolean();
        
        //boolean nextDay = generadorRandom.nextBoolean();
        
        //Random trueOrFalse = null;
        
        
        
        double pesoPaquete;
        
        switch(medioRandom){
            case "Aire":{
                //int valor = generadorRandom.nextInt((120000 - 1200) + 1) + 1200;
                pesoPaquete =  Math.random() * 120000;//(double) generadorRandom.nextInt((120000 - 0) + 1) + 0;
                anuncios.add(new Anuncio(descripcion,pesoPaquete,distanciaEnKm,medioRandom,(new Random()).nextBoolean(),(new Random()).nextBoolean()));
                break;
            }
            
            case "Mar":{
                pesoPaquete = Math.random() * 1000000;//(double) generadorRandom.nextInt((1000000 - 0) + 1) + 0;
                anuncios.add(new Anuncio(descripcion,pesoPaquete,distanciaEnKm,medioRandom,(new Random()).nextBoolean(),(new Random()).nextBoolean()));
                break;
            }
            
            case "Tierra":{
                pesoPaquete = Math.random() * 750;//(double) generadorRandom.nextInt((750 - 0) + 1) + 0;
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

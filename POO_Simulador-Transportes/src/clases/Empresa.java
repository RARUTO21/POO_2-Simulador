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
        gastos = 0;
        ganancias = 0;
        
        vehiculos = new ArrayList();
        choferes = new ArrayList();
        anuncios = new ArrayList();
        
    }

    public Empresa getInstance() {
        if(instance == null){
            instance = new Empresa();
        }
        return instance;
    }

   
    public void contratarChofer( String nombre,  int tipoLicencia) {
        // TODO implement here
       
        choferes.add(new Chofer(nombre,tipoLicencia));
        
        /*switch(tipoLicencia){//Podría ser que tipoLicencia venga de una vez de tipo int [0,6[ , y asi no habría q hacer un switch
           case "Moto":{
               choferes.add(new Chofer(nombre,0));
               break;
           }
           case "Carro":{
               choferes.add(new Chofer(nombre,1));
               break;
           }
           case "Barco":{
               choferes.add(new Chofer(nombre,2));
               break;
           }
           case "Helicóptero":{//Ojo, tiene tilde
               choferes.add(new Chofer(nombre,3));
               break;
           }
           case "Ferry":{
               choferes.add(new Chofer(nombre,4));
               break;
           }
           case "Avión":{//Ojo, tambien tiene tilde
               choferes.add(new Chofer(nombre,5));
               break;
           }
       }*/
       
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

    public void darMantenimientoAVehiculo(Vehiculo vehiculo, double precio)throws Exception {
        if(precio > fondos){
            throw new Exception("No alcanza el dinero para pagar el mantenimiento del vehículo.");
        }
        else{
            fondos -= precio;
            vehiculo.darMantenimiento();
        }
    }

    public void comprarVehiculo(Vehiculo vehiculo, double precio) throws Exception{
        // TODO implement here
        if(precio > fondos){
            throw new Exception("No alcanza el dinero para comprar este vehículo.");
        }
        else{
            fondos -= precio;
            vehiculos.add(vehiculo);
        }
    }


    public void generarAnuncio() {
        // TODO implement here
        
        //Establecer parámetros random
    }


    public void eliminarAnuncio( Anuncio anuncio) {
        // TODO implement here
        anuncios.remove(anuncio);
    }

    public double getFondos() {
        // TODO implement here
        return fondos;
    }
    
    public void setFondos(double fondos){
        this.fondos = fondos;
    }

    public double getPrecioXLitroCombustible() {
        // TODO implement here
        return precioXLitroCombustible;
    }

    public void setPrecioXLitroCombustible( double precio) {
        // TODO implement here
        this.precioXLitroCombustible = precio;
    }

    public void estimarCostosDeTransporte( Chofer chofer, Vehiculo vehiculo, Anuncio anuncio) throws Exception {
        // TODO implement here
        
        //FALTA
    }

    public void realizarTransporte(Chofer chofer,Vehiculo vehiculo, Anuncio anuncio) {
        //FALTA
    }

    public void setGastos( double gastos) {
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
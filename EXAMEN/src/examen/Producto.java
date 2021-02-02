package examen;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Producto implements Sujeto{
    private final List<Observer> observers = new ArrayList<>();
    private final String nombreProducto;
    private final String descripcionProducto;
    //Incluir la direccion de la imagen para crear un JFrame y visualizar el objeto
    private final Imagen fotoProducto;
    private final BigDecimal precioActual;
    private final BigDecimal precioSalida;
    private final int numeroPujas;
    private final Time finalizaPuja;
    private Observer observer;
    
    public Producto(String nombreProducto, String descripcionProducto, Imagen fotoProducto, BigDecimal precioActual, BigDecimal precioSalida, int numeroPujas, Time finalizaPuja){
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.fotoProducto = fotoProducto;
        this.precioActual = precioActual;
        this.precioSalida = precioSalida;
        this.numeroPujas = numeroPujas;
        this.finalizaPuja = finalizaPuja;
    }
    
    
    
    public void registrarUsuario(Observer observer){
        observers.add(observer);
        System.out.println(observer + " ha sido introducido en la subasta.");
    }
           
    public void eliminarUsuario(Observer observer){
        observers.remove(observer);
        System.out.println(observer + " ha sido eliminado de la subasta.");
    }
            
    public void setPuja(Observer observer, BigDecimal newPrecioActual){
        int compara = precioActual.compareTo(newPrecioActual);
        
        if(compara == -1){
            this.observer = observer;
            this.precioActual = newPrecioActual;
        }else{
            System.out.println(observer + " no puede realizar una oferta igual o menor a la actual.");
        }
    }
}

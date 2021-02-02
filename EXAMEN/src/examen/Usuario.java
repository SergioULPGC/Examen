package examen;

import java.math.BigDecimal;

public class Usuario implements Sujeto{
    private final String nombreUsuario;
    
    public Usuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }
    
    public void actualizar(Observer observer, String nombreProducto, BigDecimal precioActual){
        if(observer.toString().equals(nombreUsuario)){
            System.out.println("\n El usuario " + observer + " ha realizado una puja de " + precioActual + " por el producto " + nombreProducto);
        }
        
        if(!observer.toString().equals(nombreUsuario)){
            System.out.println("El usuario " + observer + "ha realizado una nueva puja de " + precioActual + " por el producto " + nombreProducto);
        }
    }
    
    public String toString(){
        return nombreUsuario;
    }

    @Override
    public void registrarUsuario(Observer observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarUsuario(Observer observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPuja(Observer observer, BigDecimal newBigDecimal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

package examen;

import java.math.BigDecimal;
import java.time.LocalTime;

public class EXAMEN {

    public static void main(String[] args) {
        Sujeto producto = new Producto("iPhone 12 64GB", "Se trata del ultimo modelo de SmarthPhone de la Marca Apple y cuenta con las mejores caracteristicas del mercado", imagen, new BigDecimal(1100), new BigDecimal(900), new int(8), LocalTime[2021,02,12]);
        Observer usuario1 = (Observer) new Usuario("Sergio");
        Observer usuario2 = (Observer) new Usuario("Pablo");
        Observer usuario3 = (Observer) new Usuario("Raquel");
        
        producto.registrarUsuario(usuario1);
        producto.registrarUsuario(usuario2);
        producto.registrarUsuario(usuario3);
        
        producto.setPuja(usuario3, new BigDecimal(950));
        producto.eliminarUsuario(usuario2);
        producto.setPuja(usuario1, new BigDecimal(1100));
        producto.setPuja(usuario3, new BigDecimal(1000));
    }
    
}

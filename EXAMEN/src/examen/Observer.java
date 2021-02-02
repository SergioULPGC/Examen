package examen;

import java.math.BigDecimal;

public interface Observer {
    public void actualizar(Observer observer, String nombreProducto, BigDecimal precioActual);
}

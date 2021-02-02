package examen;

import java.math.BigDecimal;

public interface Sujeto {
    public void registrarUsuario(Observer observer);
    public void eliminarUsuario(Observer observer);
    public void setPuja(Observer observer, BigDecimal newBigDecimal);
}

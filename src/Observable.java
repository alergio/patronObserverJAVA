import java.util.ArrayList;

public interface Observable {
    void agregar(Portal o);
    void quitar(Portal o);
    void notificar(String cambio);
}

import java.util.ArrayList;

public class CentralItinerarios implements Observable{

    private ArrayList<Vuelo> vuelos = new ArrayList<>();
    private ArrayList<Portal> portales = new ArrayList<>();

    public void agregarVuelo(Vuelo vuelo) {
        this.vuelos.add(vuelo);
        notificar("Se agrego el siguiente vuelo " + vuelo.getVuelo());
    }

    public void eliminarVuelo(Vuelo vuelo) {
        this.vuelos.remove(vuelo);
        notificar("Se removio el siguiente vuelo " + vuelo.getVuelo());
    }

    public void consultarVuelos(){
        System.out.println("Los vuelos disponibles actualmente son: ");
        for (Vuelo vuelo : vuelos) {
            System.out.println(vuelo.getVuelo());
        }
    }

    @Override
    public void agregar(Portal o) {
        this.portales.add(o);
    }

    @Override
    public void quitar(Portal o) {
        this.portales.remove(o);
    }

    @Override
    public void notificar(String cambio) {
        System.out.println(cambio);
        for (Observador observador : portales) {
            observador.actualizar(vuelos);
        }
    }
}

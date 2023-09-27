import java.util.ArrayList;

public class Portal implements Observador{
    private ArrayList<Vuelo> vuelos;

    public void consultarVuelos() {
        if (vuelos == null || vuelos.isEmpty()) {
            System.out.println("No hay vuelos disponibles.");
        } else {
            System.out.println("Los vuelos disponibles actualmente son: ");
            for (Vuelo vuelo : vuelos) {
                System.out.println(vuelo.getVuelo());
            }
        }
    }

    @Override
    public void actualizar(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
        System.out.println("Los vuelos han sido actualizados, ahora los disponibles son:");
        for (Vuelo vuelo : vuelos) {
            System.out.println(vuelo.getVuelo());
        }
    }
}

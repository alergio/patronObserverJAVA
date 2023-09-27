// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        CentralItinerarios central = new CentralItinerarios();
        Portal portal1 = new Portal();

        Vuelo vuelo1 = new Vuelo("Los Angeles - New York, 15:00 hs");
        Vuelo vuelo2 = new Vuelo("Buenos Aires - Jamaica, 18:00 hs");

        portal1.consultarVuelos();
        System.out.println("-----------------------");

        central.agregar(portal1);

        central.agregarVuelo(vuelo1);
        central.agregarVuelo(vuelo2);

        System.out.println("-----------------------");

        portal1.consultarVuelos();
    }
}
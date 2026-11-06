public class AppWeb {

    private final MapaSillas mapa = MapaSillas.getInstancia();

    public void comprar(Boleta boleta) {
        if (mapa.reservar(boleta.getSilla())) {
            System.out.println("  [App]      VENDIDA: " + boleta);
        } else {
            System.out.println("  [App]      RECHAZADA, silla ocupada: " + boleta.getSilla());
        }
    }
}

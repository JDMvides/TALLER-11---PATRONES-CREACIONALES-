public class TaquillaFisica {

    private final MapaSillas mapa = MapaSillas.getInstancia();

    public void vender(Boleta boleta) {
        if (mapa.reservar(boleta.getSilla())) {
            System.out.println("  [Taquilla] VENDIDA: " + boleta);
        } else {
            System.out.println("  [Taquilla] RECHAZADA, silla ocupada: " + boleta.getSilla());
        }
    }
}

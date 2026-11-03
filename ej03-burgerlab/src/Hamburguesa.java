public class Hamburguesa {

    private String proteina;          // obligatorio: res, pollo, veggie
    private int porciones;            // obligatorio: 1 a 3
    private String pan;               // opcional (por defecto: brioche)
    private boolean queso;
    private boolean tocineta;
    private boolean cebollaCaramelizada;
    private boolean pepinillos;
    private String salsa;             // opcional (por defecto: ninguna)
    private boolean papasAgrandadas;

    public Hamburguesa(String proteina, int porciones, String pan, boolean queso,
                       boolean tocineta, boolean cebollaCaramelizada, boolean pepinillos,
                       String salsa, boolean papasAgrandadas) {
        this.proteina = proteina;
        this.porciones = porciones;
        this.pan = pan;
        this.queso = queso;
        this.tocineta = tocineta;
        this.cebollaCaramelizada = cebollaCaramelizada;
        this.pepinillos = pepinillos;
        this.salsa = salsa;
        this.papasAgrandadas = papasAgrandadas;
    }

    @Override
    public String toString() {
        return "Hamburguesa de " + proteina + " x" + porciones
             + " | pan: " + pan
             + (queso ? " | queso" : "")
             + (tocineta ? " | tocineta" : "")
             + (cebollaCaramelizada ? " | cebolla caramelizada" : "")
             + (pepinillos ? " | pepinillos" : "")
             + " | salsa: " + salsa
             + (papasAgrandadas ? " | papas agrandadas" : "");
    }
}

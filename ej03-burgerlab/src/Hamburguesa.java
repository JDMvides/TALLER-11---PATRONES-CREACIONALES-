import java.util.Set;

public class Hamburguesa {

    private static final Set<String> PROTEINAS_VALIDAS = Set.of("res", "pollo", "veggie");

    private final String proteina;
    private final int porciones;
    private final String pan;
    private final boolean queso;
    private final boolean tocineta;
    private final boolean cebollaCaramelizada;
    private final boolean pepinillos;
    private final String salsa;
    private final boolean papasAgrandadas;

    private Hamburguesa(Builder builder) {
        if (builder.proteina == null || !PROTEINAS_VALIDAS.contains(builder.proteina)) {
            throw new IllegalArgumentException("Proteina no valida: " + builder.proteina);
        }
        if (builder.porciones < 1 || builder.porciones > 3) {
            throw new IllegalArgumentException("Las porciones deben estar entre 1 y 3");
        }

        this.proteina = builder.proteina;
        this.porciones = builder.porciones;
        this.pan = builder.pan == null || builder.pan.isBlank() ? "brioche" : builder.pan;
        this.queso = builder.queso;
        this.tocineta = builder.tocineta;
        this.cebollaCaramelizada = builder.cebollaCaramelizada;
        this.pepinillos = builder.pepinillos;
        this.salsa = builder.salsa == null || builder.salsa.isBlank() ? "ninguna" : builder.salsa;
        this.papasAgrandadas = builder.papasAgrandadas;
    }

    public static Builder builder(String proteina, int porciones) {
        return new Builder(proteina, porciones);
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

    public static class Builder {
        private final String proteina;
        private final int porciones;
        private String pan = "brioche";
        private boolean queso;
        private boolean tocineta;
        private boolean cebollaCaramelizada;
        private boolean pepinillos;
        private String salsa = "ninguna";
        private boolean papasAgrandadas;

        private Builder(String proteina, int porciones) {
            this.proteina = proteina;
            this.porciones = porciones;
        }

        public Builder pan(String pan) {
            this.pan = pan;
            return this;
        }

        public Builder conQueso(boolean queso) {
            this.queso = queso;
            return this;
        }

        public Builder conTocineta(boolean tocineta) {
            this.tocineta = tocineta;
            return this;
        }

        public Builder conCebollaCaramelizada(boolean cebollaCaramelizada) {
            this.cebollaCaramelizada = cebollaCaramelizada;
            return this;
        }

        public Builder conPepinillos(boolean pepinillos) {
            this.pepinillos = pepinillos;
            return this;
        }

        public Builder salsa(String salsa) {
            this.salsa = salsa;
            return this;
        }

        public Builder conPapasAgrandadas(boolean papasAgrandadas) {
            this.papasAgrandadas = papasAgrandadas;
            return this;
        }

        public Hamburguesa build() {
            return new Hamburguesa(this);
        }
    }
}

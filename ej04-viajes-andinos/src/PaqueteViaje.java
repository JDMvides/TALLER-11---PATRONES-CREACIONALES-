public class PaqueteViaje {

    private final String destino;
    private final int noches;
    private final boolean vuelo;
    private final String hotel;
    private final boolean desayuno;
    private final String tour;
    private final boolean seguroViaje;

    private PaqueteViaje(Builder builder) {
        if (builder.destino == null || builder.destino.isBlank()) {
            throw new IllegalArgumentException("El destino es obligatorio");
        }
        if (builder.noches < 1) {
            throw new IllegalArgumentException("El paquete debe incluir al menos una noche");
        }

        this.destino = builder.destino;
        this.noches = builder.noches;
        this.vuelo = builder.vuelo;
        this.hotel = builder.hotel;
        this.desayuno = builder.desayuno;
        this.tour = builder.tour;
        this.seguroViaje = builder.seguroViaje;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return destino + " (" + noches + " noches)"
             + (vuelo ? " + vuelo" : "")
             + (hotel != null ? " + hotel " + hotel : "")
             + (desayuno ? " + desayuno" : "")
             + (tour != null ? " + tour " + tour : "")
             + (seguroViaje ? " + seguro" : "");
    }

    public static class Builder {
        private String destino;
        private int noches;
        private boolean vuelo;
        private String hotel;
        private boolean desayuno;
        private String tour;
        private boolean seguroViaje;

        private Builder() { }

        public Builder destino(String destino) {
            this.destino = destino;
            return this;
        }

        public Builder noches(int noches) {
            this.noches = noches;
            return this;
        }

        public Builder vuelo(boolean vuelo) {
            this.vuelo = vuelo;
            return this;
        }

        public Builder hotel(String hotel) {
            this.hotel = hotel;
            return this;
        }

        public Builder desayuno(boolean desayuno) {
            this.desayuno = desayuno;
            return this;
        }

        public Builder tour(String tour) {
            this.tour = tour;
            return this;
        }

        public Builder seguroViaje(boolean seguroViaje) {
            this.seguroViaje = seguroViaje;
            return this;
        }

        public PaqueteViaje build() {
            return new PaqueteViaje(this);
        }
    }
}

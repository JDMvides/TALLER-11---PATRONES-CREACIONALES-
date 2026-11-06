public class Boleta {

    private final String pelicula;
    private final String silla;
    private final boolean es3D;
    private final boolean sillaVip;
    private final String combo;
    private final boolean estudiante;

    private Boleta(Builder builder) {
        if (builder.pelicula == null || builder.pelicula.isBlank()) {
            throw new IllegalArgumentException("La pelicula es obligatoria");
        }
        if (builder.silla == null || builder.silla.isBlank()) {
            throw new IllegalArgumentException("La silla es obligatoria");
        }

        this.pelicula = builder.pelicula;
        this.silla = builder.silla;
        this.es3D = builder.es3D;
        this.sillaVip = builder.sillaVip;
        this.combo = builder.combo;
        this.estudiante = builder.estudiante;
    }

    public static Builder builder(String pelicula, String silla) {
        return new Builder(pelicula, silla);
    }

    public String getSilla() {
        return silla;
    }

    @Override
    public String toString() {
        return pelicula + " | silla " + silla
             + (es3D ? " | 3D" : "")
             + (sillaVip ? " | VIP" : "")
             + (combo != null ? " | combo " + combo : "")
             + (estudiante ? " | tarifa estudiante" : "");
    }

    public static class Builder {
        private final String pelicula;
        private final String silla;
        private boolean es3D;
        private boolean sillaVip;
        private String combo;
        private boolean estudiante;

        private Builder(String pelicula, String silla) {
            this.pelicula = pelicula;
            this.silla = silla;
        }

        public Builder es3D(boolean es3D) {
            this.es3D = es3D;
            return this;
        }

        public Builder sillaVip(boolean sillaVip) {
            this.sillaVip = sillaVip;
            return this;
        }

        public Builder combo(String combo) {
            this.combo = combo;
            return this;
        }

        public Builder estudiante(boolean estudiante) {
            this.estudiante = estudiante;
            return this;
        }

        public Boleta build() {
            return new Boleta(this);
        }
    }
}

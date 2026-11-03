public class Boleta {

    private String pelicula;   // obligatorio
    private String silla;      // obligatorio
    private boolean es3D;
    private boolean sillaVip;
    private String combo;      // opcional: "crispetas", "nachos", "familiar"
    private boolean estudiante;

    public Boleta(String pelicula, String silla, boolean es3D, boolean sillaVip,
                  String combo, boolean estudiante) {
        this.pelicula = pelicula;
        this.silla = silla;
        this.es3D = es3D;
        this.sillaVip = sillaVip;
        this.combo = combo;
        this.estudiante = estudiante;
    }

    public String getSilla() { return silla; }

    @Override
    public String toString() {
        return pelicula + " | silla " + silla
             + (es3D ? " | 3D" : "")
             + (sillaVip ? " | VIP" : "")
             + (combo != null ? " | combo " + combo : "")
             + (estudiante ? " | tarifa estudiante" : "");
    }
}

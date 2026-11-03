public class PaqueteViaje {

    private String destino;     // obligatorio
    private int noches;         // obligatorio, minimo 1
    private boolean vuelo;
    private String hotel;
    private boolean desayuno;
    private String tour;
    private boolean seguroViaje;

    public PaqueteViaje() { }

    public PaqueteViaje(String destino, int noches) {
        this.destino = destino;
        this.noches = noches;
    }

    public PaqueteViaje(String destino, int noches, boolean vuelo, String hotel) {
        this(destino, noches);
        this.vuelo = vuelo;
        this.hotel = hotel;
    }

    public PaqueteViaje(String destino, int noches, boolean vuelo, String hotel,
                        boolean desayuno, String tour, boolean seguroViaje) {
        this(destino, noches, vuelo, hotel);
        this.desayuno = desayuno;
        this.tour = tour;
        this.seguroViaje = seguroViaje;
    }

    public void setDestino(String destino)       { this.destino = destino; }
    public void setNoches(int noches)            { this.noches = noches; }
    public void setVuelo(boolean vuelo)          { this.vuelo = vuelo; }
    public void setHotel(String hotel)           { this.hotel = hotel; }
    public void setDesayuno(boolean desayuno)    { this.desayuno = desayuno; }
    public void setTour(String tour)             { this.tour = tour; }
    public void setSeguroViaje(boolean seguro)   { this.seguroViaje = seguro; }

    @Override
    public String toString() {
        return destino + " (" + noches + " noches)"
             + (vuelo ? " + vuelo" : "")
             + (hotel != null ? " + hotel " + hotel : "")
             + (desayuno ? " + desayuno" : "")
             + (tour != null ? " + tour " + tour : "")
             + (seguroViaje ? " + seguro" : "");
    }
}

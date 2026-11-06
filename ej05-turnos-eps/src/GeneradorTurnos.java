public class GeneradorTurnos {

    private static final GeneradorTurnos INSTANCIA = new GeneradorTurnos();

    private int consecutivo = 0;

    private GeneradorTurnos() { }

    public static GeneradorTurnos getInstancia() {
        return INSTANCIA;
    }

    public String siguienteTurno() {
        consecutivo++;
        return "T-" + String.format("%03d", consecutivo);
    }
}

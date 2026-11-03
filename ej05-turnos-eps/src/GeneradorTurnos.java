public class GeneradorTurnos {

    private int consecutivo = 0;

    public String siguienteTurno() {
        consecutivo++;
        return "T-" + String.format("%03d", consecutivo);
    }
}

public class Ventanilla {

    private final String nombre;

    public Ventanilla(String nombre) {
        this.nombre = nombre;
    }

    public void asignarTurno(String paciente) {
        System.out.println("  [" + nombre + "] " + paciente + " -> "
                + GeneradorTurnos.getInstancia().siguienteTurno());
    }
}

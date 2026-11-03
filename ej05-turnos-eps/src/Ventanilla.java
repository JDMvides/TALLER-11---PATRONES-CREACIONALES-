public class Ventanilla {

    private String nombre;
    private GeneradorTurnos generador = new GeneradorTurnos();

    public Ventanilla(String nombre) {
        this.nombre = nombre;
    }

    public void asignarTurno(String paciente) {
        System.out.println("  [" + nombre + "] " + paciente + " -> " + generador.siguienteTurno());
    }
}

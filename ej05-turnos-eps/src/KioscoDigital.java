public class KioscoDigital {

    public void pedirTurno(String paciente) {
        GeneradorTurnos generador = new GeneradorTurnos();
        System.out.println("  [Kiosco] " + paciente + " -> " + generador.siguienteTurno());
    }
}

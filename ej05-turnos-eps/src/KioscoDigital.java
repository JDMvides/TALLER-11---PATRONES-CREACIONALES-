public class KioscoDigital {

    public void pedirTurno(String paciente) {
        System.out.println("  [Kiosco] " + paciente + " -> "
                + GeneradorTurnos.getInstancia().siguienteTurno());
    }
}

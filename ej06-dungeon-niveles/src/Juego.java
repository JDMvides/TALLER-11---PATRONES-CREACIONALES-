public class Juego {

    public void jugarNivel(String nivel, int cantidadEnemigos) {
        System.out.println(">> Entrando a: " + nivel);
        for (int i = 0; i < cantidadEnemigos; i++) {
            if (nivel.equals("Cripta")) {
                Esqueleto e = new Esqueleto();
                e.atacar();
            } else if (nivel.equals("Castillo")) {
                Fantasma f = new Fantasma();
                f.atacar();
            } else if (nivel.equals("Glaciar")) {
                Golem g = new Golem();
                g.atacar();
            }
        }
    }
}

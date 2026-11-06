import java.util.Map;

public class Juego {

    private final Map<String, FabricaEnemigos> fabricas = Map.of(
        "Cripta", new FabricaEsqueleto(),
        "Castillo", new FabricaFantasma(),
        "Glaciar", new FabricaGolem(),
        "Volcan", new FabricaDragon()
    );

    public void jugarNivel(String nivel, int cantidadEnemigos) {
        System.out.println(">> Entrando a: " + nivel);
        FabricaEnemigos fabrica = fabricas.get(nivel);
        if (fabrica == null) {
            throw new IllegalArgumentException("Nivel no soportado: " + nivel);
        }
        for (int i = 0; i < cantidadEnemigos; i++) {
            Enemigo enemigo = fabrica.crearEnemigo();
            enemigo.atacar();
        }
    }
}

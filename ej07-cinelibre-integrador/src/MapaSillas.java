import java.util.HashSet;
import java.util.Set;

public class MapaSillas {

    private static final MapaSillas INSTANCIA = new MapaSillas();

    private final Set<String> ocupadas = new HashSet<>();

    private MapaSillas() { }

    public static MapaSillas getInstancia() {
        return INSTANCIA;
    }

    public synchronized boolean reservar(String silla) {
        return ocupadas.add(silla);
    }
}

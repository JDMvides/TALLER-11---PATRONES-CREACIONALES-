import java.util.ArrayList;

public class MapaSillas {

    private ArrayList<String> ocupadas = new ArrayList<>();

    public boolean reservar(String silla) {
        if (ocupadas.contains(silla)) {
            return false;
        }
        ocupadas.add(silla);
        return true;
    }
}

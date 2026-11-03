public class Main {
    public static void main(String[] args) {
        System.out.println("=== Viajes Andinos: paquetes vendidos ===");

        PaqueteViaje p1 = new PaqueteViaje("Cartagena", 4, true, "Decameron",
                                           true, "Islas del Rosario", false);

        // Solo hotel + seguro, sin vuelo ni desayuno ni tour... cual constructor uso?
        PaqueteViaje p2 = new PaqueteViaje("Villa de Leyva", 2, false, "Posada del Sol",
                                           false, null, true);

        // El asesor uso setters y se le olvido el destino
        PaqueteViaje p3 = new PaqueteViaje();
        p3.setNoches(3);
        p3.setTour("Cafe en Salento");

        // Otro asesor digito 0 noches
        PaqueteViaje p4 = new PaqueteViaje("San Andres", 0);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println();
        System.out.println("ESPERADO -> p1 y p2 se construyen leyendo claramente que incluyen,");
        System.out.println("            p3 y p4 se RECHAZAN al construirse (sin destino / 0 noches)");
    }
}

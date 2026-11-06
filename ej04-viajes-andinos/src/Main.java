public class Main {
    public static void main(String[] args) {
        System.out.println("=== Viajes Andinos: paquetes vendidos ===");

        PaqueteViaje p1 = PaqueteViaje.builder()
            .destino("Cartagena").noches(4).vuelo(true).hotel("Decameron")
            .desayuno(true).tour("Islas del Rosario").build();

        // Solo hotel + seguro, sin vuelo ni desayuno ni tour
        PaqueteViaje p2 = PaqueteViaje.builder()
            .destino("Villa de Leyva").noches(2).hotel("Posada del Sol")
            .seguroViaje(true).build();

        // El asesor olvido el destino
        PaqueteViaje p3 = null;
        try {
            p3 = PaqueteViaje.builder().noches(3).tour("Cafe en Salento").build();
        } catch (IllegalArgumentException e) {
            System.out.println("Pedido 3 RECHAZADO: " + e.getMessage());
        }

        // Otro asesor digito 0 noches
        PaqueteViaje p4 = null;
        try {
            p4 = PaqueteViaje.builder().destino("San Andres").noches(0).build();
        } catch (IllegalArgumentException e) {
            System.out.println("Pedido 4 RECHAZADO: " + e.getMessage());
        }

        System.out.println(p1);
        System.out.println(p2);
        if (p3 != null) {
            System.out.println(p3);
        }
        if (p4 != null) {
            System.out.println(p4);
        }

        System.out.println();
        System.out.println("ESPERADO -> p1 y p2 se construyen leyendo claramente que incluyen,");
        System.out.println("            p3 y p4 se RECHAZAN al construirse (sin destino / 0 noches)");
    }
}

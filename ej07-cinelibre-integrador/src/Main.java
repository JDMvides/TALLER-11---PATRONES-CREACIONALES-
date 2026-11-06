public class Main {
    public static void main(String[] args) {
        TaquillaFisica taquilla = new TaquillaFisica();
        AppWeb app = new AppWeb();

        System.out.println("=== CineLibre: estreno, funcion 7:00 p.m., sala 1 ===");

        // Boleta 3D, silla VIP, combo nachos, sin descuento
        taquilla.vender(Boleta.builder("Amazonas Perdido", "F7")
            .es3D(true).sillaVip(true).combo("nachos").build());

        // Boleta 2D, silla normal, sin combo, CON descuento estudiante
        app.comprar(Boleta.builder("Amazonas Perdido", "F8")
            .estudiante(true).build());

        // Alguien compra por la app la misma silla que ya vendio la taquilla
        app.comprar(Boleta.builder("Amazonas Perdido", "F7")
            .combo("crispetas").build());

        System.out.println();
        System.out.println("ESPERADO -> la boleta F8 sale con tarifa estudiante y sin VIP,");
        System.out.println("            y la segunda venta de F7 debe ser RECHAZADA");
    }
}

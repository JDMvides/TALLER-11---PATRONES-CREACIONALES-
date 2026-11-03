public class Main {
    public static void main(String[] args) {
        TaquillaFisica taquilla = new TaquillaFisica();
        AppWeb app = new AppWeb();

        System.out.println("=== CineLibre: estreno, funcion 7:00 p.m., sala 1 ===");

        // Boleta 3D, silla VIP, combo nachos, sin descuento
        taquilla.vender(new Boleta("Amazonas Perdido", "F7", true, true, "nachos", false));

        // Boleta 2D, silla normal, sin combo, CON descuento estudiante
        app.comprar(new Boleta("Amazonas Perdido", "F8", false, true, null, false));

        // Alguien compra por la app la misma silla que ya vendio la taquilla
        app.comprar(new Boleta("Amazonas Perdido", "F7", false, false, "crispetas", false));

        System.out.println();
        System.out.println("ESPERADO -> la boleta F8 sale con tarifa estudiante y sin VIP,");
        System.out.println("            y la segunda venta de F7 debe ser RECHAZADA");
    }
}

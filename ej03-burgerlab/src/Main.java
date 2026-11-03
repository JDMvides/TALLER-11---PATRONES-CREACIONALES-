public class Main {
    public static void main(String[] args) {
        System.out.println("=== BurgerLab: pedidos del dia ===");

        // Pedido 1: doble carne de res, CON tocineta, SIN queso, salsa BBQ
        Hamburguesa h1 = new Hamburguesa("res", 2, "brioche", true, false, false, false, "bbq", false);

        // Pedido 2: pollo sencillo, solo pepinillos, sin salsa
        Hamburguesa h2 = new Hamburguesa("pollo", 1, null, false, false, false, true, null, false);

        // Pedido 3: veggie triple con TODO
        Hamburguesa h3 = new Hamburguesa("veggie", 3, "integral", true, true, true, true, "de la casa", true);

        // Pedido 4: un error de digitacion que nadie detecta
        Hamburguesa h4 = new Hamburguesa("res", 7, "brioche", false, false, false, false, "miel mostaza", false);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);

        System.out.println();
        System.out.println("ESPERADO -> pedido 1 con tocineta y sin queso, pan por defecto 'brioche',");
        System.out.println("            salsa por defecto 'ninguna' y el pedido 4 debe ser RECHAZADO (max 3 porciones)");
    }
}

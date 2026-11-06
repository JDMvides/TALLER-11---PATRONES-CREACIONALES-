public class Main {
    public static void main(String[] args) {
        System.out.println("=== BurgerLab: pedidos del dia ===");

        // Pedido 1: doble carne de res, CON tocineta, SIN queso, salsa BBQ
        Hamburguesa h1 = Hamburguesa.builder("res", 2)
            .conTocineta(true).conQueso(false).salsa("bbq").build();

        // Pedido 2: pollo sencillo, solo pepinillos, sin salsa
        Hamburguesa h2 = Hamburguesa.builder("pollo", 1)
            .conPepinillos(true).build();

        // Pedido 3: veggie triple con TODO
        Hamburguesa h3 = Hamburguesa.builder("veggie", 3)
            .pan("integral").conQueso(true).conTocineta(true)
            .conCebollaCaramelizada(true).conPepinillos(true)
            .salsa("de la casa").conPapasAgrandadas(true).build();

        // Pedido 4: un error de digitacion que nadie detecta
        Hamburguesa h4 = null;
        try {
            h4 = Hamburguesa.builder("res", 7)
                .pan("brioche").salsa("miel mostaza").build();
        } catch (IllegalArgumentException e) {
            System.out.println("Pedido 4 RECHAZADO: " + e.getMessage());
        }

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        if (h4 != null) {
            System.out.println(h4);
        }

        System.out.println();
        System.out.println("ESPERADO -> pedido 1 con tocineta y sin queso, pan por defecto 'brioche',");
        System.out.println("            salsa por defecto 'ninguna' y el pedido 4 debe ser RECHAZADO (max 3 porciones)");
    }
}

public class PanelAdmin {

    public void activarModoLluvia(double recargo) {
        ConfiguracionApp config = new ConfiguracionApp();
        config.setRecargoLluvia(recargo);
        System.out.println("[Admin] Modo lluvia ACTIVADO. Recargo: $" + recargo);
    }
}

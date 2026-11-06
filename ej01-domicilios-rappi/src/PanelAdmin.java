public class PanelAdmin {

    public void activarModoLluvia(double recargo) {
        ConfiguracionApp config = ConfiguracionApp.getInstancia();
        config.setRecargoLluvia(recargo);
        System.out.println("[Admin] Modo lluvia ACTIVADO. Recargo: $" + recargo);
    }
}

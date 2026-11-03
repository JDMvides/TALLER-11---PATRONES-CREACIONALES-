public class AppRepartidor {

    public void mostrarGanancia(double km) {
        ConfiguracionApp config = new ConfiguracionApp();
        double ganancia = km * config.getValorPorKm() + config.getRecargoLluvia();
        System.out.println("[Repartidor] Ganancia por " + km + " km: $" + ganancia);
    }
}

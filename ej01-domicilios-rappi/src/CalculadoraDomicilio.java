public class CalculadoraDomicilio {

    public double calcular(double km) {
        ConfiguracionApp config = ConfiguracionApp.getInstancia();
        return config.getTarifaBase()
             + km * config.getValorPorKm()
             + config.getRecargoLluvia();
    }
}

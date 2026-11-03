public class CalculadoraDomicilio {

    public double calcular(double km) {
        ConfiguracionApp config = new ConfiguracionApp();
        return config.getTarifaBase()
             + km * config.getValorPorKm()
             + config.getRecargoLluvia();
    }
}

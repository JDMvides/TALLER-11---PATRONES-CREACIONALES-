public class ConfiguracionApp {

    private static int vecesCargada = 0;

    private double tarifaBase;
    private double valorPorKm;
    private double recargoLluvia;

    public ConfiguracionApp() {
        // Simula leer config.properties del disco (operacion lenta y costosa)
        vecesCargada++;
        System.out.println("   >> Leyendo config.properties... (carga #" + vecesCargada + ")");
        this.tarifaBase = 4500;
        this.valorPorKm = 800;
        this.recargoLluvia = 0;
    }

    public double getTarifaBase()    { return tarifaBase; }
    public double getValorPorKm()    { return valorPorKm; }
    public double getRecargoLluvia() { return recargoLluvia; }

    public void setRecargoLluvia(double recargoLluvia) {
        this.recargoLluvia = recargoLluvia;
    }
}

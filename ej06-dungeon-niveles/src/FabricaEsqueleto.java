public class FabricaEsqueleto extends FabricaEnemigos {
    @Override
    public Enemigo crearEnemigo() {
        return new Esqueleto();
    }
}

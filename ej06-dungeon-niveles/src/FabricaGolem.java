public class FabricaGolem extends FabricaEnemigos {
    @Override
    public Enemigo crearEnemigo() {
        return new Golem();
    }
}

public class FabricaDragon extends FabricaEnemigos {
    @Override
    public Enemigo crearEnemigo() {
        return new Dragon();
    }
}

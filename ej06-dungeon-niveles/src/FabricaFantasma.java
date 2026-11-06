public class FabricaFantasma extends FabricaEnemigos {
    @Override
    public Enemigo crearEnemigo() {
        return new Fantasma();
    }
}

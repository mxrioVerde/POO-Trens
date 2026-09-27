public class VagaoCargaRefrigerado extends VagaoCarga{
    @Override
    public int get_peso() {
        return (int) (super.get_peso() * 1.15);
    }
}

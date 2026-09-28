public class VagaoCargaRefrigerado extends VagaoCarga{
    public VagaoCargaRefrigerado(int capacidade) {
        super(capacidade);
    }

    @Override
    public int get_peso() {
        return super.get_peso() * 115 / 100; // +15% do gelo
    }
}

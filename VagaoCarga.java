public class VagaoCarga extends Vagao{
    private int capacidade; // toneladas

    public VagaoCarga(int capacidade) {
        super();
        this.capacidade = capacidade;
    }

    public int getCapacidade() { return capacidade; }

    @Override
    public int get_peso() {
        return capacidade * 1000; // kg
    }

    @Override
    public int get_tracaomax() {
        return 0;
    }
}

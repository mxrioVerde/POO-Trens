public class VagaoRestaurante extends VagaoPassageiros{
    public VagaoRestaurante(int qtdAssentos) {
        super(qtdAssentos);
    }

    @Override
    public int get_peso() {
        return (super.get_peso() + 1160);
    }
}

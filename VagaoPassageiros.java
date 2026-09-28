public class VagaoPassageiros extends Vagao{
    private int qtdAssentos;

    public VagaoPassageiros(int qtdAssentos) {
        super();
        this.qtdAssentos = qtdAssentos;
    }

    @Override
    public int get_peso() {
        return (qtdAssentos*80);
    }

    public int getQtdAssentos(){return qtdAssentos;}

    @Override
    public int get_tracaomax() {
        return 0;
    }
}

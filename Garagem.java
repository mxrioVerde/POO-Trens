import java.util.LinkedList;

public class Garagem {
    private LinkedList<CarroFerroviario> vagoesCarga;
    private LinkedList<CarroFerroviario> vagoesCargaRefrigerado;
    private LinkedList<CarroFerroviario> vagoesPassageiros;
    private LinkedList<CarroFerroviario> vagoesRestaurante;
    private LinkedList<CarroFerroviario> locomotivas;
    public Garagem() {
        vagoesCarga = new LinkedList<CarroFerroviario>();
        vagoesCargaRefrigerado = new LinkedList<CarroFerroviario>();
        vagoesPassageiros = new LinkedList<CarroFerroviario>();
        vagoesRestaurante = new LinkedList<CarroFerroviario>();
        locomotivas = new LinkedList<CarroFerroviario>();
    }


    public Vagao criar_vagao(int qtdAssentos){
        VagaoPassageiros v = new VagaoPassageiros(qtdAssentos);
        System.out.println(v.get_id());
        return v;
    }

    // public Locomotiva criar_locomotiva(){ return new Locomotiva(); }

    public void retirarCarro(CarroFerroviario c) {
        switch(c) {
            case VagaoCargaRefrigerado ignored -> {
                vagoesCargaRefrigerado.add(c);
            }
            case VagaoRestaurante ignored -> {
                vagoesRestaurante.add(c);
            }
            case VagaoPassageiros ignored -> {
                vagoesPassageiros.add(c);
            }
            case VagaoCarga ignored -> {
                vagoesCarga.add(c);
            }
            case Locomotiva ignored -> {
                locomotivas.add(c);
            }
            default -> throw new IllegalStateException();
        }
    }
    public void guardarCarro(CarroFerroviario c) {
        switch(c) {
            case VagaoCargaRefrigerado ignored -> {
                vagoesCargaRefrigerado.remove(c);
            }
            case VagaoRestaurante ignored -> {
                vagoesRestaurante.remove(c);
            }
            case VagaoPassageiros ignored -> {
                vagoesPassageiros.remove(c);
            }
            case VagaoCarga ignored -> {
                vagoesCarga.remove(c);
            }
            case Locomotiva ignored -> {
                locomotivas.remove(c);
            }
            default -> throw new IllegalStateException();
        }
    }

    public void listar() {
        for (CarroFerroviario x: vagoesCarga) {
            System.out.println(x);
        }
    }

}

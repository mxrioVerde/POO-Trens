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

        // carga inicial da garagem
        locomotivas.add(new Locomotiva(100));
        locomotivas.add(new Locomotiva(200));
        locomotivas.add(new Locomotiva(150));
        vagoesCarga.add(new VagaoCarga(30));
        vagoesCarga.add(new VagaoCarga(50));
        vagoesCarga.add(new VagaoCarga(20));
        vagoesCargaRefrigerado.add(new VagaoCargaRefrigerado(20));
        vagoesCargaRefrigerado.add(new VagaoCargaRefrigerado(40));
        vagoesPassageiros.add(new VagaoPassageiros(50));
        vagoesPassageiros.add(new VagaoPassageiros(60));
        vagoesPassageiros.add(new VagaoPassageiros(40));
        vagoesRestaurante.add(new VagaoRestaurante(16)); // múltiplos de 4 (4 assentos por mesa)
        vagoesRestaurante.add(new VagaoRestaurante(20));
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
    public void guardarCarro(CarroFerroviario c) {
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

    public CarroFerroviario listar(int i) {
        switch (i) {
            case 1:
                formatListar(locomotivas);
                int aux = Sistema.i.nextInt();
                return locomotivas.get(aux);
            case 2:
                formatListar(vagoesCarga);
                int aux1 = Sistema.i.nextInt();
                return vagoesCarga.get(aux1);
            case 3:
                formatListar(vagoesPassageiros);
                int aux2 = Sistema.i.nextInt();
                return vagoesPassageiros.get(aux2);
            case 4:
                formatListar(vagoesRestaurante);
                int aux3 = Sistema.i.nextInt();
                return vagoesRestaurante.get(aux3);
            case 5:
                formatListar(vagoesCargaRefrigerado);
                int aux4 = Sistema.i.nextInt();
                return vagoesCargaRefrigerado.get(aux4);
            default:
                throw new IllegalArgumentException("Opção inválida");
        }
    }

    public void formatListar(LinkedList l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.print(i);
            System.out.println(" " + l.get(i));
        }
    }

    public void printarTudo() {
        System.out.println("Locomotivas: ");
        for (int i = 0; i < locomotivas.size(); i++) {
            System.out.print(i);
            System.out.println(" " + locomotivas.get(i));
        }
        System.out.println("Vagões de Carga: ");
        for (int i = 0; i < vagoesCarga.size(); i++) {
            System.out.print(i);
            System.out.println(" " + vagoesCarga.get(i));
        }
        System.out.println("Vagões de Carga Refrigerada: ");
        for (int i = 0; i < vagoesCargaRefrigerado.size(); i++) {
            System.out.print(i);
            System.out.println(" " + vagoesCargaRefrigerado.get(i));
        }
        System.out.println("Vagões de Passageiros: ");
        for (int i = 0; i < vagoesPassageiros.size(); i++) {
            System.out.print(i);
            System.out.println(" " + vagoesPassageiros.get(i));
        }
        System.out.println("Vagões de Restaurantes: ");
        for (int i = 0; i < vagoesRestaurante.size(); i++) {
            System.out.print(i);
            System.out.println(" " + vagoesRestaurante.get(i));
        }
    }

}

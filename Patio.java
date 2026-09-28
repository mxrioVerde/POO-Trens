import java.util.ArrayList;
public class Patio {
    ArrayList<Trem> patio;
    public Patio(){
        patio = new ArrayList<>();
    }

    public void inserir_trem(Trem t){
        for (Trem x : patio) if (x.get_id().equals(t.get_id())) throw new IllegalArgumentException("Já existe um trem com esse id");
        patio.add(t);
    }

    public void remover_trem(Trem t){ patio.remove(t); }

    public void listar_trens(){
        StringBuilder sb = new StringBuilder();
        for(Trem x : patio){
            sb.append(x.get_id()).append(", ");
        }
        System.out.println(sb);
    }

    public Trem achar_trem(String id) {
        for (int i = 0; i < patio.size(); i++) {
            if (id.equals(patio.get(i).get_id())) {return patio.get(i);}
        }
        throw new IllegalArgumentException("Trem não encontrado");
    }

    public void listar_carac_trem(Trem t){
        StringBuilder sb = new StringBuilder();
        sb.append(t.get_id() + "\n");
        int[] array = new int[6];
        //0 - locomotivas
        //1 - vagões
        //2 - passageiros
        //3 - restaurantes
        //4 - carga não refrigerada
        //5 - carga refrigerada
        for(CarroFerroviario f : t.get_composicao()){
            if(f instanceof Locomotiva){
                array[0] += 1;
            }
            if (f instanceof Vagao) {
                array[1] += 1;
            }
            if (f instanceof VagaoPassageiros && !(f instanceof VagaoRestaurante)) {
                array[2] += ((VagaoPassageiros) f).getQtdAssentos();
            }
            if (f instanceof VagaoRestaurante) {
                array[3] += ((VagaoRestaurante) f).getQtdAssentos();
            }
            if (f instanceof VagaoCarga && !(f instanceof VagaoCargaRefrigerado)) {
                array[4] += ((VagaoCarga) f).getCapacidade();
            }
            if (f instanceof VagaoCargaRefrigerado) {
                array[5] += ((VagaoCarga) f).getCapacidade();
            }
        }
        sb.append("Esse trem tem " + array[0] + " locomotivas.\n");
        sb.append("Esse trem tem " + array[1] + " vagões.\n");
        sb.append("Esse trem comporta " + array[2] + " passageiros.\n");
        sb.append("Esse trem comporta " + array[3] + " lugares no restaurante.\n");
        sb.append("Esse trem carrega " + array[4] + " toneladas de carga não refrigerada.\n");
        sb.append("Esse trem carrega " + array[5] + " toneladas de carga refrigerada.\n");
        System.out.println(sb);
    }
}

import java.util.ArrayList;
public class Patio {
    ArrayList<Trem> patio;
    public Patio(){
        patio = new ArrayList<>();
    }

    public void inserir_trem(Trem t){patio.add(t);}
    public void listar_trens(){
        StringBuilder sb = new StringBuilder();
        for(Trem x : patio){
            sb.append(x.get_id()).append(", ");
        }
        System.out.println(sb);
    }

    public Trem achar_trem(String id) {
        for (int i = 0; i < patio.size(); i++) {
            if (id.equals(patio.get(i).get_id())); {return patio.get(i);}
        }
        throw new IllegalArgumentException();
    }
}

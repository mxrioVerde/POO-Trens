import java.util.ArrayList;
public class Patio {
    ArrayList<Trem> patio;
    public Patio(){
        patio = new ArrayList<>();
    }

    public int inserir_trem(Trem t){patio.add(t); return t.id;}
    public void listar_trens(){
        StringBuilder sb = new StringBuilder();
        for(Trem x : patio){
            sb.append(x.id).append(", ");
        }
        System.out.println(sb);
    }
}

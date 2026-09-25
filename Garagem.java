import java.util.ArrayList;
public class Garagem {
    CarroFerroviario[] garagem;
    public Garagem(){
        garagem = new CarroFerroviario[100];
    }

    public Vagao criar_vagao(){ Vagao v = new Vagao(); System.out.println(v.id); return v; }
    public Locomotiva criar_locomotiva(){ return new Locomotiva(); }
}

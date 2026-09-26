import java.util.ArrayList;

public class Garagem {
    private ArrayList<CarroFerroviario> garagem;
    public Garagem() {
        garagem = new ArrayList<CarroFerroviario>();
    }


    public Vagao criar_vagao(){
        Vagao v = new Vagao();
        System.out.println(v.get_id());
        return v;
    }
    // public Locomotiva criar_locomotiva(){ return new Locomotiva(); }

    public void retirarCarro(CarroFerroviario c) {
        garagem.remove(c);
    }

    public void inserirCarro(CarroFerroviario c) {garagem.add(c);}
}

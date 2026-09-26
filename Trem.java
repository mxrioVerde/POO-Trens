import java.util.LinkedList;
public class Trem {
    private int id;
    private LinkedList<CarroFerroviario> composicao;
    private int tracaoMax;
    private int pesomax;
    public Trem(int id){
        this.id = id;
        composicao = new LinkedList<CarroFerroviario>();
        pesomax = 0;
        tracaoMax = 0;
    }

    public void engatar_carro(CarroFerroviario c, Garagem g){
        if(composicao.isEmpty() && !(c instanceof Locomotiva)){
            throw new IllegalArgumentException("primeiro carro tem que ser locomotiva");
        }
        if(composicao.getLast() instanceof Vagao && (c instanceof Locomotiva)) {
            throw new IllegalArgumentException("Não é possível engatar uma locomotiva após um vagão");
        }

        composicao.add(c);
        if (c instanceof Vagao) { pesomax += c.get_peso();} else {tracaoMax += c.get_tracaoMax();}
        g.retirarCarro(c);
    }

    public void desengatar_carro(CarroFerroviario c, Garagem g) {
        if (c instanceof Vagao) { pesomax -= c.get_peso();} else {tracaoMax -= c.get_tracaoMax();}
        composicao.remove(c);
        g.inserirCarro(c);
    }

    public int get_id() {
        return id;
    }

}

import java.util.LinkedList;
public class Trem {
    private String id;
    private LinkedList<CarroFerroviario> composicao;
    private int tracaoMax;
    private int pesomax;
    private int qtdLocomotivas, qtdVagoes, qtdPassageiros, qtdLugaresRestaurante, qtdCargaNaoRefrigerada, qtdCargaRefrigerada;

    public Trem(String id){
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
        if (c instanceof Vagao) { if (pesomax + c.get_peso() > tracaoMax) {throw new IllegalArgumentException("O trêm não consegue tracionar mais peso");}}
        composicao.add(c);
        if (c instanceof Vagao) { pesomax += c.get_peso(); qtdVagoes++;} else {tracaoMax += c.get_tracaomax(); qtdLocomotivas++;}
        g.retirarCarro(c);
    }

    public void desengatar_carro(CarroFerroviario c, Garagem g) {
        if (c instanceof Vagao) { pesomax -= c.get_peso(); qtdVagoes--;} else {tracaoMax -= c.get_tracaomax();qtdLocomotivas--;}
        composicao.remove(c);
        g.guardarCarro(c);
    }

    public String get_id() {return id;}

}

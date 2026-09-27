import java.util.LinkedList;

public class Locomotiva extends CarroFerroviario{
    private int pesoMaxTracao;

    public Locomotiva() {
        super();
        pesoMaxTracao = 10000; // valor ficticio
    }

    public int get_tracaomax() {return pesoMaxTracao;}

    public int get_peso() {return 0;}
}

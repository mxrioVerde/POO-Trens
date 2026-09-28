public class Locomotiva extends CarroFerroviario{
    private int pesoMaxTracao;

    public Locomotiva() {
        super();
        pesoMaxTracao = 100; // valor ficticio
    }

    public int get_tracaomax() {return pesoMaxTracao;}

    public int get_peso() {return 0;}
}

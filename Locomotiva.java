public class Locomotiva extends CarroFerroviario{
    private int pesoMaxTracao; // em toneladas

    public Locomotiva() {
        super();
        pesoMaxTracao = 100; // valor ficticio
    }

    public Locomotiva(int pesoMaxTracaoTon) {
        super();
        pesoMaxTracao = pesoMaxTracaoTon;
    }

    public int get_tracaomax() {return pesoMaxTracao * 1000;} // toneladas -> kg

    public int get_peso() {return 0;}
}

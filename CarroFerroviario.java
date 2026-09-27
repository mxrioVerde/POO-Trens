import java.util.Random;
public abstract class CarroFerroviario {
    private Random rand = new Random();
    private int id;
    public CarroFerroviario() {
        this.id = rand.nextInt(99999);
    }

    public int get_id(){return id;}
    public abstract int get_tracaomax();
    public abstract int get_peso();
}

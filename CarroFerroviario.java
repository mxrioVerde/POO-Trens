import java.util.Random;
public abstract class CarroFerroviario {
    Random rand = new Random();
    int id;
    boolean livre;
    public CarroFerroviario() {
        this.id = rand.nextInt(99999);
        this.livre = true;
    }

    public int get_id(){return id;}
}

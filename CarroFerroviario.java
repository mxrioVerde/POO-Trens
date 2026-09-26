import java.util.Random;
public abstract class CarroFerroviario {
    private Random rand = new Random();
    private int id;
    private boolean estado;
    public CarroFerroviario() {
        this.id = rand.nextInt(99999);
        this.estado = true;
    }

    public int get_id(){return id;}

    public boolean get_livre() {return estado;}

    public boolean mudaEstado() {
        return estado = !estado;
    }

    public abstract int get_peso();

    public abstract int get_tracaoMax();
}

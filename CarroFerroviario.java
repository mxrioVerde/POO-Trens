public abstract class CarroFerroviario {
    private static int proximoId = 1;
    private int id;
    public CarroFerroviario() {
        this.id = proximoId++;
    }

    public int get_id(){return id;}
    public abstract int get_tracaomax();
    public abstract int get_peso();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [id=" + id + ", peso=" + get_peso() + "kg]";
    }
}

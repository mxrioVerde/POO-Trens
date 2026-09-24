import java.util.LinkedList;
import java.util.Random;
public class Trem {
    Random rand = new Random();
    int id;
    LinkedList<CarroFerroviario> montagem;
    public Trem(){
        id = rand.nextInt(99999);
        montagem = new LinkedList<CarroFerroviario>();
    }

    public void engatar_carro(CarroFerroviario c){
        if(montagem.isEmpty() && !(c instanceof Locomotiva)){
            throw new IllegalArgumentException("primeiro carro tem que ser locomotiva");
        }
        montagem.add(c);
    }
}

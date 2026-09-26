import java.util.Scanner;
public class Sistema{
    static Garagem g = new Garagem();
    static Patio p = new Patio();
    static Scanner i = new Scanner(System.in);
    public static void main(String args[]){
        boolean op = true;
        int escolha = 0;
        while(op){
            imprimir_menu();
            escolha = i.nextInt();
            op = menu_opcao(escolha);
        }
    }

    public static boolean menu_opcao(int escolha){
        switch(escolha){
            case 1 -> {criar_trem(); return true;}

            case 2 -> {System.out.println("editar um trem"); return true;}

            case 3 -> {p.listar_trens(); return true;}

            case 4 -> {System.out.println("listar características"); return true;}

            case 5 -> {System.out.println("desfazer trem"); return true;}

            case 6 -> {g.criar_vagao(); return true;}

            case 7 -> {return true;}

            /*case 8 -> {Trem t = new Trem();
                System.out.println(p.inserir_trem(t));
                return true;}*/

            case 0 -> {System.out.println("até mais"); return false;}

            default -> { System.out.println("opção não existe"); return true;}
        }
    }

    public static void criar_trem() {
        System.out.println("Qual o identificador do trêm que você deseja?");
        int id = i.nextInt();
        new Trem(id);
    }

    public static void imprimir_menu(){
        System.out.println("escolha");
    }
}
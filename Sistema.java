import java.util.Scanner;
public class Sistema{
    static Garagem g = new Garagem();
    static Patio p = new Patio();
    static Scanner i = new Scanner(System.in);
    public static void main(String[] args){
        boolean op = true;
        int escolha = 0;
        while(op){
            imprimir_menu();
            escolha = i.nextInt();
            i.nextLine();
            op = menu_opcao(escolha);
        }
    }

    public static boolean menu_opcao(int escolha){
        switch(escolha){
            case 1 -> {criar_trem(); return true;}

            case 2 -> {imprimir_menuEdicao(); return true;}

            case 3 -> {p.listar_trens(); return true;}

            case 4 -> {System.out.println("listar características"); return true;}

            case 5 -> {System.out.println("desfazer trem"); return true;}

            case 0 -> {System.out.println("até mais"); return false;}

            default -> { System.out.println("opção não existe"); return true;}
        }
    }

    public static void criar_trem() {
        System.out.println("Qual o identificador do trem que você deseja?");
        String id = i.nextLine();
        Trem t = new Trem(id);
        p.inserir_trem(t);
    }

    public static void menu_edicao(int opcao) {
        switch (opcao) {
            case 1:
                System.out.println("1");
                // Engatar um carro ferroviário no trem
                break;

            case 2:
                // Remover o último carro ferroviário
                break;

            case 3:
                // Listar os carros ferroviários estacionados na garagem
                break;

            case 4:
                // Listar os carros ferroviários que fazem parte do trem
                break;

            case 5:
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }

    public static void imprimir_menuEdicao() {
        System.out.println("""
                    === Edição do Trem ===
                    1 - Engatar um carro ferroviário no trem
                    2 - Remover o último carro ferroviário
                    3 - Listar os carros ferroviários estacionados na garagem
                    4 - Listar os carros ferroviários que fazem parte do trem
                    5 - Encerrar a edição do trem
                    """);
        int aux = i.nextInt();
        menu_edicao(aux);
    }

    public static void imprimir_menu(){
        System.out.println("escolha");
    }

    public static void menuEngatarCarroFerroviario() {
        System.out.println("""
        Qual tipo você deseja engatar no trêm?
        --------------------------------------
        1 - Locomotiva
        2 - Vagão de Carga
        3 - Vagão de Passageiros
        4 - Vagão Restaurante
        5 - Vagão de Carga Refrigerado
        """);
        int aux = i.nextInt();
    }
}
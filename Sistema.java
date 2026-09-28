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
            try {
                escolha = i.nextInt();
                i.nextLine();
                op = menu_opcao(escolha);
            } catch (java.util.InputMismatchException e) {
                i.nextLine();
                System.out.println("Entrada inválida.");
            } catch (RuntimeException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    public static boolean menu_opcao(int escolha){
        switch(escolha){
            case 1 -> {criar_trem(); return true;}

            case 2 -> {
                System.out.println("Qual o id do trêm que você deseja editar?");
                String aux = i.nextLine();
                imprimir_menuEdicao(p.achar_trem(aux));
                return true;
            }

            case 3 -> {p.listar_trens(); return true;}

            case 4 -> {
                p.listar_trens();
                System.out.println("Insira o id");
                String id = i.nextLine();
                Trem ttt = p.achar_trem(id);
                p.listar_carac_trem(ttt);
                return true;
            }

            case 5 -> {
                System.out.println("Qual o id do trêm que você deseja desfazer?");
                String aux2 = i.nextLine();
                Trem tt = p.achar_trem(aux2);
                tt.desfazerTrem(g);
                p.remover_trem(tt);
                return true;
            }

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

    public static void menu_edicao(int opcao, Trem t) {
        switch (opcao) {
            case 1:
                menuEngatarCarroFerroviario(t);
                // Engatar um carro ferroviário no trem
                break;

            case 2:
                t.desengatar_carro(g);
                // Remover o último carro ferroviário
                break;

            case 3:
                g.printarTudo();
                // Listar os carros ferroviários estacionados na garagem
                break;

            case 4:
                t.printarCF();
                // Listar os carros ferroviários que fazem parte do trem
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }

    public static void imprimir_menuEdicao(Trem t) {
        int aux = 0;
        while (aux != 5) {
            System.out.println("""
                    === Edição do Trem ===
                    1 - Engatar um carro ferroviário no trem
                    2 - Remover o último carro ferroviário
                    3 - Listar os carros ferroviários estacionados na garagem
                    4 - Listar os carros ferroviários que fazem parte do trem
                    5 - Encerrar a edição do trem
                    """);
            try {
                aux = i.nextInt();
                if (aux != 5) menu_edicao(aux, t);
            } catch (java.util.InputMismatchException e) {
                i.next();
                System.out.println("Entrada inválida.");
            } catch (RuntimeException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    public static void imprimir_menu(){
        System.out.println("""
                === Sistema de Composição de Trens ===
                1 - Criar um trem
                2 - Editar um trem
                3 - Listar os trens no pátio
                4 - Listar as características de um trem
                5 - Desfazer um trem
                0 - Fim
                """);
    }

    public static void menuEngatarCarroFerroviario(Trem t) {
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
        System.out.println("Escolha qual dos disponíveis você deseja:");
        t.engatar_carro(g.listar(aux), g);
    }
}

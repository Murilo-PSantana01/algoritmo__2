package switch_case;
import java.util.Scanner;

public class Menu {
    public static void main (String[] args){

        System.out.println("====== Menu de opções ======");
        System.out.println("1 - Cadastrar produtos.");
        System.out.println("2 - Listar produtos.");
        System.out.println("3 - Sair do sistema.");
        System.out.println("=== Escolho uma das opções ===");
        
        Scanner entrada = new Scanner(System.in);

        int menu = entrada.nextInt();
        
        switch (menu){
            
            case 1:
            System.out.println("Voce escolheu o menu 1"); System.out.println("Que eh a opcao Cadastrar Produtos");
            System.out.println("Que eh a opcao Cadastrar Produtos");
            break;

            case 2:
            System.out.println("voce escolheu o menu 2");
            System.out.println("lista de produtos");
            break;
            
            case 3:
             System.out.println("voce escolheu o menu 3 ");
             System.out.println("sair do sistema");
            break;
            
            default:
                System.out.println("menu invalido");
        }
        entrada.close();
    }
    
}

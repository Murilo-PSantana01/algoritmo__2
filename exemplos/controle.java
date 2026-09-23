package exemplos;
import java.util.Scanner;

public class controle {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        int resp,idade;
        String nome;
        resp = 1;

        
        while(resp == 1){
            System.out.println("Digite o seu nome: ");
            nome = entrada.nextLine();

            System.out.println("Digite a sua idade: ");
            idade = entrada.nextInt();

                if(idade >= 18){
                    System.out.println("Seu nome é: "+ nome);
                }
                System.out.println("Deseja continuar? Digite 1 (sim) e 0 (não). ");
                resp = entrada.nextInt();
                entrada.nextLine();
        }
        entrada.close();
    }
}

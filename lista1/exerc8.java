package lista1;
import java.util.Scanner;

public class exerc8 {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        String senha;

        System.out.println("Digite a senha: ");
        senha = entrada.nextLine();

        if (senha.equals("R10p54")){
            System.out.println("Acesso aoncedido");
        }else{
            System.out.println("Acesso negado");
        }

        entrada.close();
    }
}

package lista1;
import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int n1 = entrada.nextInt();
        if (n1 >= 50 && n1<= 100){
            System.out.println("Pertence ao intervalo. ");
        }else{
            System.out.println("nao pertece ao intervalo. ");
        }
        entrada.close();

    }
}

package lista1;
import java.util.Scanner;


public class exerc10 {
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Digite o primeiro numero inteiro: ");
        num1 = entrada.nextInt();

        System.out.println("Digite o segundo numero inteiro: ");
        num2 = entrada.nextInt();

        System.out.println("Digite o terceiro numero inteiro: ");
        num3 = entrada.nextInt();

        if ((num1 == num2) && (num2 == num3)){
            System.out.println("Os numeors sao iguais");
        }else if ((num1 >= num2) && (num1 >= num3)){
            System.out.println("O maior numero e: " + num1);
        }else if ((num2 >= num1) && (num2 >= num3)){
            System.out.println("O maior numero e: " + num2);
        }else{
            System.out.println("O maior numero e: " + num3);
        }
        entrada.close();
    }
}

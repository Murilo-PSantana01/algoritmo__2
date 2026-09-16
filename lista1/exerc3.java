package lista1;
import java.util.Scanner;

public class exerc3{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("digite o primeiro numero.");
        int num1 = entrada.nextInt();
        System.out.println("digite o segundo numero.");
        int num2 = entrada.nextInt();
    
        if (num1 == num2){
            System.out.println("Números iguais.");
        } else if (num1 > num2) {
            System.out.println("Diferença:" + (num1 - num2));
        }else {
            System.out.println("Diferencça:" + (num2 - num1));
        }
        entrada.close();
        
    }
}
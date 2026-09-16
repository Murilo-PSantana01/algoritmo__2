package lista1;
import java.util.Scanner;

public class exerc7{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu salário");
        double salario = entrada.nextDouble();
        System.out.println("Digite seu anos de empresa");
        int anos = entrada.nextInt();
    
        double bonus = 0;
        
        if (anos >= 5){
            bonus = salario * 0.20;
        }else{
            bonus = salario * 0.10;
        }

        System.out.printf("valor do bonus: R$ %.2f%n", bonus);
        entrada.close();
    }

}
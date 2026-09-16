package lista1;
import java.util.Scanner;

public class exerc4 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor.");
        double valor1 = entrada.nextDouble();
        System.out.println("Digite o segundo valor. ");
        double valor2 = entrada.nextDouble();

        if(valor1 == valor2){
            System.out.println("numeros iguais");
        }else if (valor1 < valor2){
            double temp =valor1;
            valor1 = valor2;
            valor2 = temp;
        }
        System.out.println(valor1 + " , " + valor2 );
        
        entrada.close();
        }
}

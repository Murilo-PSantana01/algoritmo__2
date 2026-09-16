package lista1;
import java.util.Scanner;
 
public class exerc6 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua altura:");
        double altura = entrada.nextDouble();
        
        System.out.println("Digite M para masculino ou F para feminina: ");
        char sexo = entrada.next().toUpperCase().charAt(0);
        
        if (sexo == 'M'){
            System.out.printf("peso ideal para obter sexo masculino: %.2f", (72.7*altura)- 58);
        }else if (sexo == 'F'){
            System.out.printf("Peso ideal para obter sexo femenino: %.2f", (62.1*altura)- 44.7);
        }
        entrada.close();
    }

}

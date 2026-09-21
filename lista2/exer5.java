//Murilo Prates Santana
package lista2;
import java.util.Scanner;

public class exer5 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numéro: ");
        double num1 = entrada.nextDouble();
        System.out.println("Digite o numério: ");
        double num2 = entrada.nextDouble();

        System.out.println("Escolha a operação desejada:");
        System.out.println("M - Média entre os numéros.");
        System.out.println("S - Diferença do maoir pelo menor.");
        System.out.println("P - Produto entre os  números digitados.");
        System.out.println("D - Divisão do primerio pelo segundo.");
        char operacao = entrada.next().toUpperCase().charAt(0);

        switch (operacao){
            
            case 'M':
                System.out.println("Média: " + ((num1 + num2) / 2));
                break;
            
                case 'S':
                    if (num1 >= num2){
                        System.out.println("Diferneça" + (num1 - num2));
                    }else{
                        System.out.println("Difereça: " + (num2 - num1));
                    }
                break;
            
                case 'P':
                System.out.println("Produto: " + (num1 * num2));
                break;

                case 'D':
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    System.out.println("Divisão: " + (num1 / num2));
                }
                break;

                default:
                System.out.println("Operação inválida.");
                break;
        }
        entrada.close();
    }
}

package lista1;
import java.util.Scanner;

public class exerc13 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();

        System.out.println("Digite o sinal da operção (+,-,*,/):");
        char operacao = entrada.next().charAt(0);

        System.out.println("Digite o segundo número: ");
        double n2 = entrada.nextDouble();

        if (operacao == '+'){
            double resultado = n1+n2;
            System.out.printf("%.2f + %.2f = %.2f", n1, n2, resultado);
        }else if (operacao == '-'){
            double resultado = n1 - n2;
            System.out.printf("%.2f + %.2f = %.2f", n1, n2, resultado);
        }else if (operacao == '*'){
            double resultado = n1 * n2;
            System.out.printf("%.2f + %.2f = %.2f", n1, n2, resultado);
        }else if (operacao == '/'){
            if (n2 > 0){
                double resultado = n1/n2;
                System.out.printf("%.2f / %.2f = %.2f", n1, n2, resultado);
            }else{
                System.out.println("impossivel dividir!");
            }
        }else{
            System.out.println("Sinal Inválido");
        }
        entrada.close();
    }
}

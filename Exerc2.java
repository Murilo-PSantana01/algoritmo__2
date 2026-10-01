import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int i = 1;
        int par = 0;
        int impar = 0;

        while(i <= 10) {
            System.out.println("Digite o " + i + "° número");
            int n = entrada.nextInt();
            int resto = n % 2;
            if(resto == 0) {
                par++;
            } else {
                impar++;
            }
            i++;
        }
        System.out.println("O total de pares é: " + par);
        System.out.println("O total de impares é: " + impar);
        
        entrada.close();
    }
}
import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        Scanner entrada
         = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int n = entrada.nextInt();
        int i = 1;
        int r;

        while(i <= n) {
            r = i * 5;
            System.out.printf("5 x %d = %d%n", i, r);
            i++;
        }
        entrada.close();
    }
}
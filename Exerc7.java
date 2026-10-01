import java.util.Scanner;

public class Exerc7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 1;
        int idealWeight = 0;

        while(i <= 10) {
            System.out.print("Insira a altura: ");
            double height = entrada.nextFloat();
            System.out.print("Insira o peso: ");
            double weight = entrada.nextFloat();

            double imc = weight / Math.pow(height,2.0);

            System.out.printf("IMC: %.2f%n", imc);
            if (imc > 18.5 && imc < 24.9) {
                idealWeight++;
            }
            i++;
        }
        System.out.println(idealWeight + " pessoas estão no peso ideal");
        entrada.close();
    }
}
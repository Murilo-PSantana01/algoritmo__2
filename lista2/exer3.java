//Murilo Prates Santana
package lista2;
import java.util.Scanner;



public class exer3 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        char periodo;

        System.out.println("Insira o período do dia:");
        System.out.println("Matutino");
        System.out.println("Vespertino");
        System.out.println("Noturno");
        periodo = entrada.next().toUpperCase().charAt(0);

        switch (periodo){
            case 'M':
                System.out.println("Bom dia!");
            break;

            case 'V':
                System.out.println("Boa tarde!");
            break;

            case 'N':
                System.out.println("Boa noite!");
            break;

            default:
                System.out.println("Entrada invalida,Tente novamente");
        }
        entrada.close();
    }
}

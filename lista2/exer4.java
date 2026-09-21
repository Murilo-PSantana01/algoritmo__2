//Murilo Prates Santana
package lista2;
import java.util.Scanner;


public class exer4 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        char plano;

        System.out.println("Plano ===== Aumento.");
        System.out.println("A ========== 10%");
        System.out.println("B ========== 15%");
        System.out.println("C ========== 20%");
        plano = entrada.next().toUpperCase().charAt(0);
        System.out.println("Insira o salarío:");
        double salario = entrada.nextDouble();
  
        double novosalario = 0;

        switch (plano){
            
            case 'A':
                novosalario = salario + ( salario * 0.1);
                System.out.println("Salário atualizado: " + novosalario);
            break;
            
            case 'B':
                novosalario = salario + ( salario * 0.15);
                System.out.println("Salário atualizado: " + novosalario);
            break;

            case 'C':
                novosalario = salario + ( salario * 0.2);
                System.out.println("Salário atualizado: " + novosalario);
            break;
            
            default:
                System.out.println("Plano de trabalho inválido!");

        }
    }
 }   


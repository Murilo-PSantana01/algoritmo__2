package lista1;
import java.util.Scanner;

public class exerc12 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o salário: ");
        double salario = entrada.nextDouble();
        double desconto = 0;

        if (salario <= 600){
            System.out.println("Isento de INSS");
        }else if((salario > 600) && (salario<=1200)){
            desconto = salario * 0.2;
            System.out.println("Desconto do INSS de 20% R$" + desconto);
        }else if ((salario > 1200) && (salario <= 2000)){
            desconto = salario * 0.25;
            System.out.println("Desconto do INSS de 25% R$"+ desconto);
        }else{
            desconto = salario * 0.3;
            System.out.println("Desconto do INSS de 30% R$" + desconto);
        }
        entrada.close();
    }
}

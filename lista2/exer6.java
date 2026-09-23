package lista2;
import java.util.Scanner;

public class exer6 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Código     Produto       ");
        System.out.println("100     Cachorro Quente  ");
        System.out.println("101     Bauru Simples    ");
        System.out.println("102     Bauru com Ovo    ");
        System.out.println("103     Hambúrguer       ");
        System.out.println("104     Cheeseburguer    ");
        System.out.println("105     Refrigerante     ");
        System.out.println("Insira o código do produto: ");
        int id = entrada.nextInt();

        System.out.println("Insira a quantidade:");
        int qnt = entrada.nextInt();

        double preco = 0;
        switch(id){
            case 100 -> {
                preco = 1.2 * qnt;
                System.out.println("Cachorro Quente");
                System.out.printf("%d unidades - R$ %.2f", qnt, preco);
            }
 
            case 101 -> {
                preco = 1.3 * qnt;
                System.out.println("Bauru Simples");
                System.out.printf("%d unidades - R$ %.2f", qnt, preco);
            }
 
            case 102 -> {
                preco = 1.5 * qnt;
                System.out.println("Bauru com Ovo");
                System.out.printf("%d unidades - R$ %.2f", qnt, preco);
            }
 
            case 103 -> {
                preco = 1.2 * qnt;
                System.out.println("Hambúrguer");
                System.out.printf("%d unidades - R$ %.2f", qnt, preco);
            }
 
            case 104 -> {
                preco = 1.3 * qnt;
                System.out.println("Cheeseburguer");
                System.out.printf("%d unidades - R$ %.2f", qnt, preco);
            }
 
            case 105 -> {
                preco = 1.0 * qnt;
                System.out.println("Refrigerante");
                System.out.printf("%d unidades - R$ %.2f", qnt, preco);
            }
 
            default -> System.out.println("Código do produto inválido!");
        }
        entrada.close();
    }
}

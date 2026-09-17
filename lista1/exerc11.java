package lista1;
import java.util.Scanner;

public class exerc11 {
    
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.println("Digite a idade do nadador: ");
        idade = entrada.nextInt();

        if ((idade  >= 5) && (idade <= 7)){
            System.out.println("Catergotia infantil A");
        }else if ((idade >= 8) && (idade <= 10)){
            System.out.println("Categoria infantil B");
        }else if ((idade >= 11) && (idade <= 13)){
            System.out.println("Categoria juvenil A");
        }else if ((idade >= 14) && (idade<=17)){
            System.out.println("Categoria juvenil B");
        }else if (idade >= 18){
            System.out.println("Categoria sênior");
        }else {
            System.out.println("Muito novo, não existem categorias para esta idade");
        }
        entrada.close();
    }
}

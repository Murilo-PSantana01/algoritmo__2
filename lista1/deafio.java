package lista1;
import java.util.Scanner;

public class deafio {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Possui cidadania brasileira? (S/N): ");
        char cidadania = entrada.next().toUpperCase().charAt(0);
        System.out.print("O título de eleitor esta regularizado? (S/N):");
        char tEleitor = entrada.next().toUpperCase().charAt(0);
        System.out.print("Digite a idade: ");
        int idade = entrada.nextInt();

        if (cidadania == 'S' && tEleitor =='S'){
            if (idade >= 18 && idade <= 70){
                System.out.println("A pessoa esra apta a votar e o voto é obrigatorio.");
            }else if (( idade >= 16 &&  idade < 18) || idade > 70){
                System.out.println("A pessoa nao tem idade para votar");
            }
        }else{
            System.out.println("A pessoa não esta apta a votar");
            System.out.println("Motivo: Necessário ter cidadania ativa e titulo eleitoral regularizado");
        }
        entrada.close();
    }
}

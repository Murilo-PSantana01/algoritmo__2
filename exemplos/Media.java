package exemplos;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        int contador;
        double nota,media,acumuladorNotas;
        contador= 0;
        acumuladorNotas = 0;

        Scanner entrada = new Scanner(System.in);
    
        while(contador <5){
            contador++;
            System.out.println("Digite uma nota "+ contador);
            nota= entrada.nextDouble();
            acumuladorNotas= acumuladorNotas + nota;
        }
        media = acumuladorNotas / contador;
        System.out.println("A media final é: "+ media);
        entrada.close();
    }
}

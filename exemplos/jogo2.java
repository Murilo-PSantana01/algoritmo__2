package exemplos;
    import java.util.Scanner;


public class jogo2{


    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de pontos do jogador 1 na fase 1");
        Double pontos = entrada.nextDouble();

        if (pontos >= 1000){
            System.out.println("Parabens! Você passou para a fase 2. ");
        }else{
            System.out.println("Você não atingiou a pontuação necessária. Tente novamente.");
        }
        System.out.println("Siga para a proxima etapa. ");
        
        entrada.close();

    }
}     
    


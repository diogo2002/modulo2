package N�oSeiOQue�ParaFazer;
import java.util.Scanner;

public class N�oSeiOQue�ParaFazerParte2 {

    public static void main(String[] args) {

        double N1;
        double N2;
        int Operacao;

        Scanner entrada = new Scanner(System.in);

        
        System.out.println("Digite o Primeiro Numero");
        N1=entrada.nextInt();

        System.out.println("Digite o Segundo Numero");
        N2=entrada.nextInt();
        System.out.println("Digite a opera��o que deseja efetuar?");
        Operacao=(int)entrada.next() .charAt(0); 
        switch (Operacao){

            case '+':
                System.out.println("O Resultado da Soma �:"+(N1+N2));
                break;

            case '-':
                System.out.println("O Resultado da subtra��o �:"+(N1-N2));
                break;

            case '*':
                System.out.println("O Resultado da Multiplica��o �:"+(N1*N2));
                break;

            case '/':
                System.out.println("O Resultado da Divis�o �:"+(N1/N2));
                break;

            default:
                System.out.println("Opera��o inv�lida, tente Novamente!");
                break;

        }
            
    }

}
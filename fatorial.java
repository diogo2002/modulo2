package aula;
import java.util.Scanner;
public class fatorial {
public static void main(String[] args) throws Exception {
int N, Fat = 1;
Scanner LerS=new Scanner (System.in);
System.out.print("Digite um inteiro positivo inferior a 32: ");
N=LerS.nextInt();
for (int M=N ; M>=1 ; M--)
Fat*=M ; //Fat = Fat*M;
System.out.printf(" %d! = %d" ,  N , Fat);
}
}
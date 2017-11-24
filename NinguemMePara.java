package OlaVoltei;
import java.util.Scanner;
public class NinguemMePara {

	public static void main(String[] args) {
    Scanner L = new Scanner (System.in);
    int num;
	int soma=0;
	System.out.print("Quantos numeros a introduzir?");
	num = L.nextInt();
    for (int I=1 ; I<=10 ;I++) {
    	soma+=I;
    	
    }
    System.out.println(soma);
    
    

	}

}

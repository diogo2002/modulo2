package a;
import java.util.Scanner;
public class a2 {

	public static void main(String[] args) {
		double c1, c2, h;
System.out.print("C1?");
Scanner LerS=new Scanner(System.in);
c1=LerS.nextDouble();

System.out.print("C2?");
c2=LerS.nextDouble();

h=Math.sqrt(c1*c1+c2*c2);

System.out.printf("H=%.0f", h);
	}

}

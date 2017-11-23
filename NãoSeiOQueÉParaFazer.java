package N„oSeiOQue…ParaFazer;
import java.util.Scanner;
public class N„oSeiOQue…ParaFazer {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double Cognitivo;
		double Atitudes;
		double NotaFinal;
		String Nome;
		System.out.print("Qual È o nome do/a aluno/a?");
	    Nome = ler.next();
		System.out.print("Qual È o valor do dominio Cognitivo?");
		Cognitivo = ler.nextDouble();
		System.out.print("Qual È o valor do dominio Atitudes?");
		Atitudes = ler.nextDouble();
		NotaFinal = (0.6*Cognitivo + 0.4*Atitudes);
		System.out.print("A nota final da "+Nome+" È:" + NotaFinal);
		if (NotaFinal<10)
		System.out.print("Reprovado");
		if (NotaFinal>=10)
		System.out.print("Aprovado");

	}

}

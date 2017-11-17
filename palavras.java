package palavras;

import java.util.Scanner;

public class palavras {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double q, w , e;
        double max = 0;
        System.out.print("Qual o primeiro numero?");
        q =ler.nextDouble();
        System.out.print("Qual o segundo numero?");
        w = ler.nextDouble();
        System.out.print("Qual o terceiro numero?");
        e = ler.nextDouble();
        if (q>w && q>e)
        max = q;
        
        if (w>q && w>e)
        max = w;
        if (e>q && e>w)
        max = e;
        
        System.out.print("O máximo é" +max);
        
    }
    
}
import java.io.IOException;
import java.util.Scanner;

public class ex5 {
    public static void main(String [] args) throws IOException {
        try(Scanner leitor = new Scanner(System.in)){
            int inicial  = leitor.nextInt();
            int total    = inicial;
            int notas100 = 0;
            int notas50  = 0;
            int notas20  = 0;
            int notas10  = 0;
            int notas5   = 0;
            int notas2   = 0;
            int notas1   = 0;

            if (total >= 100){
                notas100 = total/100;
                total   -= notas100*100;
            }

            if (total >= 50){
                notas50 = total/50;
                total  -= notas50*50;
            }

            if (total >= 20){
                notas20 = total/20;
                total  -= notas20*20;
            }

            if (total >= 10){
                notas10 = total/10;
                total  -= notas10*10;
            }

            if (total >= 5){
                notas5 = total/5;
                total -= notas5*5;
            }

            if (total >= 2){
                notas2 = total/2;
                total -= notas2*2;
            }

            if (total >= 1){
                notas1 = total/1;
                total -= notas1*1;
            }

            System.out.println("Valor inserido = "    + inicial);

            System.out.println("Notas de R$100,00 = " + notas100);

            System.out.println("Notas de R$50,00 = "  + notas50);

            System.out.println("Notas de R$20,00 = "  + notas20);

            System.out.println("Notas de R$10,00 = "  + notas10);

            System.out.println("Notas de R$5,00 = "   + notas5);

            System.out.println("Notas de R$2,00 = "   + notas2);

            System.out.println("Notas de R$1,00 = "   + notas1);

        }
        
    }
    
}

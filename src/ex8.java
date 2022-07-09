import java.io.IOException;
import java.util.Scanner;

public class ex8 {
    public static void main(String [] args) throws IOException {
        try(Scanner leitor = new Scanner(System.in)){
            System.out.println("Insira o número de divisões que serão feitas: ");
            int numDivisoes = leitor.nextInt();
            int X = 0;
            int Y = 0;
            for (int i=0; i < numDivisoes; i++){
                System.out.println("Dividendo: ");
                X = leitor.nextInt();
                System.out.println("Divisor: ");
                Y = leitor.nextInt();
                System.out.println("Resultado: "+(double)X/Y);
            }       
        }
    }
    
}

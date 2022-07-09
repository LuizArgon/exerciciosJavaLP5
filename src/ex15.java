import java.io.IOException;
import java.util.Scanner;
public class ex15 {
    public static void main(String [] args) throws IOException {
        try(Scanner leitor = new Scanner(System.in)){
            int x = leitor.nextInt();
            int total = 0;
            int cont = 0;
            while (x >= 0){
                total += x;
                cont++;
                x = leitor.nextInt();
            }
            double media = total/cont;
            System.out.println(String.format("%.2f", media));
        }
    }
}
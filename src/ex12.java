import java.io.IOException;
import java.util.Scanner;
public class ex12 {
    public static void main(String [] args) throws IOException {
        try(Scanner leitor = new Scanner(System.in)){
            int x = leitor.nextInt();
            int y = leitor.nextInt();
            while (x != y){
                if (x > y){
                    System.out.println("Decrescente");
                } else {
                    System.out.println("Decrescente");
                }
                x = leitor.nextInt();
                y = leitor.nextInt();
            }
        }
    }
}
import java.io.IOException;
import java.util.Scanner;
public class ex10 {
    public static void main(String [] args) throws IOException {
        try(Scanner leitor = new Scanner(System.in)){
            int x = leitor.nextInt();
            for (int i = 1; i <= x; i++){
                int resp = leitor.nextInt();
                System.out.println("Resposta " + i + " = " + resp);
            }
        }
    }
}
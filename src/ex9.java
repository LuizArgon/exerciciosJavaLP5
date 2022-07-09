import java.io.IOException;
import java.util.Scanner;
public class ex9 {
    public static void main(String [] args) throws IOException {
        try(Scanner leitor = new Scanner(System.in)){
            int x = leitor.nextInt();

            for (int i = 1; i <= x; i++){
                System.out.println(i + " " + i*i + " " + i*i*i);
            }
        
        }
    }
}

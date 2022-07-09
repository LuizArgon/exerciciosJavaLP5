import java.io.IOException;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws IOException{
        try (Scanner leitor = new Scanner(System.in)) {
            int val1 = leitor.nextInt();

            int val2 = leitor.nextInt();

            int PROD = val1*val2;

            System.out.println("Prod = " + PROD);
        }

    }

    
}

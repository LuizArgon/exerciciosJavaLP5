import java.io.IOException;
import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) throws IOException {
        try (Scanner leitor = new Scanner(System.in)) {
            int A = leitor.nextInt();
            int B = leitor.nextInt();
            int C = leitor.nextInt();
            int D = leitor.nextInt();
            if (B > C && D > A && D > 0 && C > 0 && (C + D) > (A + B) && A % 2 == 0) {
                System.out.println("Valores aceitos.");
            } else {
                System.out.println("Valores nao aceitos.");
            }
        }
    }
}
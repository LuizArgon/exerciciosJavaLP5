import java.io.IOException;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) throws IOException{
        try (Scanner leitor = new Scanner(System.in)){
            double A = leitor.nextDouble();
            double B = leitor.nextDouble();
            double C = leitor.nextDouble();

            if((A == 0) | (B*B-4*A*C < 0)){
                System.out.println("Não é possível calcular.");
                return;
            }

            double delta = B*B-4*A*C;

            double raiz1 = (-B + Math.sqrt(delta))/(2*A);
            double raiz2 = (-B - Math.sqrt(delta))/(2*A);

            System.out.println(String.format("Primeira raiz: %.5f", raiz1));
            System.out.println(String.format("Segunda raiz: %.5f", raiz2));
        }
    }
    
}

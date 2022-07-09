import java.io.IOException;
import java.util.Scanner;
public class ex6 {
    public static void main(String [] args) throws IOException {
        try(Scanner leitor = new Scanner(System.in)){
            int contPositivos = 0;
            for (int i=0; i <6; i++){
                int x = leitor.nextInt();
                if (x > 0){
                    contPositivos++;
                }
            }
            System.out.println("Número de valores positivos: " + contPositivos);
        }
    }
}

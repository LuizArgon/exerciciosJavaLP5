import java.io.IOException;
import java.util.Scanner;
public class ex7 {
    
    public static void main(String [] args) throws IOException {
        try(Scanner leitor = new Scanner(System.in)){
            int contPares = 0;
            for (int i=0; i < 5; i++){
                int x = leitor.nextInt();
                if (x%2 == 0){
                    contPares++;
                }
            }
            System.out.println("Número de valores pares: " + contPares);       
        }
    }
    
}

import java.io.IOException;
import java.util.Scanner;
public class ex13 {
    public static void main(String [] args) throws IOException {
        int senha = 2002;
        try(Scanner leitor = new Scanner(System.in)){
            int teste = leitor.nextInt();

            while (teste != senha){
                System.out.println("SENHA INVÁLIDA");
                teste = leitor.nextInt();
            }
            System.out.println("ACESSO PERMITIDO");

        }
        

    }
}

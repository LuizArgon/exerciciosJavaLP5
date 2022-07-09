import java.io.IOException;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) throws IOException{
        try (Scanner leitor = new Scanner(System.in)) {
            String nome = leitor.next();

            double salario = leitor.nextDouble();
            double vendas  = leitor.nextDouble();

            double pagamento = salario + (vendas*0.15);

            System.out.println("-------------------------\nRecebedor: " + nome);
            System.out.println(String.format("\nTOTAL = R$%.2f", pagamento));
        }


    }
}

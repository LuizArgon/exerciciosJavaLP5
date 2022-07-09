import java.io.IOException;
import java.util.Scanner;
public class ex14 {
    public static void main(String [] args) throws IOException {
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        try(Scanner leitor = new Scanner(System.in)){
            int x = leitor.nextInt();
            while (x != 4){
                switch(x){
                    case 1:
                        alcool++;
                        break;
                    case 2:
                        gasolina++;
                        break;
                    case 3:
                        diesel++;
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Código inválido.");
                        break;       
                           
                }
                System.out.println("MUITO OBRIGADO!");
                System.out.println("Álcool: " + alcool);
                System.out.println("Gasolina: " + gasolina);
                System.out.println("Diesel: " + diesel);
                x = leitor.nextInt();
            }
        }
    }
}

import java.io.IOException;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) throws IOException {
    
        try (Scanner leitor = new Scanner(System.in)) {
			int tempo =  leitor.nextInt();
			int velocidade =  leitor.nextInt();
   
			double distancia= tempo*velocidade;
			double media = distancia/12;
   
			System.out.println(media);
		}
        
    }
}


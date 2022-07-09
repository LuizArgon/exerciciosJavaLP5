import java.io.IOException;
import java.util.Scanner;
public class ex18 {
    public static void main(String[] args) throws IOException {
        try (Scanner leitor = new Scanner(System.in)) {
            double N1 = leitor.nextDouble();
            double N2 = leitor.nextDouble();
            double N3 = leitor.nextDouble();
            double N4 = leitor.nextDouble();
            double media = ((N1*2) + (N2*3) + (N3*4) + (N4*1)) / 10;
            System.out.println(String.format("Media: %.1f" , media));
            if (media >= 7) {
                System.out.println("Aluno aprovado.");
            } else if (media < 7 && media >= 5) {
                System.out.println("Aluno em exame.\nInsira a nota do exame: ");
                double notaExame = leitor.nextDouble();
                System.out.println(String.format("Nota do exame: %.1f", notaExame));
                media = (media + notaExame) / 2;
                if (media >= 5) {
                    System.out.println("Aluno aprovado.");
                } else {
                    System.out.println("Aluno reprovado.");
                }
                System.out.println(String.format("Mediafinal: %.1f", media));
            } else {
                System.out.println("Aluno reprovado.");
            }
               
        }
    }
}
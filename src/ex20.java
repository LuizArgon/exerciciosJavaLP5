import java.io.IOException;
import java.util.Scanner;
public class ex20 {
    public static void main(String[] args) throws IOException {
        try (Scanner leitor = new Scanner(System.in)) {
            int A = leitor.nextInt();
            int B = leitor.nextInt();
            int C = leitor.nextInt();
            System.out.println("");
            if (A < B && A < C) {
                System.out.println(A);
                if (B < C){
                    System.out.println(B);
                    System.out.println(C);
                } else {
                    System.out.println(C);
                    System.out.println(B);
                }
            } else if (B < A && B < C){
                System.out.println(B);
                if(A < C){
                    System.out.println(A);
                    System.out.println(C);
                } else {
                    System.out.println(C);
                    System.out.println(A);
                }
            } else {
                System.out.println(C);
                if(A < B){
                    System.out.println(A);
                    System.out.println(B);
                } else {
                    System.out.println(B);
                    System.out.println(A);
                }
            }  
            System.out.println("");
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);
        }
    }
}

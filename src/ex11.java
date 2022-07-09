import java.io.IOException;
public class ex11 {
    public static void main(String [] args) throws IOException {
        int i = 1;
        int j = 60;

        while (j >= 0){
            System.out.println("I = " + i + "  J = " + j);
            j -= 5;
            i += 3;
        }
    }
}
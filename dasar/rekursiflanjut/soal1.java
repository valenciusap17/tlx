import java.util.Collections;
import java.util.Scanner;

public class soal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        recursion(h);
        scanner.close();
    }

    static void recursion(int h) {
        if (h > 0) {
            recursion(h - 1);
            System.out.println(String.join("", Collections.nCopies(h, "*")));
            recursion(h - 1);
            return;
        }
    }

}

import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String value = input.next();
        for (int i = 0; i < value.length(); i++) {
            char n = value.charAt(i);
            int a = n;
            if (n == '_') {
                if (i + 1 < value.length() && value.charAt(i + 1) != '_') {
                    char q = value.charAt(i + 1);
                    int v = q;
                    v -= 32;
                    n = (char) v;
                    i += 1;
                } else {
                    continue;
                }
            } else if (a <= 90) {
                System.out.print("_");
                a += 32;
                n = (char) a;
            }
            System.out.print(n);
        }
        input.close();
    }
}

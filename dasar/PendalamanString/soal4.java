import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String value = input.next();
        for (int i = 0; i < value.length(); i++) {
            char n = value.charAt(i);
            int now = n;
            if (now >= 97) {
                now -= 32;
            } else {
                now += 32;
            }
            System.out.print((char) now);
        }
        input.close();
    }
}

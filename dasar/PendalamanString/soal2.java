import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String target = input.next();
        int numAfter = input.nextInt();
        int max = 122;
        for (int i = 0; i < target.length(); i++) {
            char now = target.charAt(i);
            int value = now;
            value += numAfter;
            if (value > max) {
                value -= 26;
            }
            System.out.print((char) value);
        }

        input.close();
    }
}

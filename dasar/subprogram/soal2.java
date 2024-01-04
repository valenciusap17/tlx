import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        System.out.println(reverse(reverse(first) + reverse(second)));
    }

    // 110 -> 11
    public static int reverse(int x) {
        int result = 0;
        while (x > 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        return result;
    }
}

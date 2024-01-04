import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(recursion(a));
    }

    static String recursion(int x) {
        if (x == 1) {
            return "1";
        }
        if (x % 2 == 1) {
            return recursion(x / 2) + "1";
        } else {
            return recursion(x / 2) + "0";
        }
    }
}

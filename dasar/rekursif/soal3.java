import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        System.out.println(recursion(a));
    }

    static String recursion(String x) {
        if (x.length() <= 1) {
            return "YA";
        }
        if (x.charAt(0) == x.charAt(x.length() - 1)) {
            return recursion(x.substring(1, x.length() - 1));
        }
        return "BUKAN";
    }
}

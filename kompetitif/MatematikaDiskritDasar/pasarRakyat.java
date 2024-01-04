import java.util.Scanner;

public class pasarRakyat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iterate = input.nextInt();
        int kpkResult = 1;
        for (int i = 0; i < iterate; i++) {
            int number = input.nextInt();
            kpkResult = kpk(kpkResult, number);
        }
        System.out.println(kpkResult);
        input.close();
    }

    public static int kpk(int a, int b) {
        return (a * b) / fpb(a, b);
    }

    public static int fpb(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return fpb(b, a % b);
        }
    }
}

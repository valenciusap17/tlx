import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int K = input.nextInt();
        int x = input.nextInt();
        int result = 0;
        for (int i = 0; i < K; i++) {
            x = wanted(A, B, x);
        }
        System.out.println(x);
    }

    public static int wanted(int A, int B, int x) {
        return Math.abs(A * x + B);
    }
}

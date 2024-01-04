import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int K = input.nextInt();
        int x = input.nextInt();
        System.out.println(recursion(A, B, K, x));

    }

    static int recursion(int A, int B, int K, int x) {
        if (K == 0) {
            return x;
        }
        K--;
        return Math.abs(A * recursion(A, B, K, x) + B);
    }
}

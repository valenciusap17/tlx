import java.util.ArrayList;
import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int D = input.nextInt();
        int[] x = new int[1000];
        int[] y = new int[1000];
        int largest = -1;
        int smallest = 2000000;
        for (int i = 0; i < N; i++) {
            x[i] = input.nextInt();
            y[i] = input.nextInt();
            if (i >= 1) {
                for (int j = 0; j < i; j++) {
                    int result = calculate(x[j], y[j], x[i], y[i], D);
                    // System.out.println("result" + result);
                    // System.out.println(x[j] + " " + y[j] + " " + x[i] + " " + y[j] + " " + D);
                    if (result < smallest) {
                        smallest = result;
                    }
                    if (result > largest) {
                        largest = result;
                    }
                }
            }
        }
        System.out.println(smallest + " " + largest);

    }

    public static int calculate(int a, int b, int c, int e, int D) {
        return (int) (Math.pow(Math.abs(a - c), D)) + (int) (Math.pow(Math.abs(b - e), D));
    }
}

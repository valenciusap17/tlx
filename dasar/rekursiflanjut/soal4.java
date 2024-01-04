import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        int[] catat = new int[N + 1];
        boolean[] pernah = new boolean[N + 1];
        recursion(0, N, K, catat, pernah);
        input.close();
    }

    static void recursion(int kedalaman, int N, int K, int[] catat, boolean[] pernah) {
        if (kedalaman >= K) {
            boolean menaik = true;
            for (int i = 0; i < K - 1; i++) {
                if (catat[i] > catat[i + 1]) {
                    menaik = false;
                }
            }
            if (menaik) {
                for (int i = 0; i < K; i++) {
                    System.out.print(catat[i]);
                    if (i < K - 1)
                        System.out.print(" ");
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= N; i++) {
                if (!pernah[i]) {
                    pernah[i] = true;
                    catat[kedalaman] = i;
                    recursion(kedalaman + 1, N, K, catat, pernah);
                    pernah[i] = false;
                }
            }
        }
    }
}

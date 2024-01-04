import java.util.Scanner;
import java.util.ArrayList;

public class soal2 {
    static int N;
    static int cek;
    static boolean zigzag;
    static int[] pernah = new int[10], catat = new int[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        if (N == 1) {
            System.out.println(1);
        } else if (N == 2) {
            System.out.print(12);
            System.out.println();
            System.out.print(21);
        }
        tulis(0);
    }

    static void tulis(int kedalaman) {
        if (kedalaman >= N) {
            zigzag = false;
            for (int i = 1; i < N - 1; i++) {
                if (catat[i - 1] > catat[i] && catat[i + 1] > catat[i]
                        || catat[i - 1] < catat[i] && catat[i + 1] < catat[i]) {
                    zigzag = true;
                } else {
                    zigzag = false;
                    break;
                }
            }
            if (zigzag) {
                for (int i = 0; i < N; i++) {
                    System.out.print(catat[i]);
                }
                System.out.println();
            }
            ;
        } else {
            for (int i = 0; i < N; i++) {
                if (pernah[i] == 0) {
                    pernah[i] = 1;
                    catat[kedalaman] = i + 1;
                    tulis(kedalaman + 1);
                    pernah[i] = 0;
                }
            }
        }
    }
}

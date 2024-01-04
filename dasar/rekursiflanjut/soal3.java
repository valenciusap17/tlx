import java.util.Scanner;

public class soal3 {
    static int[] catat = new int[11];
    static int N;
    static int K;
    static int leftPointer = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();
        tulis(1);
    }

    static void tulis(int kedalaman){
        if (kedalaman == K){
            leftPointer++;
            for(int i = 1; i <= K; i++ ){
                System.out.print(catat[i]);
            }
            System.out.println();
        } else {
            for(int i = catat[kedalaman]; i <= N; i++){
                catat[]
            }
        }
    }
}

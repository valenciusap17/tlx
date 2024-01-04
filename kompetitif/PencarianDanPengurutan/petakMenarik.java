import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class petakMenarik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int column = in.nextInt();
        int K = in.nextInt();
        Map<Integer, String> map = new HashMap<>();
        // buat 2d array nya dulu
        int[][] matrix = new int[rows][column];
        int minR = Integer.MAX_VALUE;
        int minC = Integer.MAX_VALUE;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        boolean check = false;
        for (int j = 0; j < column; j++) {
            for (int i = 0; i < rows; i++) {
                int temp = 1;
                if (i - 1 >= 0)
                    temp *= matrix[i - 1][j];
                if (j - 1 >= 0)
                    temp *= matrix[i][j - 1];
                if (i + 1 < rows)
                    temp *= matrix[i + 1][j];
                if (j + 1 < column)
                    temp *= matrix[i][j + 1];

                if (temp == K) {
                    check = true;
                    System.out.println(String.format("%s %s", i + 1, j + 1));
                    break;
                }
                // System.out.print(matrix[i][j]);
            }
            if (check)
                break;
            // System.out.println();
        }
        if (!check)
            System.out.println("0 0");

        in.close();
    }
}

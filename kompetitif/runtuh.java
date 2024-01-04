import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class runtuh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        int C = in.nextInt();
        int bottomWhite = 0;

        int[][] matrix = new int[R][C];
        for (int i = 0; i < R; i++) {
            String rows = in.next();
            int counter = 0;
            for (int j = 0; j < C; j++) {
                int value = Integer.parseInt(String.valueOf(rows.charAt(j)));
                matrix[i][j] = value;
                if (value == 1)
                    counter++;
            }
            if (counter == C) {
                for (int k = 0; k < C; k++) {
                    matrix[i][k] = 0;
                }
                bottomWhite = i;
            }
        }

        //

        for (int i = 0; i < C; i++) {
            int spaceToFall = 0;
            for (int j = R - 1; j >= 0; j--) {
                if (matrix[j][i] == 0) {
                    spaceToFall++;
                } else {
                    if (bottomWhite > j) {
                        matrix[j + spaceToFall][i] = 1;
                        matrix[j][i] = 0;
                    } else {
                        spaceToFall = 0;
                    }

                }
            }
        }
        while ((bottomWhite = removeLine(R, C, matrix)) != 0) {
            dropMatrix(C, R, matrix, bottomWhite);
        }

        // PRINTING SOLUTION

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    static int removeLine(int R, int C, int[][] matrix) {
        int result = 0;
        for (int i = 0; i < R; i++) {
            int counter = 0;
            for (int j = 0; j < C; j++) {
                if (matrix[i][j] == 1)
                    counter++;
            }
            if (counter == C) {
                for (int k = 0; k < C; k++) {
                    matrix[i][k] = 0;
                }
                result = i;
            }
        }
        return result;
    }

    static void dropMatrix(int C, int R, int[][] matrix, int bottomWhite) {
        for (int i = 0; i < C; i++) {
            int spaceToFall = 0;
            for (int j = R - 1; j >= 0; j--) {
                if (matrix[j][i] == 0) {
                    spaceToFall++;
                } else {
                    if (bottomWhite > j) {
                        matrix[j + spaceToFall][i] = 1;
                        matrix[j][i] = 0;
                    } else {
                        spaceToFall = 0;
                    }

                }
            }
        }
    }
}

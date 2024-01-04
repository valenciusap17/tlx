import java.util.Scanner;

public class soal7 {
    static int result = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();
        int[][] matrix = new int[rows][columns];
        boolean[][] visited = new boolean[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        int x = in.nextInt();
        int y = in.nextInt();
        int numberWanted = matrix[x][y];
        recursion(matrix, rows, columns, x, y, numberWanted, visited);
        System.out.println(result * (result - 1));
        in.close();
    }

    static void recursion(int[][] matrix, int rows, int columns, int x, int y, int numberWanted, boolean[][] visited) {
        if (x >= 0 && x < rows && y >= 0 && y < columns) {
            if (!visited[x][y]) {
                if (matrix[x][y] == numberWanted) {
                    result++;
                    visited[x][y] = true;
                    recursion(matrix, rows, columns, x - 1, y, numberWanted, visited);
                    recursion(matrix, rows, columns, x + 1, y, numberWanted, visited);
                    recursion(matrix, rows, columns, x, y - 1, numberWanted, visited);
                    recursion(matrix, rows, columns, x, y + 1, numberWanted, visited);

                }
            }
        }
    }
}

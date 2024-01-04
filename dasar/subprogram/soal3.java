import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] array = new int[1000000];
        Set<Integer> b = new HashSet<>();
        ArrayList<Integer> a = new ArrayList<>();
        int iterator = 2;
        while (number != 1) {
            int counter = 0;
            while (number % iterator == 0) {
                counter++;
                number = number / iterator;
            }
            if (counter == 1) {
                System.out.print(iterator);
            } else if (counter > 1) {
                System.out.print(iterator + "^" + counter);
            }
            if (number != 1 && counter >= 1) {
                System.out.print(" x ");
            }
            iterator++;

        }

        // StringBuilder result = new StringBuilder();
        // for (int value : b) {
        // if (array[value] <= 1) {
        // result.append(value).append(" x ");
        // } else {
        // result.append(value).append("^").append(array[value]).append(" x ");
        // }
        // }

        // System.out.println(result.substring(0, result.length() - 2));
    }
}

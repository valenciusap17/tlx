import java.util.Scanner;
import java.util.ArrayList;

public class primaKeK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int iter = in.nextInt();
        int max = 0;
        ArrayList<Integer> wanted = new ArrayList<>();
        for (int i = 0; i < iter; i++) {
            int number = in.nextInt();
            max = Math.max(max, number);
            wanted.add(number);
        }
        System.out.println(isPrimeNumber(4));
        // ArrayList<Integer> result = nthPrimeNumber(max);
        // for (int i = 0; i < wanted.size(); i++) {
        // System.out.println(result.get(wanted.get(i) - 1));
        // }
        in.close();
    }

    static ArrayList<Integer> nthPrimeNumber(int N) {
        ArrayList<Integer> result = new ArrayList<>();
        int index = 2;
        while (result.size() != N) {
            if (isPrimeNumber(index))
                result.add(index);
            index++;
        }
        return result;
    }

    static boolean isPrimeNumber(int N) {
        if (N <= 1) {
            return false;
        } else {
            for (int i = 2; i * i <= N; i++) {
                System.out.println(i);
                if (N % i == 0) {
                    return false;
                }
                System.out.println(i);
            }
        }
        return true;
    }

}

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;

public class wartel {
    static class Pair {
        String key;
        String value;

        Pair(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int Q = input.nextInt();
        Pair[] pairs = new Pair[N];

        for (int i = 0; i < N; i++) {
            String key = input.next().intern();
            String value = input.next().intern();
            pairs[i] = new Pair(key, value);
        }

        for (int i = 0; i < Q; i++) {
            String name = input.next();
            int l = 0;
            int r = N - 1;
            int result = -1;
            while (l <= r) {
                int mid = l + (r - l) / 2;

                int compare = name.compareTo(pairs[mid].key);
                if (compare == 0) {
                    result = mid;
                    break;
                } else if (compare > 0) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            if (result == -1)
                System.out.println("NIHIL");
            else
                System.out.println(pairs[result].value);
        }
        input.close();

    }

    // static String binarySearch(String target, int l, int r) {
    // if (r >= l) {
    // int mid = l + (r - l) / 2;

    // int compare = target.compareTo(names.get(mid));

    // if (compare == 0) {
    // return names.get(mid);
    // } else if (compare > 0) {
    // return binarySearch(target, mid + 1, r);
    // } else {
    // return binarySearch(target, l, mid - 1);
    // }
    // }
    // return "";
    // }
}

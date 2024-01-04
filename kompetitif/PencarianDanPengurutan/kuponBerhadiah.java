import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class kuponBerhadiah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int iterate = input.nextInt();
        int realNum = input.nextInt();
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < iterate; i++) {
            int number = input.nextInt();
            int current = Math.abs(realNum - number);
            diff = Math.min(diff, current);
            if (map.get(current) == null)
                map.put(current, number);
            else {
                map.put(current, Math.min(map.get(current), number));
            }
        }
        System.out.println(map.get(diff));
        input.close();
    }
}
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class wartelT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iterate = input.nextInt();
        int wanted = input.nextInt();
        String[] key = new String[iterate];
        String[] value = new String[iterate];
        for (int i = 0; i < iterate; i++) {
            key[i] = input.next();
            value[i] = input.next();
        }
        boolean check = false;
        for (int i = 0; i < wanted; i++) {
            String result = input.next();
            for (int j = 0; j < key.length; j++) {
                if (key[j].equals(result)) {
                    System.out.println(value[j]);
                    check = true;
                    break;
                }
            }
        }
        if (!check)
            System.out.println("NIHIL");

        input.close();
    }
}

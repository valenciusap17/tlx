import java.util.Scanner;

public class hapusSatuSaja {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.next();
        String B = in.next();
        boolean result = false;

        if (A.length() != B.length() + 1) {
            System.out.println("Wah, tidak bisa :(");
            return;
        }

        for (int i = 0; i < A.length(); i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < A.length(); j++) {
                if (i == j)
                    continue;
                temp.append(A.charAt(j));
            }
            if (temp.toString().equals(B)) {
                result = true;
                break;
            }
        }

        if (result)
            System.out.println("Tentu saja bisa!");
        else
            System.out.println("Wah, tidak bisa :(");

        in.close(); // Good practice to close the scanner
    }
}
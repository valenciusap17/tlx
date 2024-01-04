import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(recursion(a));
        input.close();
    }

    static int recursion(int x) {
        if (x == 1)
            return 1;

        int curr = 0;
        if (x % 2 == 0) {
            curr = x / 2;
        } else {
            curr = x;
        }
        return curr * recursion(x - 1);
    }
}
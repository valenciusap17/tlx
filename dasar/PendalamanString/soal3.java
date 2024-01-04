import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        String s3 = input.nextLine();
        String s4 = input.nextLine();
        int index = s1.indexOf(s2);
        s1 = s1.substring(0, index) + s1.substring(index + s2.length());
        int index3 = s1.indexOf(s3);
        s1 = s1.substring(0, index3 + s3.length()) + s4 + s1.substring(index3 + s3.length());
        System.out.println(s1);
        input.close();
    }
}

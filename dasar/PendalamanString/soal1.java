package PendalamanString;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "";
        String b = "";

        a = scanner.next();
        b = scanner.next();
        int index = 0;
        while ((index = a.indexOf(b)) != -1) {
            a = a.substring(0, index) + a.substring(index + b.length());
        }
        System.out.println(a);
        scanner.close();
    }
}
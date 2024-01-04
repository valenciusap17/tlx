import java.util.Scanner;

class penjumlahanPecahan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextInt();
        long B = in.nextInt();
        long C = in.nextInt();
        long D = in.nextInt();

        long bawah = kpkFuntion(B, D);

        A = A * (bawah / B);
        C = C * (bawah / D);

        long atas = A + C;

        long fpb = fpbFuntion(atas, bawah);

        System.out.println((atas / fpb) + " " + (bawah / fpb));
        in.close();
    }

    static long fpbFuntion(long a, long b) {
        if (b == 0)
            return a;
        return fpbFuntion(b, a % b);
    }

    static long kpkFuntion(long a, long b) {
        return (a * b) / fpbFuntion(a, b);
    }
}
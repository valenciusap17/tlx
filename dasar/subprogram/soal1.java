import java.util.Scanner;

class soal1 {
    public static void main(String[] args) {
        int[] array1 = new int[1000];
        int[] array2 = new int[1000];
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int j = 0; j < n; j++) {
            array1[j] = input.nextInt();
        }
        for (int j = 0; j < n; j++) {
            array2[j] = input.nextInt();
        }

        int countQ = input.nextInt();
        for (int i = 0; i < countQ; i++) {
            String first = input.next();
            int swap1 = input.nextInt();
            String second = input.next();
            int swap2 = input.nextInt();
            if (first.equals("A") && second.equals("B")) {
                int temp = array1[swap1 - 1];
                array1[swap1 - 1] = array2[swap2 - 1];
                array2[swap2 - 1] = temp;
            } else if (first.equals("B") && second.equals("A")) {
                int temp = array2[swap1 - 1];
                array2[swap1 - 1] = array1[swap2 - 1];
                array1[swap2 - 1] = temp;
            } else if (first.equals("A") && second.equals("A")) {
                int temp = array1[swap1 - 1];
                array1[swap1 - 1] = array1[swap2 - 1];
                array1[swap2 - 1] = temp;
            } else if (first.equals("B") && second.equals("B")) {
                int temp = array2[swap1 - 1];
                array2[swap1 - 1] = array2[swap2 - 1];
                array2[swap2 - 1] = temp;
            }
        }
        for (int j = 0; j < n; j++) {
            System.out.print(array1[j] + " ");
        }
        System.out.println();
        for (int j = 0; j < n; j++) {
            System.out.print(array2[j] + " ");
        }
    }
}
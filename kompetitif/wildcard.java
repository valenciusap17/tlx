import java.util.Scanner;

public class wildcard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String formula = in.next();
        String before = "";
        boolean check = false;
        String after = "";
        for (int i = 0; i < formula.length(); i++) {
            char letter = formula.charAt(i);
            if (letter == '*')
                check = true;
            else {
                if (check) {
                    after += String.valueOf(letter);
                } else {
                    before += String.valueOf(letter);
                }
            }
        }

        int repeat = in.nextInt();
        for (int i = 0; i < repeat; i++) {
            String word = in.next();
            int beforeLength = before.length();
            int afterLength = after.length();
            if (word.length() >= (beforeLength + afterLength) &&
                    word.substring(0, beforeLength).equals(before)
                    && word.substring((word.length() - afterLength), word.length()).equals(after)) {
                System.out.println(word);
            }
        }
    }
}

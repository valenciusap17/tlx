import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Person {
    String id;
    int[] scores = new int[3];

    public Person(String id, int[] scores) {
        this.id = id;
        this.scores = scores;
    }
}

public class seleksiOlimpiade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int M = in.nextInt();
            String target = in.next();
            Person[] seluruh = new Person[N];
            for (int j = 0; j < N; j++) {
                String personId = in.next();
                int[] score = new int[3];
                score[0] = in.nextInt();
                score[1] = in.nextInt();
                score[2] = in.nextInt();
                Person person = new Person(personId, score);
                seluruh[j] = person;
            }

            Arrays.sort(seluruh, (p1, p2) -> sorting(p1, p2));
            for (int j = 0; j < seluruh.length; j++) {
                if (seluruh[j].id.equals(target)) {
                    if (j < M) {
                        System.out.println("YA");
                    } else {
                        System.out.println("TIDAK");
                    }
                }
            }
        }
    }

    // true kalau p1 harus duluan
    static int sorting(Person p1, Person p2) {
        if (p2.scores[2] != p1.scores[2])
            return Integer.compare(p2.scores[2], p1.scores[2]);
        if (p2.scores[1] != p1.scores[1])
            return Integer.compare(p2.scores[1], p1.scores[1]);
        return Integer.compare(p2.scores[0], p1.scores[0]);
    }

}
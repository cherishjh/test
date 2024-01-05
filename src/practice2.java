import java.util.*;

public class practice2 {
    public static void main(String[] args) {
        boolean answer = false;
        String s = "(())()";
        System.out.println(s.length());
        int count_a = 0;
        int count_b = 0;
        Deque<Character> clause = new ArrayDeque<>();
        for (int a = 0; a < s.length(); a++) {
            clause.addLast(s.charAt(a));
        }

        if (clause.size() % 2 != 0)
            answer = false;

        if (clause.peekFirst() == ')' || clause.peekLast() == '(')
            answer = false;


        if (clause.peekFirst() == '(' && clause.peekLast() == ')') {
            for (int i = 0; i < clause.size(); i++) {
                if (clause.pollFirst() == '(') count_a++;
                if (clause.pollFirst() == ')') count_b++;
            }

            if (count_a == count_b) answer = true;

            System.out.println(count_b);
            System.out.println(count_a);
            System.out.println(answer);

        }
    }}
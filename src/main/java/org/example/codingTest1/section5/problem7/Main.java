package org.example.codingTest1.section5.problem7;

import java.util.*;

public class Main {

    public static String solution (String str1, String str2) {

        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        String[] strArray1 = str1.split("");
        String[] strArray2 = str2.split("");

        for (int i = 0; i < strArray1.length; i++) {

            queue1.add(strArray1[i]);
        }

        for (int i = 0; i < strArray2.length; i++) {

            queue2.add(strArray2[i]);
        }

        for (int i = 0; i < strArray2.length; i++) {

            String poll = queue2.poll();
            if (queue1.contains(poll)) {

                if (!queue1.peek().equals(poll)) {

                    return "NO";
                }
                queue1.poll();
            }
        }

        if (!queue1.isEmpty()) {

            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        Main solution = new Main();
        String result = solution.solution(str1, str2);

        System.out.println(result);
    }
}

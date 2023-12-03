package org.example.codingTest1.section5.problem1;

import java.util.*;

public class Main {

    public static String solution(String str) {

        String[] strArray = str.split("");
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < strArray.length; i++) {

            if (strArray[i].equals("(")) {

                stack.push("(");
            } else {

                if (stack.isEmpty()) {

                    return "NO";
                }
                stack.pop();
            }
        }

        if (stack.isEmpty()) {

            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Main solution = new Main();
        String result = solution.solution(str);

        System.out.println(result);
    }
}

package org.example.codingTest1.section5.problem2;

import java.util.*;

public class Main {

    public static String solution(String str) {

        String result = "";
        String[] strArray = str.split("");
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < strArray.length; i++) {

            if (strArray[i].equals("(")) {

                stack.push("(");
            } else if (strArray[i].equals(")")) {

                while (!stack.peek().equals("(")) {

                    stack.pop();
                }
                stack.pop();
            } else {

                if (stack.isEmpty()) {

                    result += strArray[i];
                    continue;
                }
                stack.push(strArray[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Main solution = new Main();
        String result = solution.solution(str);

        System.out.println(result);
    }
}

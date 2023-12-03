package org.example.codingTest1.section5.problem4;

import java.util.*;

public class Main {

    public static int solution(String str) {

        String[] strArray = str.split("");
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < strArray.length; i++) {

            if (Character.isDigit(strArray[i].charAt(0))) {

                stack.push(strArray[i]);
            } else {

                int pop2 = Integer.valueOf(stack.pop());
                int pop1 = Integer.valueOf(stack.pop());

                switch (strArray[i]) {

                    case "+":
                        stack.push(String.valueOf(pop1 + pop2));
                        break;

                    case "-":
                        stack.push(String.valueOf(pop1 - pop2));
                        break;

                    case "*":
                        stack.push(String.valueOf(pop1 * pop2));
                        break;

                    case "/":
                        stack.push(String.valueOf(pop2 / pop2));
                        break;
                }
            }
        }

        return Integer.valueOf(stack.pop());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Main solution = new Main();
        int result = solution.solution(str);

        System.out.println(result);
    }
}

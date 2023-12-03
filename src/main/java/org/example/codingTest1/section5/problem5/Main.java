package org.example.codingTest1.section5.problem5;

import java.util.*;

public class Main {

    public static int solution(String str) {

        String[] strArray = str.split("");
        Stack<String> stack = new Stack<>();
        Stack<String> tempStack = new Stack<>();

        int count = 0;

        for (int i = 0; i < strArray.length; i++) {

            if (strArray[i].equals("(")) {

                stack.push("(");
            } else if (strArray[i].equals(")")) {

                if (stack.peek().equals("(")) {

                    stack.pop();
                    stack.push("*");
                } else {

                    while (stack.peek().equals("*")) {

                        tempStack.push(stack.pop());
                    }

                    stack.pop();
                    count += tempStack.size() + 1;

                    while (!tempStack.isEmpty()) {

                        stack.push(tempStack.pop());
                    }


                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Main solution = new Main();
        int result = solution.solution(str);

        System.out.println(result);
    }
}

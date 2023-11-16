package org.example.codingTest1.section1.problem2;

import java.util.Scanner;

public class Main {

    public String solution(String str) {

        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i))) {

                result.append(Character.toLowerCase(str.charAt(i)));
            } else {

                result.append(Character.toUpperCase(str.charAt(i)));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Main solution = new Main();
        String result = solution.solution(str);

        System.out.println(result);
    }
}

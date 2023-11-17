package org.example.codingTest1.section1.problem5;

import java.util.Scanner;

public class Main {

    public String solution(String str) {

        char[] chArray = str.toCharArray();
        String tmp = "";

        for (char c : chArray) {

            if (Character.isAlphabetic(c)) {

                tmp += c;
            }
        }

        tmp = new StringBuilder(tmp).reverse().toString();
        int idx = 0;

        for (int i = 0; i < chArray.length; i++) {

            if (Character.isAlphabetic(chArray[i])) {

                chArray[i] = tmp.charAt(idx++);
            }
        }

        return String.valueOf(chArray);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Main solution = new Main();
        String result = solution.solution(str);

        System.out.println(result);
    }
}

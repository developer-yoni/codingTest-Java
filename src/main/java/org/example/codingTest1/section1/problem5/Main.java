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
        String result = "";

        for (int i = 0; i < chArray.length; i++) {

            if (Character.isAlphabetic(chArray[i])) {

                chArray[i] = tmp.charAt(idx++);
            }

            // chArray에서 바로 toString() 하면 -> ch요소들이 문자로 바뀔 줄알았는데 -> 그게 안됨 -> 그래서 별도로 문자열로 합쳐줘야 문제가 안생김
            result += chArray[i];
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

package org.example.codingTest1.section1.problem8;

import java.util.Scanner;

public class Main {

    public String solution(String str) {

        String tmp = str.toLowerCase();
        tmp = tmp.replaceAll("[^a-zA-Z]", "");

        String reverseStr = new StringBuilder(tmp).reverse().toString();

        if (tmp.equals(reverseStr)) {

            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Main solution = new Main();
        String result = solution.solution(str);

        System.out.println(result);
    }
}

package org.example.codingTest1.section1.problem9;

import java.util.Scanner;

public class Main {

    public int solution(String str) {

        return Integer.parseInt(str.replaceAll("[^0-9]", ""));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Main solution = new Main();
        int result = solution.solution(str);

        System.out.println(result);
    }
}

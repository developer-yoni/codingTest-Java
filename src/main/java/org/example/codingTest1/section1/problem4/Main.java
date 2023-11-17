package org.example.codingTest1.section1.problem4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public String[] solution(String[] strArray) {

        String[] result = new String[strArray.length];

        for (int i = 0; i < strArray.length; i++) {

            result[i] = new StringBuilder(strArray[i]).reverse().toString();
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] strArray = new String[N];
        for (int i = 0; i < N; i++) {

            strArray[i] = sc.next();
        }

        Main solution = new Main();
        String[] result = solution.solution(strArray);

        Arrays.stream(result).forEach(s -> System.out.println(s));
    }
}

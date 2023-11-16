package org.example.codingTest1.section1.problem3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public String solution(String str) {

        int maxLength = Arrays.stream(str.split(" ")).mapToInt(s -> s.length()).max().getAsInt();

        return Arrays.stream(str.split(" ")).filter(s -> s.length() == maxLength).findFirst().get();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Main solution = new Main();
        String result = solution.solution(str);

        System.out.println(result);
    }
}

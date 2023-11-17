package org.example.codingTest1.section1.problem6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public String solution(String str) {

        char[] chArray = str.toCharArray();
        List<Character> chList = new ArrayList<>();
        for (char c : chArray) {

            chList.add(c);
        }

        String result = "";
        chList = chList.stream().distinct().collect(Collectors.toList());

        for (Character character : chList) {

            result += character;
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

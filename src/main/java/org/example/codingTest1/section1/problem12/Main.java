package org.example.codingTest1.section1.problem12;

import java.util.Scanner;

public class Main {

    public String solution(int n, String str) {

        String[] result = new String[n];

        //1. 7자리씩 끊고
        int idx = 0;
        for (int i = 0; i < n * 7; i += 7) {

            result[idx++] = str.substring(i, i+7);
        }

        //2. 이진수로 바꾸고
        for (int i = 0; i < result.length; i++) {

            result[i] = result[i].replace("#", "1");
            result[i] = result[i].replace("*", "0");
        }

        //3. 이진수를 10진수로 바꾸고
        for (int i = 0; i < result.length; i++) {

            result[i] = String.valueOf(Integer.parseInt(result[i], 2));
        }

        //4. 문자로 바꿔서 리턴
        String finalResult = "";
        for (int i = 0; i < result.length; i++) {

            finalResult += (char)(Integer.parseInt(result[i]));
        }

        return finalResult;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        Main solution = new Main();
        String result = solution.solution(n, str);

        System.out.println(result);
    }
}

package org.example.codingTest1.section1.problem1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public int solution(String str, String ch) {

        //1. 모두 소문자로 변환
        char[] chArray = str.toLowerCase(Locale.ROOT).toCharArray();
        char c = ch.toLowerCase(Locale.ROOT).charAt(0);

        //2. loop 돌면서 개수 count
        int count = 0;
        for (int i = 0; i < chArray.length; i++) {

            if (chArray[i] == c) {
                count++;
            }
        }

        //3. 응답 리턴
        return count;
    }
    public static void main(String[] args) {

        //0. Scanner 준비
        Scanner sc = new Scanner(System.in);

        //1. 문자열과 문자 입력
        String str = sc.next();
        String ch = sc.next();

        //2. 문자열에서 문자 개수 count
        Main solution = new Main();
        int result = solution.solution(str, ch);

        //3. 결과 출력
        System.out.println(result);
    }
}

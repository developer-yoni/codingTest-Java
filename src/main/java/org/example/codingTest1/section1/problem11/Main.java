package org.example.codingTest1.section1.problem11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public String solution(String str) {

        /** 1. list에 subString 단위로 구분되는 end지점을 넣어놓고 -> 이때 문자열 마지막은 무조건 들어감 주의 */
        List<Integer> list = new ArrayList<>();

        char prevCh = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {

            if (prevCh != str.charAt(i)) {

                list.add(i);
                prevCh = str.charAt(i);
            }
        }
        list.add(str.length());


        /** 2. 그 각 end지점을 가지고 -> subString을 압축시키면 됨 */
        StringBuilder resultBuilder = new StringBuilder("");
        int start = 0;
        for (Integer end : list) {

            resultBuilder.append(str.charAt(start));
            if (str.substring(start, end).length() > 1) {

                resultBuilder.append(str.substring(start, end).length());
            }
            start = end;
        }

        return resultBuilder.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Main solution = new Main();
        String result = solution.solution(str);

        System.out.println(result);
    }
}

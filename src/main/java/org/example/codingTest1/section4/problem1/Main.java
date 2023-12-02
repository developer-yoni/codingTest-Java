package org.example.codingTest1.section4.problem1;

import java.util.*;

public class Main {

    public static String solution(String str) {

        Map<String, Integer> map = new HashMap<>();

        String[] strArray = str.split("");
        for (int i = 0; i < strArray.length; i++) {

            map.put(strArray[i], map.getOrDefault(strArray[i], 0) + 1);
        }

        String maxKey = "";
        int max = -1;
        for (String key : map.keySet()) {

            if (map.get(key) > max) {

                max = map.get(key);
                maxKey = key;
            }
        }

        return maxKey;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        Main solution = new Main();
        String result = solution.solution(str);

        System.out.println(result);
    }
}

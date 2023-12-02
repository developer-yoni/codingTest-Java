package org.example.codingTest1.section4.problem2;

import java.util.*;

public class Main {

    public static String solution(String str1, String str2) {

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        String[] strArray1 = str1.split("");
        String[] strArray2 = str2.split("");

        for (int i = 0; i < strArray1.length; i++) {

            map1.put(strArray1[i], map1.getOrDefault(strArray1[i], 0) + 1);
        }
        for (int i = 0; i < strArray2.length; i++) {

            map2.put(strArray2[i], map2.getOrDefault(strArray2[i], 0) + 1);
        }

        for (String keyOfMap1 : map1.keySet()) {

            if (!map2.containsKey(keyOfMap1)) {

                return "NO";
            }

            if (map1.get(keyOfMap1) != map2.get(keyOfMap1)) {

                return "NO";
            }
        }

        for (String keyOfMap2 : map2.keySet()) {

            if (!map1.containsKey(keyOfMap2)) {

                return "NO";
            }

            if (map2.get(keyOfMap2) != map1.get(keyOfMap2)) {

                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        Main solution = new Main();
        String result = solution.solution(str1, str2);

        System.out.println(result);
    }
}

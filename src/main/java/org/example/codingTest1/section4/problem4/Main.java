package org.example.codingTest1.section4.problem4;

import java.util.*;
import java.util.stream.*;

public class Main {

    private static boolean isAnagram(Map<String, Integer> map1, Map<String, Integer> map2) {

        for (String keyOfMap1 : map1.keySet()) {

            if (!map2.containsKey(keyOfMap1)) {

                return false;
            }

            if (map1.get(keyOfMap1) != map2.get(keyOfMap1)) {

                return false;
            }
        }

        return true;
    }

    public static int solution(String str1, String str2) {

        int result = 0;
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        String[] strArray1 = str1.split("");
        String[] strArray2 = str2.split("");

        for (int i = 0; i < strArray2.length; i++) {

            map2.put(strArray2[i], map2.getOrDefault(strArray2[i], 0) + 1);
        }

        for (int i = 0; i < strArray2.length; i++) {

            map1.put(strArray1[i], map1.getOrDefault(strArray1[i], 0) + 1);
        }

        if(isAnagram(map1, map2)){

            result++;
        }

        for (int i = strArray2.length; i < strArray1.length; i++) {

            map1.put(strArray1[i - strArray2.length], map1.get(strArray1[i-strArray2.length]) - 1);
            if (map1.get(strArray1[i - strArray2.length]) <= 0) {

                map1.remove(strArray1[i - strArray2.length]);
            }

            map1.put(strArray1[i], map1.getOrDefault(strArray1[i], 0) + 1);
            if (isAnagram(map1, map2)) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        Main solution = new Main();
        int result = solution.solution(str1, str2);

        System.out.println(result);
    }
}

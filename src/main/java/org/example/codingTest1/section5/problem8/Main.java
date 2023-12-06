package org.example.codingTest1.section5.problem8;

import java.util.*;

class Pair {

    private int value;
    private int order;

    public Pair(int value, int order) {

        this.value = value;
        this.order = order;
    }

    public int getValue() {

        return value;
    }

    public int getOrder() {

        return order;
    }
}
public class Main {

    public static int solution(int n, int m, int[] array) {

       Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {

            queue.add(new Pair(array[i], i));
        }

        int count = 0;
        while (true) {

            Pair poll = queue.poll();

            Optional<Pair> isPresent = queue.stream().filter(p -> p.getValue() > poll.getValue()).findAny();
            if (isPresent.isPresent()) {

                queue.offer(poll);
            } else {

                count++;
                if (poll.getOrder() == m) {

                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {

            array[i] = sc.nextInt();
        }

        Main solution = new Main();
        int result = solution.solution(n, m, array);

        System.out.println(result);
    }
}

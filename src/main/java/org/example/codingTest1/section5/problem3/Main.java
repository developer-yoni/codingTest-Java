package org.example.codingTest1.section5.problem3;

import java.util.*;

public class Main {

    public static int solution(int n, int[][] board, int m, int[] moves) {

        int count = 0;
        Stack<Integer> stack = new Stack<>();
        List<Stack<Integer>> listOfStack = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            listOfStack.add(new Stack<>());
        }

        for (int i = 0; i < n; i++) {

            for (int j = n-1; j >= 0; j--) {

                if (board[j][i] > 0) {

                    listOfStack.get(i).push(board[j][i]);
                }
            }
        }

        for (int i = 0; i < m; i++) {

            if (!listOfStack.get(moves[i] - 1).isEmpty()) {

                Integer pop = listOfStack.get(moves[i] - 1).pop();

                if (stack.isEmpty()) {

                    stack.push(pop);
                } else {

                    if (stack.peek().equals(pop)) {

                        stack.pop();
                        count += 2;
                    } else {

                        stack.push(pop);
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {

            moves[i] = sc.nextInt();
        }

        Main solution = new Main();
        int result = solution.solution(n, board, m, moves);

        System.out.println(result);
    }
}

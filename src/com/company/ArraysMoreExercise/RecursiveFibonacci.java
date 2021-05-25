package com.company.ArraysMoreExercise;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        if (n == 0) {
            System.out.println(0);
        } else if (n == 1 || n == 2) {
            System.out.println(1);
        } else {
            int[] arr = new int[n];

            for (int a : arr) {
                arr[a] = 0;
            }
            arr[0] = 1;
            arr[1] = 1;

            boolean go = true;

            while (go) {
                for (int i = n; i >= 0; i--) {
                    if (i >= 3) {
                        if (arr[i - 1] == (arr[i - 2] + arr[i - 3]) && arr[i - 1] > 0) {
                            break;
                        }
                        arr[i - 1] = arr[i - 2] + arr[i - 3];
                    }
                }
                if (arr[n - 1] > 0 && (arr[n - 1] == (arr[n - 2] + arr[n - 3]))) {
                    go = false;
                    System.out.println(arr[n - 1]);
                }
            }
        }
    }
}


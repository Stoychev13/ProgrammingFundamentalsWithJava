package com.company.MethodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String repeat = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String result = toRepeat(repeat, n);

        System.out.println(result);
    }

    private static String toRepeat(String repeat, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += repeat;
        }
        return result;
    }
}

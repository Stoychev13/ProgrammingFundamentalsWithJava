package com.company.DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            int index = input.indexOf(" ");

            long first = Long.parseLong(input.substring(0, index));
            long second = Long.parseLong(input.substring(index + 1));
            long sum = 0;
            long greater = 0;

            greater = Math.max(first, second);

            while (greater != 0) {
                sum += greater % 10;
                greater /= 10;
            }

            System.out.println(Math.abs(sum));
        }
    }
}

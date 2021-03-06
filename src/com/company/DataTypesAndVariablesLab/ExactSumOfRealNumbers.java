package com.company.DataTypesAndVariablesLab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(scanner.nextLine());

        for (int i = 1; i < n; i++) {
            BigDecimal num = new BigDecimal(scanner.nextLine());

            sum = sum.add(num);
        }
        System.out.println(sum);

    }
}

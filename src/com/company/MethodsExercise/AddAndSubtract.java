package com.company.MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        System.out.println(getSubtract(firstNum, secondNum, thirdNum));

    }

    private static int getSubtract(int firstNum, int secondNum, int thirdNum) {

        int sum = firstNum + secondNum;

        return sum - thirdNum;


    }
}

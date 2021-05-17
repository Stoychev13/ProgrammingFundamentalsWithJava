package com.company.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberPeople = Double.parseDouble(scanner.nextLine());
        double capacity = Double.parseDouble(scanner.nextLine());

        double courses = Math.ceil(numberPeople / capacity);


        System.out.printf("%.0f", courses);

    }
}

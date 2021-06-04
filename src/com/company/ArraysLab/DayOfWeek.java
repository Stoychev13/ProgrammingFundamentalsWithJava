package com.company.ArraysLab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int day = Integer.parseInt(scanner.nextLine());

        if (day >= 1 && day <= 7) {

            day -= 1;
            System.out.println(days[day]);

        } else {
            System.out.println("Invalid day!");
        }
    }
}

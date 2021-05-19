package com.company.ArraysExercise;

import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeField = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        String forAllZeros = input;


        int numberDNATest = 0;
        int localNumber = 0;
        int bestSum = 0;
        int bestLength = 0;
        int bestNumber = 0;
        int bestIndex = 0;
        String bestSequence = "";
        String bestInput = "";
        boolean zeros = false;


        String localnput = "";
        while (!input.equals("Clone them!")) {

            String noChars = input.replaceAll("!+", "");
            String[] noZeros = noChars.split("0");
            numberDNATest++;
            int localLength = 0;
            String localSequence = "";
            int sum = 0;


            for (String noZero : noZeros) {
                if (noZero.length() > localLength) {
                    localLength = noZero.length();
                    localNumber = numberDNATest;
                    localSequence = noZero;
                    localnput = noChars;

                }
                sum += noZero.length();
                if (sum > 0) {
                    zeros = true;
                }
            }
            int localIndex = noChars.indexOf(localSequence);

            if (localLength > bestLength) {
                bestLength = localLength;
                bestNumber = numberDNATest;
                bestInput = localnput;
                bestSum = sum;
                bestIndex = localIndex;


            } else if (localLength == bestLength) {
                if (localIndex < bestIndex) {
                    bestNumber = numberDNATest;
                    bestInput = localnput;
                    bestSum = sum;
                    bestIndex = localIndex;
                } else if (localIndex == bestIndex) {
                    if (bestSum < sum) {
                        bestNumber = numberDNATest;
                        bestInput = localnput;
                        bestSum = sum;
                        bestIndex = localIndex;
                    }
                } else {
                    continue;
                }
                bestLength = localLength;
            }

            localLength = 0;
            localNumber = 0;
            localSequence = "";
            localnput = "";
            sum = 0;


            input = scanner.nextLine();


        }
        if (!zeros) {
            String output1 = forAllZeros.replaceAll("!+", "");
            String[] bestAllZero = output1.split("");

            System.out.println("Best DNA sample 1" + " with sum: " + 0 + ".");
            for (String s : bestAllZero) {
                System.out.print(s + " ");
            }

        } else {
            String[] output = bestInput.split("");

            System.out.println("Best DNA sample " + bestNumber + " with sum: " + bestSum + ".");
            for (String s : output) {
                System.out.print(s + " ");
            }
        }
    }
}

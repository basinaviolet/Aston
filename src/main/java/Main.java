package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberForCheckAl1 = 7;
        String strForCheckAl2 = "Вячеслав";
        int[] arrayOfNumbersAl3 = {12, 11, 45, 4, 50};
        int numberForMultiplyingCheckAl3 = 3;

        algorithm1(numberForCheckAl1);
        algorithm2(strForCheckAl2);
        algorithm3(numberForMultiplyingCheckAl3, arrayOfNumbersAl3);
        algorithm3Console(numberForMultiplyingCheckAl3);
    }

    public static void algorithm1(int forCheck) {
        System.out.println("Algorithm 1");
        if (getInt() > forCheck) System.out.println("Привет");
    }

    public static void algorithm2(String forCheck) {
        System.out.println("Algorithm 2");
        if (getStr().equals(forCheck)) System.out.println("Привет, " + forCheck);
        else System.out.println("Нет такого имени");
    }

    public static void algorithm3(int numberForCheck, int[] arrayOfNumbers) {
        System.out.println("Algorithm 3");
        algorithm3Body(numberForCheck, arrayOfNumbers);
    }

    public static void algorithm3Console(int numberForCheck) {
        System.out.println("Algorithm 3 (entering numbers for array from console)");
        int[] arrayOfNumbers = getIntArray();
        algorithm3Body(numberForCheck, arrayOfNumbers);
    }

    public static void algorithm3Body(int numberForCheck, int[] arrayForCheck) {
        System.out.print("Start array: ");
        prnArray(arrayForCheck);

        System.out.print("Result: ");
        for (int i : arrayForCheck) {
            if (i % numberForCheck == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
    }

    public static int getInt() {
        int number;

        System.out.print("Insert number: ");
        Scanner scn = new Scanner(System.in);

        while (!scn.hasNextInt()) {
            System.out.println("Insert correct number");
            scn.next();
        }
        number = scn.nextInt();
        return number;
    }

    public static String getStr() {
        System.out.print("Insert name: ");
        Scanner scn = new Scanner(System.in);
        return scn.next();
    }

    public static int[] getIntArray() {
        Scanner scn = new Scanner(System.in);
        Map<Integer, Integer> temp = new HashMap<>();
        int i = 0;

        System.out.print("Insert array of numbers (and any other not null char for ending):");
        while (scn.hasNextInt()) {
            temp.put(i, scn.nextInt());
            i++;
        }

        int[] intArray = new int[temp.size()];
        for (Integer key : temp.keySet()) {
            intArray[key] = temp.get(key);
        }
        return intArray;
    }

    public static void prnArray(int[] arrayToPrint){
        for (int i: arrayToPrint){
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}

package com.infoshareacademy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            picUpNamber();

    }

    private static void picUpNamber() {

        Scanner scanner = new Scanner(System.in);
        while ()
        try {
            System.out.println("Podaj liczbe int: ");
            double result1 = scanner.nextInt();
            System.out.println("Podaj liczbe double: ");
            double result2 = scanner.nextDouble();
            System.out.println(result1);
            System.out.println(result2);
        } catch (Exception e) {
            System.out.println("blendny wpis");
        }

    }
}

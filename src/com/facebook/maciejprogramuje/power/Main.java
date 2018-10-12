package com.facebook.maciejprogramuje.power;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        int tests = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < tests; i++) {
            String[] line = scanner.nextLine().split(" ");
            double lastDigit = new BigInteger(line[0]).mod(new BigInteger("10")).doubleValue();
            double power = new BigInteger(line[1]).mod(new BigInteger("4")).doubleValue() + 4;
            double resultLastDigit = Math.pow(lastDigit, power) % 10;

            result.append((int)resultLastDigit).append("\n");
        }

        System.out.println(result.toString());
    }
}

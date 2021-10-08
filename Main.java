package com.bl.lineComparison;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first co-ordinate:");
		Double firstLine = distanceCoordinate(scanner.nextLine().split(""));
		System.out.println("Enter second co-ordinate:");
		Double secondLine = distanceCoordinate(scanner.nextLine().split(""));
		if (firstLine.compareTo(secondLine) > 0) {

			System.out.println("First Line Is Greater");
		} else if (firstLine.compareTo(secondLine) < 0) {
			System.out.println("Second Line Is Greater");
		} else {
			System.out.println("Both are Equals");
		}
	}

	public static double distanceCoordinate(String[] data) {
		double[] value = new double[4];
		for (int i = 0; i < data.length; i++) {
			value[i] = Double.parseDouble(data[i]);
			return Math.sqrt(Math.pow((value[i] - value[0]), 2) + Math.pow((value[3] - value[2]), 2));
		}
		return 0;

	}
}

package ua.dp.ort.module8.task3;

import java.util.Scanner;

public class Task_3_fractions {
	public static void main(String[] args) {

		FractionsData[] fracts = new FractionsData[2];
		Scanner s = new Scanner(System.in);
		String first = "Первое число.";
		String second = "Второе число.";
		for (int i = 0; i < fracts.length; i++) {
			if (i == 0) {
				System.out.println(first);
			} else if (i == 1) {
				System.out.println(second);
			}
			System.out.println("Введите целую часть (со знаком): ");
			long x = s.nextLong();
			System.out.println("Введите дробную часть (без знака): ");
			short y = s.nextShort();
			if (y < 0) {
				y = (short) Math.abs(y);
			}
			fracts[i] = new FractionsData(x, y);
			System.out.println("Ваше число: " + fracts[i].getInteger() + "." + fracts[i].getFractional() + "\n");
		}

		int ADDITION = 1;
		int SUBSTRACTION = 2;
		int MULTIPLICATION = 3;
		int DIVISION = 4;
		int COMPARISON = 5;
		int END = 6;
		System.out.println("Для сложения введите: " + ADDITION + "\nДля вычитания введите: " + SUBSTRACTION
				+ "\nДля умножения введите: " + MULTIPLICATION + "\nДля деления введите: " + DIVISION
				+ "\nДля сравнения введите: " + COMPARISON
				+ "\nДля выхода из программы введите: " + END);
		for (int i = 0; i != END;) {
			int decision = s.nextInt();
			if (decision == ADDITION) {
				FractionsData.addition(fracts[0].getInteger(), fracts[1].getInteger(),
								fracts[0].shortToDouble(fracts[0].getFractional()),
								fracts[1].shortToDouble(fracts[1].getFractional()));
			} else if (decision == SUBSTRACTION) {
				FractionsData.substraclion(fracts[0].getInteger(), fracts[1].getInteger(),
						fracts[0].shortToDouble(fracts[0].getFractional()),
						fracts[1].shortToDouble(fracts[1].getFractional()));
			} else if (decision == MULTIPLICATION) {
				FractionsData.multiplication(fracts[0].getInteger(), fracts[1].getInteger(),
						fracts[0].shortToDouble(fracts[0].getFractional()),
						fracts[1].shortToDouble(fracts[1].getFractional()));
			} else if (decision == DIVISION) {
				FractionsData.division(fracts[0].getInteger(), fracts[1].getInteger(),
						fracts[0].shortToDouble(fracts[0].getFractional()),
						fracts[1].shortToDouble(fracts[1].getFractional()));
			} else if (decision == COMPARISON) {
				FractionsData.comparison(fracts[0].getInteger(), fracts[1].getInteger(),
						fracts[0].shortToDouble(fracts[0].getFractional()),
						fracts[1].shortToDouble(fracts[1].getFractional()));
			} 
			i = decision;
		} 
		s.close();
	}
}

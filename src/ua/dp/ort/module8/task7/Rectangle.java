package ua.dp.ort.module8.task7;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		int CROSS = 1;
		int POINT = 2;
		int SCALING = 3;
		int DISPLACEMENT = 4;
		int PRINT = 5;
		int EXIT = 6;
		
		Scanner s = new Scanner(System.in);
		System.out.println("ДОБРО ПОЖАЛОВАТЬ В ПРОГРАММУ ПРЯМОУГОЛЬНИК\n"
				+ "Для создания Вашего прямоугольника\n");
		System.out.println("Введите координаты левого верхнего угла: ");
		System.out.println("Координата х:");
		int x1 = s.nextInt();
		System.out.println("Координата у:");
		int y1 = s.nextInt();
		System.out.println("Введите координаты правого нижнего угла: ");
		System.out.println("Координата х:");
		int x2 = s.nextInt();
		System.out.println("Координата у:");
		int y2 = s.nextInt();
		RectangleData rectangle = new RectangleData(x1, y1, x2, y2);
		
		System.out.println("Выберите, что Вы хотите сделать с прямоугольником: \n"
				+ CROSS + ". Для сравнения с другим прямоугольником\n" + 
				+ POINT + ". Для того, что бы узнать попадает ли точка в прямоугольник\n" +
				+ SCALING + ". Для маштабирования по правому нижнему углу\n" +
				+ DISPLACEMENT + ". Для перемещения\n" +
				+ PRINT + ". Для вывода на экран\n" + 
				+ EXIT + ". Для выхода из программы\n");
		int i = s.nextInt();
		for (;!(i == EXIT);) {
			if (i == CROSS) {
				System.out.println("Для создания второго прямоугольника\n");
				System.out.println("Введите координаты левого верхнего угла: ");
				System.out.println("Координата х:");
				x1 = s.nextInt();
				System.out.println("Координата у:");
				y1 = s.nextInt();
				System.out.println("Введите координаты правого нижнего угла: ");
				System.out.println("Координата х:");
				x2 = s.nextInt();
				System.out.println("Координата у:");
				y2 = s.nextInt();
				RectangleData rectangleNew = new RectangleData(x1, y1, x2, y2);
				rectangle.crossRectangle(rectangleNew);
			} else if (i == POINT) {
				System.out.println("Введите координаты точки: ");
				System.out.println("Координата х:");
				x1 = s.nextInt();
				System.out.println("Координата у:");
				y1 = s.nextInt();
				if (rectangle.pointInRectangle(x1, y1)) {
					System.out.println("Точка попадает в прямоугольник\n");
				} else {
					System.out.println("Точка лежит вне прямоугольника\n");
				}
			} else if (i == SCALING) {
				System.out.println("Введите на сколько вы хотите изменить прямоугольник: ");
				System.out.println("По координате х:");
				x1 = s.nextInt();
				System.out.println("По координате у:");
				y1 = s.nextInt();
				rectangle = rectangle.scalingRectangle(x1, y1);
			} else if (i == DISPLACEMENT) {
				System.out.println("Введите на сколько вы хотите переместить прямоугольник: ");
				System.out.println("По координате х:");
				x1 = s.nextInt();
				System.out.println("По координате у:");
				y1 = s.nextInt();
				rectangle = rectangle.displacementRectangle(x1, y1);
			} else if (i == PRINT) {
				rectangle.printRectangle();
			}
			
			
			
			System.out.println("Для продолжения работы с программой выберите вариант взаимодействия\n"
					+ "или для выхода нажмите 6");
			i = s.nextInt();
		}
	}
}

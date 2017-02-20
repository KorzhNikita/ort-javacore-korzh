package ua.dp.ort.module8;

public class Task_1_points {

	public static void main(String[] args) {
		int pointsCount = 10;
		PointsData[] points = new PointsData[pointsCount];
		for (int i = 0; i < points.length; i++) {
			points[i] = new PointsData("Point #" + (Integer.toString(i + 1)) + ".\t", 
					(int)(Math.random()*10), (int)(Math.random()*10));
		}
		System.out.println("Before sort:\n");
		printPoints(points);
		bubbleSort(points);
		System.out.println("\nAfter sort:\n");
		printPoints(points);
	}
	
	private static void bubbleSort(PointsData[] points) {
		for (int i = points.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (Math.sqrt(Math.pow(points[j].getX(), 2) + Math.pow(points[j].getY(), 2)) 
						> Math.sqrt(Math.pow(points[j+1].getX(), 2) + Math.pow(points[j+1].getY(), 2))) {
					PointsData temp = points[j];
					points[j] = points[j + 1];
					points[j + 1] = temp;
				}
			}
		}
	}
	private static String pointsToString(PointsData points) {
		StringBuilder sb = new StringBuilder();
		sb.append(points.getName()).append("x = ").append(points.getX()).append("; y = ").append(points.getY());
		return sb.toString();
	}
	private static void printPoints(PointsData[] points) {
		for (int i = 0; i < points.length; ++i) {
			PointsData point = points[i];
			String pointInString = pointsToString(point);
			System.out.printf("%s%n", pointInString);
		}
	}
}
package ua.dp.ort.module7;

import java.util.Scanner;

public class Task_9_05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please, enter the name of the author:");
		String author = s.nextLine();

		System.out.println("Please, enter the name of the novel:");
		String novel = s.nextLine();
		
		System.out.println("Writer " + author + " - author of the novel '" + novel + "'");
		
		s.close();

	}

}

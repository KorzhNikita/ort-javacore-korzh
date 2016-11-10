package ua.dp.ort.module7;

import java.util.Scanner;

public class Task_9_10 {
	public static void main(String[] args) {
	
		String firstCity;
		String secondCity;
		String thirdCity;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the first city name: ");
		firstCity = s.nextLine();
		System.out.println("Please enter the second city name: ");
		secondCity = s.nextLine();
		System.out.println("Please enter the third city name: ");
		thirdCity = s.nextLine();
		
		if (firstCity.length()>secondCity.length()&&firstCity.length()>thirdCity.length())
			System.out.println("The longest city name is: " + firstCity);
		else if (secondCity.length()>firstCity.length()&&secondCity.length()>thirdCity.length())
			System.out.println("The longest city name is: " + secondCity);
		else if (thirdCity.length()>firstCity.length()&&secondCity.length()<thirdCity.length())
			System.out.println("The longest city name is: " + thirdCity);
		else if (thirdCity.length()==firstCity.length()&&secondCity.length()==thirdCity.length())
			System.out.println("All three city names have same length");
		else if (thirdCity.length()==firstCity.length()&&secondCity.length()<thirdCity.length())
			System.out.println("The longest city names are: " + thirdCity + " and " + firstCity);
		else if (thirdCity.length()>firstCity.length()&&secondCity.length()==thirdCity.length())
			System.out.println("The longest city names are: " + thirdCity + " and " + secondCity);
		else if (thirdCity.length()<firstCity.length()&&secondCity.length()==firstCity.length())
			System.out.println("The longest city names are: " + firstCity + " and " + secondCity);
		if (firstCity.length()<secondCity.length()&&firstCity.length()<thirdCity.length())
			System.out.println("The shortest city name is: " + firstCity);
		else if (secondCity.length()<firstCity.length()&&secondCity.length()<thirdCity.length())
			System.out.println("The shortest city name is: " + secondCity);
		else if (thirdCity.length()<firstCity.length()&&secondCity.length()>thirdCity.length())
			System.out.println("The shortest city name is: " + thirdCity);
		else if (thirdCity.length()==firstCity.length()&&secondCity.length()>thirdCity.length())
			System.out.println("The shortest city names are: " + thirdCity + " and " + firstCity);
		else if (thirdCity.length()<firstCity.length()&&secondCity.length()==thirdCity.length())
			System.out.println("The shortest city names are: " + thirdCity + " and " + secondCity);
		else if (thirdCity.length()>firstCity.length()&&secondCity.length()==firstCity.length())
			System.out.println("The shortest city names are: " + firstCity + " and " + secondCity);
		s.close();
	}
}

package ua.dp.ort.module7;

import java.util.Arrays;

public class Task_9_38 {

	public static void main(String[] args) {
		String word = "Kilimandjaro";
		String thirdOne = word.substring(0,4);
		String thirdTwo = word.substring(4,8);
		String thirdThree = word.substring(8);
		
		String result = thirdTwo + thirdThree + thirdOne;
		System.out.println("a: " + result);
		
		result = thirdThree + thirdOne + thirdTwo;
		System.out.println("b: " + result);
		

	}

}

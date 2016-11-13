package ua.dp.ort.module7;

import java.util.Scanner;

public class Task_9_186 {

	public static void main(String[] args) {
		
		String sentence = "Это очень упоротая задача, которую в любом случае надо решить.";
		String sentenceArray[] = sentence.split(" ");
		String space = " ";
		String spacesC = "";
		int spaces = sentenceArray.length - 1;
		int symbols = sentence.length() - spaces;
		StringBuffer sb = new StringBuffer();
		String result = "";
		String intermediateResult;
	
		System.out.println("Текущая длина строки: " + sentence.length()
							+ "\nВведите желаемую длину строки, большую чем текущая: ");
		Scanner s = new Scanner(System.in);
		int newLength = s.nextInt();
		int newSpaces = newLength - symbols;
		int spacesCounter[] = new int[spaces];
		
		//Данным циклом подсчитываем количество пробелов между словами и заполняем интовый массив
		for (int i = 0; i < spaces; i++) {
			spacesCounter[i] = (int)Math.ceil((double)(newSpaces - i)/spaces);
			//System.out.println(spacesCounter[i]);
		}
		
		//В принципе можно объеденить с предыдущим циклом,
		//однако для больше наглядности оставлю его самостоятельным,
		//данный цикл объеденяет части стрингового массива sentenceArray[] и пробелы
		for (int i =0; i < spaces; i++) {
			sb.delete(0,spacesCounter[i] + 1);
			for (int j = 0; j < spacesCounter[i]; j++) {
				sb.append(space);
			}
			spacesC = sb.toString();
			//System.out.println("1" + spacesC + "1"); - визуальная проверка пробелов
			
			
			intermediateResult = sentenceArray[i].concat(spacesC);
			result = result + intermediateResult;
					
		}
		//Так как после последнего слова нам не нужны пробелы, его мы добавляем отдельно.
		result = result + sentenceArray[spaces];
		System.out.println(result);
		System.out.println("\nПроверка. Количество символов в строке результата: " + result.length());
		s.close();
	}

}

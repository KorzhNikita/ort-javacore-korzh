package ua.dp.ort.module7;

public class Task_9_179 {

	public static void main(String[] args) {

		String sequence = "hello,mama,eclipse,modul,word,dark,souls,madam,stets,elle,hello";
		String sequenceArray[] = sequence.split(",");
		// 9_179_а
		System.out.print("9_179_a: ");
		for (int i = 0; i < sequenceArray.length; i++) {
			int counter = 0;
			// проверка слова на идентичность первому
			if (!sequenceArray[i].equals(sequenceArray[0])) {
				// проверка на наличие одинаковых букв в слове
				for (int j = 0; j < sequenceArray[i].length(); j++) {
					if (sequenceArray[i].indexOf(sequenceArray[i].charAt(j), j + 1) >= 0) {
						counter = counter + sequenceArray[i].indexOf(sequenceArray[i].charAt(j), j + 1);
					}
				}
				if (!(counter > 0)) {
					System.out.print(sequenceArray[i] + " ");
				}
			} 
		} System.out.println("\n");
		
		
		// 9_179_b
		System.out.print("9_179_b: ");
		for (int i = 0; i < sequenceArray.length; i++) {
			// проверка слова на идентичность первому и является ли оно симметричным
			if (!sequenceArray[i].equals(sequenceArray[0])
					&&	sequenceArray[i].equals
					(new StringBuilder(sequenceArray[i]).reverse().toString())) {
				System.out.print(sequenceArray[i] + " ");
			}	
		}
	}
}

package ua.dp.ort.module7;

public class Task_9_157 {

	public static void main(String[] args) {
		String firstWord = "reincarnation";
		//reincato - unique characters
		String secondtWord = "resolution";
		char local;
		for (int i = 0; i < firstWord.length(); i++) {
			local = firstWord.charAt(i);
			if (firstWord.indexOf(local) < i) {
			} else if (secondtWord.indexOf(local) >= 0) {
				System.out.print("Yes ");
			} else
				System.out.print("No ");
		}
	}
}
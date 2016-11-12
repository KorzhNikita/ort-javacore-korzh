package ua.dp.ort.cycles;

public class Rhombus {
	public static void main(String[] args) {

		final char s = '*';
		final char empty = ' ';
		int length = 6;
		System.out.println("Length =  " +  length);
		for (int i = 1; i <= length * 2 - 1; ++i) {
			for (int j = 1; j < length * 2 - 1; ++j) {
				// gorizont po centry
				if (j == length + j - i) {
					System.out.print(s);
					// virtikal po centry
				} else if (j == length) {
					System.out.print(s);
					// diagonal s verhu napravo vniz
				} else if (j == length - 1 + i) {
					System.out.print(s);
					// diagonal s verhu nalevo vniz
				} else if (j == length + 1 - i) {
					System.out.print(s);
					// diagonal snizu nalevo vverh
				} else if (j == i - length + 1) {
					System.out.print(s);
					// deagonal snizu napravo vverh
				} else if (j == length + (length * 2 - 1 - i)) {
					System.out.print(s);
				} else {
					System.out.print(empty);
				}
			}
			if (i == length) {
				System.out.println(s);
			} else {
				System.out.println(empty);
			}
		}
	}
}
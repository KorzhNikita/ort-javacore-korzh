package ua.dp.ort.module8;

public class Task_2_students {

	public static void main(String[] args) {
		int studentsQuantity = 7;
		StudentsData[] students = new StudentsData[studentsQuantity];
		students[0] = new StudentsData ("Корж", "Никита", "Алексеевич", "ГТ-15-м", new int[] {3,3,5,1});
		students[1] = new StudentsData ("Дольник", "Алёна", "Валентиновна", "ГТ-15-м", new int[] {5,5,5,5});
		students[2] = new StudentsData ("Данилюк", "Елена", "Сергеевна", "ГТ-15-м", new int[] {2,4,3,4});
		students[3] = new StudentsData ("Белостоцкая", "Ольга", "Владимировна", "ГГ-15-м", new int[] {4,4,4,4,4});
		students[4] = new StudentsData ("Николаева", "Татьяна", "Ивановна", "ГГ-15-м", new int[] {5,5,4,4,4});
		students[5] = new StudentsData ("Лыба", "Наталья", "Игоревна", "ГГ-15-м", new int[] {4,5});
		students[6] = new StudentsData ("Сотрниченко", "Дмитрий", "Виталиевич", "ГГ-15-м", new int[] {3,5,5,4,5,6,7});
		
		String[] results = {"получает стипендию" , "получает стипендию с надбавкой 25%" , 
				"получает стипендию с надбавкой 50%" , "получает стипендию с надбавкой 100%"};
		
		//for (int i = 0; i < students.length; i++) {
			//System.out.println(students[i].getMark()); проверка марок
		//}
		System.out.println("\n");
		bubbleSort(students);
		printStudents(students, results);
	}



	private static void bubbleSort(StudentsData[] students) {
		for (int k = students.length - 1; k > 0; --k) {
			for (int l = 0; l < k; ++l) {
				if (students[l].getFirstName().charAt(0) > students[l + 1].getFirstName().charAt(0)) {
					StudentsData temp = students[l];
					students[l] = students[l + 1];
					students[l + 1] = temp;
				}
			}
		}
		for (int i = students.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (students[j].getGroupNumber().charAt(1) > students[j + 1].getGroupNumber().charAt(1)) {
					StudentsData temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}
	}
	
	private static String studentsToString(StudentsData student) {
		StringBuilder sb = new StringBuilder();
		sb.append(student.getFirstName()).append("\t").append(student.getLastName()).append("\t")
			.append(student.getSecondName()).append("\t").append(student.getGroupNumber()).append("\t");
		return sb.toString();
	}
	
	private static void printStudents(StudentsData[] students, String[] results) {
		for (int i = 0; i < students.length; ++i) {
			StudentsData student = students[i];
			String studentInString = studentsToString(student);
			if (student.getMark() == 1) {
				System.out.printf("%s%s%n", studentInString, results[0]);
			} else if (student.getMark() == 2) {
				System.out.printf("%s%s%n", studentInString, results[1]);
			} else if (student.getMark() == 3) {
				System.out.printf("%s%s%n", studentInString, results[2]);
			} else if (student.getMark() == 4) {
				System.out.printf("%s%s%n", studentInString, results[3]);
			}
		}
	}
	
}

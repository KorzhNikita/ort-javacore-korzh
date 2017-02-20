package ua.dp.ort.module8;

public class StudentsData {

	// informatoin about the person
	private String firstName;
	private String lastName;
	private String secondName;

	// informatoin about the group person
	private String groupNumber;

	// tasks array
	private int[] marks;
	private int errorsCounter;
	private int mark;
	
	private final int withoutScolarship = 0;
	private final int scolarship = 1;
	private final int scolarship25 = 2;
	private final int scolarship50 = 3;
	private final int scolarship100 = 4;
	
	// constructor
	public StudentsData(String firstName, String lastName, String secondName, String groupNumber, int[] marks) {
		setFirstName(firstName);
		setLastName(lastName);
		setSecondName(secondName);
		setGroupNumber(groupNumber);
		setMarks(marks);
		setMark();
	}

	// setters
	public void setFirstName(String firstName) {
		while (firstName.length() < 8) {
			firstName = firstName + " ";
		}
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	public void setMarks(int[] marks) {
		if (marks.length > 5) {
			System.out.println("У студента: " + getFirstName() + " " + 
							getLastName() + ", оценок больше 5, "
							+ "для расчета стипендии будут учитываться только "
							+ "первые 5 предметов");
			this.marks = new int[5];
			for (int i = 0; i < this.marks.length; i++) {
				if (marks[i] < 2 || marks[i] > 5) {
					this.marks[i] = 0;
					errorsCounter++;
				} else
					this.marks[i] = marks[i];
			}
		} else if (marks.length < 3){
			this.marks = marks;
			System.out.println("У студента: " + getFirstName() + " " + 
								getLastName() + ", недостаточно оценок, "
								+ "необходимо сдать все экзамены");
		}
		else {
			this.marks = marks;
			for (int i = 0; i < marks.length; i++) {
				if (marks[i] < 2 || marks[i] > 5) {
					this.marks[i] = 0;
					errorsCounter++;
				} else
					this.marks[i] = marks[i];
			}
		}

	}
	public void setMark() {
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		if (marks.length < 3) {
			mark = withoutScolarship;
		} else {
		for (int i = 0; i < getMarks().length; i++) {
				if (marks[i] == 2) {
					two++;
				} else if (marks[i] == 3) {
					three++;
				} else if (marks[i] == 4) {
					four++;
				} else if (marks[i] == 5) {
					five++;
				}
			}
		}
		if (two > 0) {
			mark = withoutScolarship;
		} else if (three > 2){
			mark = withoutScolarship;
		} else if (three <= 2 && three > 0){
			mark = scolarship;
		} else if (three == 0 && five == 0 && four > 0) {
			mark = scolarship25;
		} else if (three == 0 && five > 0 && four > 0) {
			mark = scolarship50;
		} else if (three == 0 && five > 0 && four == 0) {
			mark = scolarship100;
		} 
	}

	// getters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSecondName() {
		return secondName;
	}

	public String getGroupNumber() {
		return groupNumber;
	}

	public int[] getMarks() {
		return marks;
	}

	public int getErrorsCounter() {
		return errorsCounter;
	}
	
	public int getMark() {
		return mark;
	}
}
package assignment2;

class Exam {
	// String name;
	String type;

	Exam(String name) {
		// this.name=name;
		System.out.println(name);
	}

	Exam(String name, String type) {
		this(name);
		this.type = type;
	}
}

public class Main {
	public static void main(String[] args) {
		Exam[] exams = new Exam[3];
		for (Exam exam : exams) {
			/// prints all three as null
			System.out.println(exam);
		}
		exams[0] = new Exam("quaterly");
		exams[1] = new Exam("halfyearly");
		exams[2] = new Exam("final");
	
	}
}

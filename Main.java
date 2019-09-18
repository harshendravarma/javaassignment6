package assignment6;

public class Main {

	public static void main(String[] args) {
		
		Exam[] exams = new Exam[3];
		
		for (Exam exam : exams) {
			System.out.println(exam); 	// prints all three as null as only references are created
		}
		
		exams[0] = new Exam("quaterly");
		exams[1] = new Exam("halfyearly");
		exams[2] = new Exam("final");

	}

}

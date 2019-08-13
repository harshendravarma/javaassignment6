package assignment6;

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
package people;

public class Test {

	public static void main(String[] args) {
		String[] classes = {"5A", "6B", "7C", "8A", "8B"};
		Teacher teacher = new Teacher("Ivan", "Petrov", 50, 10, "History");
		Lecturer lecturer = new Lecturer("Milen", "Ivanov", 40, 15, "Oxford");
		SchoolTeacher school = new SchoolTeacher("Nikolai", "Georgiev", 35, 5, "Math", classes);
		CollegeTeacher college = new CollegeTeacher("Pepi", "Nikolaev", 55, 20, "Biology", "American College");
		Professor professor = new Professor("Gergana", "Georgieva", 30, 10, "TU-Sofia", "chief");
		Assistant assistant = new Assistant("Radina", "Sekulovska", 30, 9, "TU-Sofia", true);
		
		teacher.check();
		teacher.goodDay();
		teacher.goodbye();
		System.out.println();
		
		lecturer.check();
		Lecturer.exercise();
		Lecturer.exercise(3);
		Lecturer.exercise(2, "Math");
		lecturer.goodDay();
		lecturer.printMaxLectures();
		System.out.println();
		
		school.printClasses();
		school.check();
		school.play();
		System.out.println();
		
		college.check();
		System.out.println();

		professor.printTitleAndYears();
		professor.check();
		professor.conductExams();
		System.out.println();
		
		assistant.printNameAndPosition();
		assistant.check();
		assistant.writeMemoir();
		assistant.ckeckExams();
		System.out.println();
		
		System.out.println("Counter: " + Person.counter);
		
	}

}

package friday.problem1;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class App {
	
//	##1.Given a list of Students, sort them by grade
//
//	Lets say you have a List<Student>, where a Student is a class, containing two fields: name and grade.
//
//	Sort them by their grades first. Their grades actually are integers => 2,3,4,5,6. If two students happen to have the same grades, sort those two by their names.
	
	private String courseName;
	List<Student> students;
	
	public App(String courseName) {
		this.courseName = courseName;
		this.students = new LinkedList<>();
	}
	
	public void printStudentsGrades() {
		for(Student s: students) {
			System.out.printf("%s: %d\n", s.getName(), s.getGrade());
		}
	}
	

	public void addStudentWithGrade(Student s) {
		students.add(s);
	}
	
	public void sortStudents() {
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getGrade() == o2.getGrade()) {
					return o1.getName().compareTo(o2.getName());
				} else {
					return o2.getGrade() - o1.getGrade();
				}
			
			}
		});
	}
	
	public static void main(String[] args) {
		App myCourse = new App("Maths");
		Student a = new Student("Ani", 2);
		Student b = new Student("Boris", 3);
		Student c = new Student("Ceci", 3);
		Student d = new Student("Doncho", 6);
		
		myCourse.addStudentWithGrade(a);
		myCourse.addStudentWithGrade(b);
		myCourse.addStudentWithGrade(c);
		myCourse.addStudentWithGrade(d);
		myCourse.addStudentWithGrade(new Student("Sasho", 6));
		myCourse.addStudentWithGrade(new Student("Aani", 2));
		
		
		myCourse.printStudentsGrades();
		myCourse.sortStudents();
		System.out.println();
		myCourse.printStudentsGrades();
		
	}

}

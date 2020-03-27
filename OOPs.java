package oops;

import java.util.ArrayList;

public class OOPs {

	public static void main(String[] args) {

		Student alka = new Student();

		alka.setId(1);
		alka.setName("Alka");
		alka.setSection("A");

		Student vandana = new Student();

		vandana.setId(2);
		vandana.setName("Vandana");
		vandana.setSection("B");

		ArrayList<Student> students = new ArrayList();

		students.add(alka);
		students.add(vandana);
		for (Student student : students) {
			System.out.println(
					"Id:" + student.getId() + ", Name: " + student.getName() + ", Section: " + student.getSection());
		}

	}

}

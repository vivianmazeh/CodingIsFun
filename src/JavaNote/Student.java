package JavaNote;



public class Student implements Comparable<Student> {

	int id;
	String name;
	double cgpa;

	public Student(int id, String name, double cgpa) {

			this.id = id;
			this.name = name;
			this.cgpa = cgpa;

		}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCGPA() {
		return cgpa;
	}

	@Override
	public int compareTo(Student s) {

		if (s.getCGPA() - this.cgpa > 0)
			return 1;
		if (s.getCGPA() - this.cgpa < 0)
			return -1;
		if (s.getCGPA() - this.cgpa == 0) {
			int res = name.compareTo(s.getName());
			if (res != 0)
				return -s.getName().compareTo(name);
			if (s.getID() > id)
				return 1;
			if (s.getID() < id)
				return -1;
			return 0;

		}
		return 0;
	}

}

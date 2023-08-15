package JavaNote;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {

	public Priorities() {

	}

	public List<Student> getStudents(List<String> events) {

		List<Student> students = new ArrayList<>();
		PriorityQueue<Student> queue = new PriorityQueue<>();

		for (String line : events) {
			String[] info = new String[4];
			info = line.split(" ");
			if (info[0].equals("ENTER")) {
				queue.add(new Student(Integer.parseInt(info[3]), info[1], Double.parseDouble(info[2])));
			} else if (info[0].equals("SERVED")) {
				queue.poll();

			}

		}

		while (!queue.isEmpty()) {
			students.add(queue.poll());
		}
		return students;

	}
}

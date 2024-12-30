package workshop4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EnrollmentService {
	private Map<String, Set<String>> enrollments;

    public EnrollmentService() {
        enrollments = new HashMap<>();
    }

    public boolean enrollStudent(String studentUsername, String courseName) {
        enrollments.putIfAbsent(studentUsername, new HashSet<>());
        Set<String> courses = enrollments.get(studentUsername);

        if (courses.contains(courseName)) {
            return false; // Student is already enrolled in the course
        }

        courses.add(courseName);
        return true; // Enrollment successful
    }
}

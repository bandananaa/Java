package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EnrollmentServiceTest {

	@Test
    void testEnrollStudent() {
        EnrollmentService service = new EnrollmentService();

        assertAll(
            () -> assertTrue(service.enrollStudent("student1", "Math101"), "Should return true for first enrollment"),
            () -> assertFalse(service.enrollStudent("student1", "Math101"), "Should return false for duplicate enrollment"),
            () -> assertTrue(service.enrollStudent("student1", "Physics101"), "Should return true for a new course"),
            () -> assertTrue(service.enrollStudent("student2", "Math101"), "Should return true for a different student")
        );
    }

}

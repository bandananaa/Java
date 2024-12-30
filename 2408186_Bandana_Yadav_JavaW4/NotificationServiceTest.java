package workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NotificationServiceTest {

	@Test
    void testSendEmail() {
        NotificationService service = new NotificationService();

        assertAll(
            () -> assertTrue(service.sendEmail("test@example.com", "Hello!"), "Should return true for valid email"),
            () -> assertFalse(service.sendEmail("invalid-email", "Hello!"), "Should return false for invalid email"),
            () -> assertFalse(service.sendEmail("", "Hello!"), "Should return false for empty email"),
            () -> assertFalse(service.sendEmail(null, "Hello!"), "Should return false for null email")
        );
    }

}

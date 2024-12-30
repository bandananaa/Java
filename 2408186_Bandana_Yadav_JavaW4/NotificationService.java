package workshop4;

public class NotificationService {

    public boolean sendEmail(String email, String message) {
        if (email == null || email.isEmpty() || !email.contains("@")) {
            return false;
        }

        // Simulating email sending logic
        System.out.println("Email sent to: " + email + " with message: " + message);
        return true;
    }
}

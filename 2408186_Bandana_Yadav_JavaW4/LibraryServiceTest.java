package workshop4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class LibraryServiceTest {

    private LibraryService libraryService;

    // BeforeAll: This runs once before any tests are executed
    @BeforeAll
    public static void setUpBeforeClass() {
        System.out.println("Global setup before any tests.");
        // This can be used for global setup like initializing external resources, etc.
    }

    // BeforeEach: This runs before each test is executed
    @BeforeEach
    public void setUp() {
        libraryService = new LibraryService();
        System.out.println("Initializing LibraryService for test...");
    }

    // Test case to check adding a book
    @Test
    public void testAddBook() {
        libraryService.addBook("Harry Potter");
        assertTrue(libraryService.searchBook("Harry Potter"), "Book should be added to the library.");
    }

    // Test case to check searching for a book
    @Test
    public void testSearchBook() {
        libraryService.addBook("The Hobbit");
        assertTrue(libraryService.searchBook("The Hobbit"), "Book should be found in the library.");
        assertFalse(libraryService.searchBook("Nonexistent Book"), "Nonexistent book should not be found.");
    }

    // Test case to check if the library contains multiple books
    @Test
    public void testMultipleBooks() {
        libraryService.addBook("1984");
        libraryService.addBook("Brave New World");
        assertTrue(libraryService.searchBook("1984"), "1984 should be found.");
        assertTrue(libraryService.searchBook("Brave New World"), "Brave New World should be found.");
    }

    // AfterEach: This runs after each test is executed
    @AfterEach
    public void tearDown() {
        System.out.println("Test completed. Resetting state...");
        // Optionally, reset the state of the libraryService if needed.
        // In this case, the `LibraryService` object is reinitialized in `setUp()`, so no reset is needed.
    }

    // AfterAll: This runs once after all tests are executed
    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("Clean-up after all tests are done.");
        // This can be used for cleanup, such as releasing resources.
    }
}


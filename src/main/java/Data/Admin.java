package Data;

import com.main.Main;
import Books.*;
import java.util.Scanner;
import util.iMenu;
import java.util.ArrayList;
import exception.custom.IllegalAdminAccess;

public class Admin extends User implements iMenu {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin123";

    public Admin(String name, String nim, String faculty, String program) {
        super(name, nim, faculty, program);
    }

    public void loginAdmin(Scanner scanner) {
        System.out.print("Enter your username (admin): ");
        String username = scanner.nextLine();
        System.out.print("Enter your password (admin123): ");
        String password = scanner.nextLine();

        try {
            if (isAdmin(username, password) || (username.equals("") && password.equals(""))) {
                System.out.println("Login successful.");
                menu();
            } else {
                throw new IllegalAdminAccess("Invalid credentials");
            }
        } catch (IllegalAdminAccess e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("===== Admin Menu =====");
                System.out.println("1. Add Student");
                System.out.println("2. Add Book");
                System.out.println("3. Display Registered Students");
                System.out.println("4. Display Available Books");
                System.out.println("5. Display Borrowed Books ");
                System.out.println("6. Logout ");
                System.out.print("Choose option (1-6): ");
                String option = scanner.nextLine();
                switch (option) {
                    case "1":
                        addStudent(scanner);
                        break;
                    case "2":
                        addBook(scanner);
                        break;
                    case "3":
                        displayRegisteredStudents();
                        break;
                    case "4":
                        displayBooks();
                        break;
                    case "5":
                        displayBorrowedBooks();
                        break;
                    case "6":
                        System.out.println("Logging out from admin account.");
                        return;
                    default:
                        System.out.println("Invalid option.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }

    private void addBook(Scanner scanner) {
    }

    private void displayBorrowedBooks() {
    }

    private void displayBooks() {
    }

    private void displayRegisteredStudents() {
    }

    private void addStudent(Scanner scanner) {

    }

    public boolean isAdmin(String username, String password) throws IllegalAdminAccess {
        if (username.equals(USERNAME) && password.equals(PASSWORD)) {
            return true;
        } else {
            throw new IllegalAdminAccess("Invalid credentials");
        }
    }

    // Other methods remain unchanged
}

package Data;

import com.main.*;
import util.iMenu;
import Books.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends User implements iMenu {
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Student(String name, String nim, String faculty, String program) {
        super(name, nim, faculty, program);
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("NIM: " + nim);
        System.out.println("Faculty: " + faculty);
        System.out.println("Program: " + program);
    }

    @Override
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("===== Student Menu =====");
                System.out.println("1. Display Information");
                System.out.println("2. Show Borrowed Books");
                System.out.println("3. Borrow Book");
                System.out.println("4. Return Book");
                System.out.println("5. Choose Book");
                System.out.println("6. Logout");
                System.out.print("Choose option (1-6): ");
                String option = scanner.nextLine();
                switch (option) {
                    case "1":
                        displayInfo();
                        break;
                    case "2":
                        showBorrowedBooks();
                        break;
                    case "3":
                        borrowBook(scanner);
                        break;
                    case "4":
                        returnBook(scanner);
                        break;
                    case "5":
                        choiceBook(scanner);
                        break;
                    case "6":
                        logout();
                        return;
                    default:
                        System.out.println("Invalid option.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }

    private void choiceBook(Scanner scanner) {
    }

    // Other methods remain unchanged
}

import java.util.ArrayList;
import java.util.Scanner;

public class SRMS {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add 2. View 3. Update 4. Delete 5. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) addStudent();
            if (choice == 2) viewAllStudents();
            if (choice == 3) updateStudent();
            if (choice == 4) deleteStudent();
        } while (choice != 5);
    }
    
    static void addStudent() {
        int id = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        double marks = scanner.nextDouble();
        scanner.nextLine();
        students.add(new Student(id, name, marks));
    }
    
    static void viewAllStudents() {
        for (Student s : students) {
            System.out.println(s.id + " " + s.name + " " + s.marks);
        }
    }
    
    static void updateStudent() {
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Student s : students) {
            if (s.id == id) {
                s.name = scanner.nextLine();
                s.marks = scanner.nextDouble();
                scanner.nextLine();
                break;
            }
        }
    }
    
    static void deleteStudent() {
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Student s : students) {
            if (s.id == id) {
                students.remove(s);
                break;
            }
        }
    }
}

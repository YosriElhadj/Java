import java.util.Arrays;
import java.util.List;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        // Creating a list of students
        List<Etudiant> students = Arrays.asList(
                new Etudiant(1, "Alice", 20),
                new Etudiant(2, "Bob", 22),
                new Etudiant(3, "Charlie", 21)
        );

        // Creating an instance of StudentManagement
        StudentManagement studentManagement = new StudentManagement();

        // Displaying all students
        System.out.println("All students:");
        studentManagement.displayStudents(students, System.out::println);

        // Displaying students filtered by age (e.g., only students older than 20)
        System.out.println("\nStudents older than 20:");
        studentManagement.displayStudentsByFilter(students, student -> student.getAge() > 20, System.out::println);

        // Returning a string containing all student names
        String studentNames = studentManagement.returnStudentsNames(students, Etudiant::getNom);
        System.out.println("\nStudent names: " + studentNames);

        // Creating a new student using a supplier
        Etudiant newStudent = studentManagement.createStudent(() -> new Etudiant(4, "David", 23));
        System.out.println("\nNew student created: " + newStudent);

        // Sorting students by ID
        List<Etudiant> sortedStudents = studentManagement.sortStudentsById(students, Comparator.comparingInt(Etudiant::getId));
        System.out.println("\nStudents sorted by ID:");
        studentManagement.displayStudents(sortedStudents, System.out::println);

        // Converting the list of students to a stream
        System.out.println("\nStudents as a stream:");
        studentManagement.convertToStream(students).forEach(System.out::println);
    }
}

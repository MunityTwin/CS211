/**
 * Main class to print out the student's/professor's information based on user's input
 * 
 * @author Lam Phan
 * @version 20210929.1.0
 */
import school.Student;
import instructors.Professor;

public class App {
    /**
     * Main method to print out the student's/professor's information
     */
    public static void main(String[] args) {
        // Check the object's type
        if (args[0].equals("student")) {
            // Create a Student object (ID, First name + Last name, GPA)
            Student studentObj = new Student(Integer.parseInt(args[1]), args[2] + " " + args[3], Double.parseDouble(args[4]));
            System.out.println(studentObj.toString());
        }
        else {
            // Create a Professor object (ID, First name + Last name, salary)
            Professor professorObj = new Professor(Integer.parseInt(args[1]), args[2] + " " + args[3], Double.parseDouble(args[4]));
            System.out.println(professorObj.toString());
        }
    }
}

package school;

/**
 * A Class to manage information of students
 * 
 * @author Lam Phan
 * @version 20210929.1.0
 */
public class Student {
    private String name;
    private int id;
    private double GPA;
    
    /**
     * Constructors for class Student
     * 
     * @param id is the student's ID number
     * @param name is the name of the student
     * @param GPA is the student's GPA
     */
    public Student(int id, String name, double GPA) {
        this.id = id;
        this.name = name;
        this.GPA = GPA;
    }

    /**
     * Method to print out the student's information
     * 
     * @return Student name: *name*, ID: *id*, GPA: *gpa*
     */
    public String toString() {
        return "Student name: " + name + ", ID: " + id + ", GPA: " + GPA;
    }
}

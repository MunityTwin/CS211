package instructors;

/**
 * A Class to manage information of professors
 * 
 * @author Lam Phan
 * @version 20210929.1.0
 */
public class Professor {
    private String name;
    private int id;
    private double salary;

    /**
     * Constructors for class Professor
     * 
     * @param id is the professor's ID number
     * @param name is the name of the professor
     * @param salary is the professor's salary
     */
    public Professor(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * Method to print out the professor's information
     * 
     * @return Faculty name: *name*, ID: *id*, Salary: *salary*
     */
    public String toString() {
        return "Faculty name: " + name + ", ID: " + id + ", Salary: " + salary;
    }
}

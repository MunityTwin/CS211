package instructors;

public class Professor {
    private String name;
    private int id;
    private double salary;

    public Professor(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Faculty name: " + name + ", ID: " + id + ", Salary: " + salary;
    }
}

package branch_class;

public class branch_class {
    int salary;
    String name;
    double d;

    public branch_class(int salary, String name, double d) {
        this.salary = salary;
        this.name = name;
        this.d = d;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
}

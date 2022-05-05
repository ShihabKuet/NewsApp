package branch_class;

public class branch_class {
    int salary;
    String name;
    float f;

    public branch_class(int salary, String name, float f) {
        this.salary = salary;
        this.name = name;
        this.f = f;
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

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }
}

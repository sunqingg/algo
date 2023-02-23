package sun;

public class Employee {
    private String name;
    private double salary;
    private String gender;
    private double bonus;

//    public Employee() {
//    }

    public Employee(String name, double salary, String gender, double bonus) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

package Bai9;

public class Employee {
    private String name;
    private int id;
    private float salary;

    public Employee() {
    }

    public Employee(String name, int id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
            System.out.println("Lương đã tăng thêm " + amount + ". Lương mới: " + this.salary);
        } else {
            System.out.println("Số tiền tăng lương phải lớn hơn 0.");
        }
    }

    public String toString() {
        return "Tên nhân viên: " + this.name + " - Mã nhân viên: " + this.id + " - Lương nhân viên: " + this.salary;
    }
}

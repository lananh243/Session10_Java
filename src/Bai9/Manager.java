package Bai9;

public class Manager extends Employee {
    private float bonus;

    public Manager() {
    }

    public Manager(float bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, float salary, float bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public float getSalary() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        return "Tên nhân viên: " + getName() + " - Mã nhân viên: " + getId() + " - Lương nhân viên: " + getSalary() + " - Tiền thưởng: " + bonus;
    }
}

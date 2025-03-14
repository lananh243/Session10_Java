package Bai9;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer() {
    }

    public Developer(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Developer(String name, int id, float salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public float getSalary() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        return "Tên nhân viên: " + getName() + " - Mã nhân viên: " + getId() + " - Lương nhân viên: " + getSalary() + " - Ngôn ngữ lập trình: " +this.programmingLanguage;
    }
}

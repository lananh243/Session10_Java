package Bai7;

public class Student {
    private String name;
    private String id;
    private double gpa;

    public Student() {
    }

    public Student(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.err.println("Tên ko đc để trống");
        } else {
            this.name = name;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa > 0) {
            this.gpa = gpa;
        } else {
            System.err.println("GPA ko đc là số âm");
        }
    }

    public String getDetails() {
        return "Tên sinh viên: " + name + ", Mã sinh viên: " + id + ", GPA: " + gpa;
    }
}

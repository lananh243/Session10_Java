package Bai2;

public class Person extends Student {
    private String phoneNumber;
    private String studentId;

    public Person() {
    }

    public Person(String name, int age, String address, boolean sex, String phoneNumber, String studentId) {
        super(name, age, address, sex);
        this.phoneNumber = phoneNumber;
        this.studentId = studentId;
    }

    public Person(String phoneNumber, String studentId) {
        this.phoneNumber = phoneNumber;
        this.studentId = studentId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}

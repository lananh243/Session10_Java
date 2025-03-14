package Bai7;

public class ManagerStudent {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Nguyễn Văn A", "SV001", 3.5),
                new GraduateStudent("Trần Thị B", "SV002", 3.8, "Trí tuệ nhân tạo", "TS. Nguyễn Văn C"),
                new Student("Lê Văn C", "SV003", 3.2),
                new GraduateStudent("Phạm Thị D", "SV004", 3.9, "Xử lý ngôn ngữ tự nhiên", "PGS. Trần Thị E")
        };

        System.out.println("\nDanh sách sinh viên:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getDetails());
        }
    }
}

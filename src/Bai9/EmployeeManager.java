package Bai9;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee employee = new Employee("Nguyễn Văn A", 1, 2000);
        Manager manager = new Manager("Trần Thị B",2,3000,1000);
        Developer developer = new Developer("Phạm Văn C",3,4000,"Ngôn ngữ Java");

        System.out.println("Lương của nhân viên: "+employee.getSalary());
        System.out.println("Lương của quản lí: "+manager.getSalary());
        System.out.println("Lương của lập trình viên: "+developer.getSalary());

        System.out.println("Thông tin chi tiết về nhân viên: "+employee.toString());
        System.out.println("Thông tin chi tiết về quản lí: "+developer.toString());
        System.out.println("Thông tin chi tiết về lập trình viên: "+manager.toString());

        employee.increaseSalary(5000);
        System.out.println("Lương của nhân viên sau khi tăng lương: "+employee.toString());
        manager.increaseSalary(6000);
        System.out.println("Lương của quản lí sau khi tăng lương: "+manager.toString());
        developer.increaseSalary(4000);
        System.out.println("Lương của lập trình viên sau khi tăng lương: "+developer.toString());
    }
}

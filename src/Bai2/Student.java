package Bai2;

public class Student {
    /*
    1. Kế thừa là gì? Nó giúp ích gì trong lập trình hướng đối tượng?
    - Kế thừa là một trong những nguyên lý cơ bản của lập trình hướng đối tượng (OOP), cho phép tạo ra các lớp mới từ các lớp đã có, giúp tái sử dụng mã nguồn và tạo ra các quan hệ giữa các đối tượng.
    Trong Java, kế thừa được thực hiện bằng cách sử dụng từ khóa extends. Dưới đây là các loại kế thừa phổ biến và cách sử dụng từ khóa extends
    - 1. Kế thừa giúp giảm trùng lặp mã nguồn → Tiết kiệm thời gian viết code.
      2. Dễ dàng bảo trì và mở rộng → Khi cập nhật lớp cha, lớp con cũng được hưởng lợi.
      3. Hỗ trợ đa hình (polymorphism) → Giúp linh hoạt trong thiết kế phần mềm.
      4. Dễ dàng mở rộng hệ thống → Thêm lớp mới mà không cần thay đổi nhiều code cũ.
    2. Sự khác biệt giữa kế thừa và bao đóng (encapsulation) trong Java là gì?
       - Kế thừa (Inheritance) :
            + Mục đích : Tái sử dụng code, mở rộng tính năng.
            + Cách dùng : Dùng extends để kế thừa lớp cha.
            + Bảo mật : Không giới hạn quyền truy cập dữ liệu.
       - Bao đóng (Encapsulation) :
            + Mục đích : Bảo vệ dữ liệu, kiểm soát quyền truy cập.
            + Cách dùng : Dùng private + getter/setter để truy cập thuộc tính.
            + Bảo mật : Giới hạn truy cập, bảo vệ dữ liệu khỏi thay đổi ngoài ý muốn.
    4. Hãy chỉ ra các lợi ích và hạn chế khi sử dụng kế thừa trong Java?
        - Lợi ích của kế thừa
            1. Tái sử dụng mã nguồn
            2. Dễ dàng mở rộng và bảo trì
            3. Hỗ trợ tính đa hình (Polymorphism)
            4. Tăng khả năng mở rộng hệ thống
        - Hạn chế của kế thừa
            1. Lớp con phụ thuộc vào lớp cha
            2. Không hỗ trợ đa kế thừa trong Java
            3. Dễ gây ràng buộc không cần thiết
            4. Có thể làm tăng độ phức tạp
    * */

    private String name;
    private int age;
    private String address;
    private boolean sex;

    public Student() {
    }

    public Student(String name, int age, String address, boolean sex) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}

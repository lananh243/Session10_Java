package Bai1;

public class Encapsulation {
    /*
    1. Tính đóng gói là gì? Tại sao tính đóng gói lại quan trọng trong lập trình đối tượng?
    - Cho phép che dấu thông tin của các đối tượng và cung cấp các phương thức công khai (public API) để truy cập
    - 1. Bảo vệ dữ liệu
      2. Kiểm soát truy cập và duy trì tính toàn vẹn của dữ liệu
      3. Giúp dễ dàng bảo trì và mở rộng
      4. Tăng tính tái sử dụng mã nguồn
      5. Hỗ trợ bảo mật tốt hơn
    2. Làm thế nào để áp dụng tính đóng gói trong Java? Giải thích cách sử dụng các phương thức getter và setter.
       - Trong Java, tính đóng gói (Encapsulation) được áp dụng bằng cách:
            1. Khai báo các thuộc tính của lớp là private để ngăn chặn truy cập trực tiếp từ bên ngoài.
            2. Cung cấp các phương thức getter và setter để truy xuất hoặc cập nhật giá trị của các thuộc tính đó theo quy tắc nhất định.
            3. Sử dụng các mức độ truy cập (private, protected, public) để kiểm soát quyền truy cập vào dữ liệu.
        1. Getter (getX())
            Phương thức getter được sử dụng để lấy giá trị của một thuộc tính private.
            Nó trả về giá trị của thuộc tính tương ứng.
        2. Setter (setX(value))
            Phương thức setter được sử dụng để cập nhật giá trị của một thuộc tính private.
            Thường có kiểm tra điều kiện trước khi gán giá trị mới, giúp đảm bảo dữ liệu hợp lệ.
    4. Lợi ích của việc sử dụng tính đóng gói trong việc bảo vệ dữ liệu và kiểm soát quyền truy cập là gì?
        1. Bảo vệ dữ liệu khỏi truy cập trái phép.
        2. Kiểm soát dữ liệu thông qua các phương thức getter/setter.
        3. Dễ bảo trì và mở rộng chương trình.
        4. Ẩn thông tin chi tiết, giúp giảm độ phức tạp cho người dùng.
    * */
//    Ví dụ về Encapsulation
    private String name;
    private int age;

    public Encapsulation() {
    }

    public Encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
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
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Tuổi phải lớn hơn 0");
        }
    }
}

package Bai4;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Đắc Nhân Tâm", "Dale Carnegie", 9000);

        book.displayData();
        System.out.println();
        System.out.println("Sách sau khi được cập nhật giá : ");
        book.setPrice(12000);
        book.displayData();
        System.out.println();
        System.out.println("Giá sách sau khi thử cập nhật ko hợp lệ : ");
        book.setPrice(-1);
    }
}

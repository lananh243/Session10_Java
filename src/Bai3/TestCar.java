package Bai3;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("Toyota","Corolla",1960);

        car.displayData();
        car.setYear(1980);
        System.out.println();
        System.out.println("Mẫu xe sau khi cập nhật năm sản xuất : ");
        car.displayData();

        System.out.println();
        System.out.println("Năm sản xuất sau khi thử cập nhật không hợp lệ : ");
        car.setYear(2060);
    }
}

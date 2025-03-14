package Bai5;

import java.awt.*;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.printf("Diện tích hình tròn : %f", circle.getArea());
        System.out.println();
        Cylinder cylinder = new Cylinder(2);
        System.out.printf("Thể tích hình trụ : %f", cylinder.getVolume());
        System.out.println();
        circle.setRadius(3);
        System.out.printf("Diện tích hình tròn sau khi thay đổi bán kính : %f", circle.getArea());
        System.out.println();
        cylinder.setHeight(4);
        System.out.printf("Thể tích hình trụ sau khi thay đổi chiều cao : %f", cylinder.getVolume());
    }
}

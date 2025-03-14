package Bai10;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(1,3);
        Triangle triangle = new Triangle(3,4,5);

        System.out.println("Thông tin chi tiết của từng hình : ");
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(triangle.toString());

        Shape[] shapes = {
                new Circle("Hình tròn",3),
                new Rectangle("Hình chữ nhật",4,5),
                new Triangle("Tam giác",3,2,4),
        };


        for (Shape shape : shapes) {
            System.out.println(shape.getName() + ":");
            System.out.println("Diện tích: " +shape.calculateArea());
            System.out.println("Chu vi: "+shape.calculatePerimeter());
            System.out.println("----------------------------");
        }

    }
}

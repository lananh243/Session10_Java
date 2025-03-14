package Bai10;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        double area = width * height;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 2* (width + height);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Chiều rộng HCN: " +this.width+ " - Chiều dài HCN: " +this.height+ " - Diện tích HCN: " + calculateArea() + " - Chu vi HCN: " + calculatePerimeter();
    }
}

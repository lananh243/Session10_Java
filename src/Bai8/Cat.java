package Bai8;

public class Cat extends Animals{
    private String furColor;

    public Cat(String furColor) {
        this.furColor = furColor;
    }

    public Cat() {
    }

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " kêu: Meow Meow");
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + " - Màu lông: " + furColor;
    }
}

package Bai8;

public class Dog extends Animals{
    private String breed;

    public Dog() {
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " sủa: Woof Woof");
    }
    @Override
    public String displayInfo() {
        return super.displayInfo() + " - Giống chó: " + breed;
    }
}

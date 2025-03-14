package Bai8;

public class Animals {
    private String name;
    private int age;

    public Animals() {
    }

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Tên động vật ko được để trống");
        }else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }else {
            System.out.println("Tuổi động vật không được là số âm");
        }
    }

    public String displayInfo() {
        return "Tên động vật: " + this.name + " - " + "Tuổi động vật: " + this.age;
    }

    public void makeSound() {
        System.out.println(name + "Some generic sound");
    }
}

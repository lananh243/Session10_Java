package Bai8;

public class ManagerAnimal {
    public static void main(String[] args) {
        Animals[] animal = {
                new Dog("Ngao", 5, "Tibetan Mastiff"),
                new Cat("Tom", 4, "Xám"),
                new Dog("Luca",3,"Husky"),
                new Cat("Mini",5,"Trắng")
        };

        System.out.println("Danh sách động vật : ");
        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i].displayInfo());
            animal[i].makeSound();
        }
    }
}

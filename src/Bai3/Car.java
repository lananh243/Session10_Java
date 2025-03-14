package Bai3;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car() {
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 2025) {
            this.year = year;
        }else {
            System.out.println("Năm ko đc lớn hơn năm hiện tại");
        }
    }

    public void displayData() {
        System.out.printf("Thương hiệu của xe : %s - Mẫu xe : %s - Năm sản xuất của xe : %d",this.model,this.make,this.year);
    }
}

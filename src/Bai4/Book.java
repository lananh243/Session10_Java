package Bai4;

public class Book {
    private String title;
    private String author;
    private float price;

    public Book() {
    }

    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Giá không được âm");
        }
    }

    public void displayData() {
        System.out.printf("Tên sách : %s - Tác giả của sách : %s - Giá của sách : %f",this.title, this.author, this.price);
    }
}

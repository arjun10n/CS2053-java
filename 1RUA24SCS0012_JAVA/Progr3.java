class Book {
    public String title;
    public String author;
    public int price;
    public int year;
    public String category;
    public int block;

    // Constructor
    public Book(String title, String author, int price, int year, String category, int block) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
        this.category = category;
        this.block = block;
    }

    // Display method
    public void display() {
        System.out.println("The title is " + title + ", The author is " + author + 
                           ", The price is $ " + price + 
                           ", The year is " + year + 
                           ", The category is " + category + 
                           ", The block is " + block);
    }
}
public class Progr3 {
    public static void main(String args[]) {
        // Creating a Book object with example details
        Book book = new Book("Java Programming", "John Doe", 500, 2023, "Education", 2);

        // Display book info
        book.display();
    }
}
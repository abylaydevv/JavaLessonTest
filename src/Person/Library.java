package Person;

public class Library {
    private String name;
    private String city;
    private String country;
    private Book [] books;
    private int sizeOfBooks;

    Library(){
    }

    public Library(String name, String city, String country, Book[] books, int sizeOfBooks) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.books = books;
        this.sizeOfBooks = sizeOfBooks;
    }
}

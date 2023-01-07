package Person;

public class Book {
    private String name;
    private String code;
    private int pages;

    Book() {
    }

    public Book(String name, String code, int pages) {
        this.name = name;
        this.code = code;
        this.pages = pages;
    }
    String getBookData(){
        return name + "Name " + code +" Code "+ pages+ "Pages";
    }

}

package Person;

public class LiteratureBook extends Book{
private String author;
private int publishedYear;
    LiteratureBook(){
    }


    public LiteratureBook(String name, String code, int pages, String author, int publishedYear) {
        super(name, code, pages);
        this.author = author;
        this.publishedYear = publishedYear;
    }

    @Override
    String getBookData() {
        return super.getBookData();
    }

}

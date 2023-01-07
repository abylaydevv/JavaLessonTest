package Person;

public class ScientificBook extends Book{
    private int Price;
    private String publisher;

    ScientificBook(){
    }


    public ScientificBook(String name, String code, int pages, int price, String publisher) {
        super(name, code, pages);
        Price = price;
        this.publisher = publisher;
    }


    public ScientificBook(String name, String code, int pages) {
        super(name, code, pages);
    }


    @Override
    String getBookData() {
        return super.getBookData();
    }
}

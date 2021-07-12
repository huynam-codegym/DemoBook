
public class superBook extends Book1 {
    private String category;

    public superBook() {
    }

    public superBook(String bookCode, String name, int price,int number, String author, String category) {
        super(bookCode, name, price, number,author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

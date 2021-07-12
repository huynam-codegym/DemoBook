public class Book1 {
    private String codeBook;
    private String name;
    private int price;
    private int number;
    private String author;

public Book1(){

}

    public Book1(String codeBook, String name, int price, int number, String author) {
        this.codeBook = codeBook;
        this.name = name;
        this.price = price;
        this.number = number;
        this.author = author;
    }

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public int getAmount(){
    return price*number;
    }
}




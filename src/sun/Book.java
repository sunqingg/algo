package sun;

public class Book {
    int price;
    String name;
    String author;
    public Book() {this(10,"金刚经","laozi");}
    public Book(int p_price,String p_name,String p_author) {
        price = p_price;
        name = p_name;
        author = p_author;
    }
    public Book getBookName(Book xx) {
        System.out.println("价格： " + xx.price);
        System.out.println("姓名： " + xx.name);
        System.out.println("作者: " + xx.author);
        return xx;
    }
    public void setBookName(int p_price,String p_name,String p_author) {
        price = p_price;
        name = p_name;
        author = p_author;
    }
}




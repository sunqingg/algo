package sun;

public class UseBook {
    public static void main(String[] args) {
        Book books = new Book();
        System.out.println("书名： " + books.name);
//        books.getBookName();
        books.setBookName(99,"孙庆大帅逼","孙庆");
        Book testbooks = new Book();
//        testbooks.getBookName();
    }

}

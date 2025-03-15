import java.util.HashMap;
import java.util.Map;

public class Book {
    private static Map<Integer,Integer> Book_Storage=new HashMap<>();
    private static Map<Integer,Book> Data=new HashMap<>();
    int LSBN;
    private String book_title;
    private String author_name;
    private Double price;
    public Book(){

    }
    public static Map<Integer, Integer> getBook_Storage() {
        return Book_Storage;
    }

    public static Map<Integer, Book> getData() {
        return Data;
    }
    public static Book getBookData(int id){
        if(!Data.containsKey(id)){
            System.out.println("This book Not Available");
            return null;
        }
        return Data.get(id);
    }

    public int getLSBN() {
        return LSBN;
    }

    public void setLSBN(int LSBN) {
        this.LSBN = LSBN;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Book(int LSBN, String book_title, String author_name, Double price) {
        this.LSBN = LSBN;
        this.book_title = book_title;
        this.author_name = author_name;
        this.price = price;
        Book  data=new Book(LSBN,book_title,author_name,price);
        Data.put(LSBN,data);
        Book_Storage.put(LSBN,Book_Storage.getOrDefault(LSBN,0)+1);
    }
}

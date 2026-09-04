package DAY2.SESSION3;

class Book{
    String title;

    double price;
    
    Book(){
        this.title = "Wings of Fire";
        this.price = 110.0;
    }
}

public class NonParam {
    public static void main(String[] args) {
            Book b = new Book();
            System.out.println("Title: "+b.title + " Price: "+b.price);
    }
}
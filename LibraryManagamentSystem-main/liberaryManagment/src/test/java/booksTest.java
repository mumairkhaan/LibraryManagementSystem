import static org.junit.jupiter.api.Assertions.*;

class booksTest {
books b=new books();
    @org.junit.jupiter.api.Test
    void compareBookObjects() {
    Book b1=new Book(1,"Book 1","Author 1",4);
    Book b2=new Book(1,"Book 1","Author 1",4);
    int compare=1;
        assertEquals(compare,b.compareBookObjects(b1,b2));
    }



    @org.junit.jupiter.api.Test
    void isAvailable() {
        Book b1=new Book(1,"Book 1","Author 1",4);
        Book b2=new Book(1,"Book 1","Author 1",4);
        assertEquals(-1,b.isAvailable(3));
    }

}
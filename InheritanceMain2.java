class Book{
    String title;

    Book(String title){
        this.title = title;
    }
}

class TextBook extends Book{
    TextBook(String title){
        super(title);
    }
}

class ReferenceBook extends Book{
    ReferenceBook(String title){
        super(title);
    }
}

class Library{
    Book book; // HAS-A relationship

    Library(Book book){
        this.book = book;
    }

    void display(){
        System.out.println("Book: " + book.title);
    }
}

public class InheritanceMain2{
    public static void main(String args[]){
        TextBook t = new TextBook("Java");
        Library l = new Library(t);
        l.display();
    }
}
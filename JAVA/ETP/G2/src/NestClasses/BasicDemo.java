package NestClasses;

import java.util.ArrayList;
import java.util.List;

class Library{
    private List<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public class Book{
        private String title;
        private String author;
        private  int publicationYear;

        public Book(String title, String author, int publicationYear) {
            this.title = title;
            this.author = author;
            this.publicationYear = publicationYear;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getPublicationYear() {
            return publicationYear;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setPublicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", publicationYear=" + publicationYear +
                    '}';
        }
    }

    public void addBook(String title, String author, int publicationYear){
        Book newBook = new Book(title,author,publicationYear);
        books.add(newBook);
    }

    public void displayBooks(){
        for(Book book : books){
            System.out.println(book.toString());
        }
    }
}
public class BasicDemo {
    public static void main(String arg[]){
        Library library = new Library();
        library.addBook("ABC","ASDF",1999);
        library.addBook("XYZ","fudhs",2001);
        library.displayBooks();

    }
}

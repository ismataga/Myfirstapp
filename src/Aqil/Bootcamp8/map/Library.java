package Aqil.Bootcamp8.map;

import java.util.*;

public class Library {
    private Map<String, Book> bookMap;
    private List<String> bookTitles;
    private Set<String> author;

    public Library() {
        this.bookMap = new HashMap<>();
        this.bookTitles = new ArrayList<>();
        this.author = new HashSet<>();
    }

    public void addBook(Book book) {
        bookMap.put(book.getIsbn(), book);
        bookTitles.add(book.getTitle());
        author.add(book.getAuthor());

    }

    public void removeBook(String isbn) {
        Book bookToRemove = bookMap.get(isbn);
        if (bookToRemove != null) {
            bookMap.remove(isbn);
            bookTitles.remove(bookToRemove.getTitle());
            author.remove(bookToRemove.getAuthor());

        }
    }

    public List<String> getBookTitles() {
        return bookTitles;
    }

    public Set<String> getAuthor() {
        return author;
    }

    public Book searchBook(String title) {
        for (Book book : bookMap.values()) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        while ((true)) {
            System.out.println("Add an option\n" +
                    "1.Add book\n" +
                    "2.Remove book\n" +
                    "3.Search book\n" +
                    "4.List all book titles\n" +
                    "5.List all authors\n" +
                    "6.Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter ISBN: ");
                    String isbn = scanner.next();
                    System.out.println("Enter title: ");
                    String title = scanner.next();
                    System.out.println("Enter author: ");
                    String author = scanner.next();
                    Book book = new Book(isbn, title, author);
                    library.addBook(book);
                    System.out.println("Book added!");
                    break;
                case 2:
                    System.out.println("Enter ISBN: ");
                    isbn = scanner.next();
                    library.removeBook(isbn);
                    System.out.println("Book removed!");
                    break;
                case 3:
                    System.out.println("Enter title: ");
                    title = scanner.next();
                    book = library.searchBook(title);
                    if (book != null) {
                        System.out.println("Isbn " + book.getIsbn());
                        System.out.println("Author " + book.getAuthor());
                    } else {
                        System.out.println("Book not founded");
                    }
                    break;
                case 4:
                    System.out.println("Get all book titles");
                    for (String bookTitles : library.getBookTitles()) {
                        System.out.println(bookTitles);
                    }
                    break;
                case 5:
                    System.out.println("All authors");
                    for (String authorName : library.author) {
                        System.out.println(authorName);
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");


            }
        }

    }
}

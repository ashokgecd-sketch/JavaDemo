class BookNotAvailableException extends Exception {
    BookNotAvailableException() {
        super("Requested books not available");
    }
}

class Library {
    int availableBooks;

    Library(int n) {
        availableBooks = n;
    }

    void issueBook(int n) throws BookNotAvailableException {
        if (n > availableBooks)
            throw new BookNotAvailableException();
        availableBooks -= n;
        System.out.println("Book issued successfully");
    }
}

public class Practical34 {
    public static void main(String[] a) {
        Library l = new Library(3);
        try {
            l.issueBook(2);
            l.issueBook(2);
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}

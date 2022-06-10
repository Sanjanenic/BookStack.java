package UE3_BookStack;

public class Node{

    // *** Membervariablen ***
    private final String bookTitle;
    private Node next;


    public Node(String bookTitle) {
        this.bookTitle = bookTitle;

    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}


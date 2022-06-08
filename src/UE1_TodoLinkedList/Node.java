package UE1_TodoLinkedList;

public class Node {
    // *** Membervariablen ***
    String todoText;
    Node next;

    // *** Konstruktor (optional) ***


    // *** Getter- & Setter ***

    public void setTodoText(String todoText) {
        this.todoText=todoText;
    }

    public String getTodoText() {

        return todoText;
    }

    public void setNext(Node next) {
        this.next=next;
    }

    public Node getNext() {

        return next;
    }
}

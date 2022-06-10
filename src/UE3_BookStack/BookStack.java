package UE3_BookStack;

public class BookStack
{
    // *** Membervariablen ***
   private Node top;
   private Node next;

    // *** Getter- und Setter-Methoden ***

    public void setTop(Node top) {
        this.top = top;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getTop()
    {

        return top;
    }


    // *** Operationen ***

    public void push(String bookTitle)
    {
        Node newNode=new Node(bookTitle);
       //Fall: Stack ist leer:
        if(top==null){
          top=newNode;
        }
        //Fall: Stack ist nicht leer
        else{
        //ovo ne radi    newNode=setNext(top);
             top=newNode;
        }
    }

    public String pop() throws StackEmptyException
    {

     //Fall: leer:
        if(top==null){
            throw new StackEmptyException();
        }
        //Fall: nicht leer
        else{
            String returnString=top.getBookTitle(); //Zwischernscpeichern wert
            top=top.getNext();
            return returnString;
        }
    }

    public int getCount()
    {
        // TODO: Implementierung
        return 0;
    }
}

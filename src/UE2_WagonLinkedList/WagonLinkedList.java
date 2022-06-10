package UE2_WagonLinkedList;

public class WagonLinkedList {
    // *** Membervariablen ***

    private  Node first;
    private  Node last;

    // *** Methoden ***

    public Node getFirst() {

        return first;
    }

    public void setFirst(Node first) {
        this.first=first;
    }

    public Node getLast() {

        return last;
    }

    public void setLast(Node last) {
        this.last=last;
    }
//****Methoden****

    void insertWagonAtFirstPos(String wagonId) {

//Konoten anlegen
    Node newNode=new Node();
    newNode.setWagonId(wagonId);

  //Fall 2 Leere Liste:
    if(first==null){
        first=newNode;
        last=newNode;
    }

    //Fall 1 : Liste ist befühlt
    else{
        newNode.setNext(first);
        first.setPrev(newNode);
        first=newNode;
        }
    }

    void removeWagonFromLastPos() {
//F1= eine Element   F2= leere List    F3=liste heat mehre als 2 Noden

        //f2
        if(first==null){
            return;
        }
        //f1
        else if(first==last){
            first=null;
            last=null;
        }
        //f3
        else{
            last.getPrev().setNext(null);
            last=last.getPrev(); //so mache ich last-1 auf last

            //mit hilfsvariable wäre es so:

            // Node helpNode=last.getPrev();
//            helpNode.setNext(null);
//            last=helpNode;
        }
    }

    void printList() {
        System.out.print("* List: ");

        if (this.getFirst() == null) {
            System.out.print("<empty>");
        } else {
            Node currentNode = this.getFirst();
            while (currentNode != null) {
                System.out.print(currentNode.getWagonId() + ", ");
                currentNode = currentNode.getNext();
            }
        }

        System.out.println();
    }
}

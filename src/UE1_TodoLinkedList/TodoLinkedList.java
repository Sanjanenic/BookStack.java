package UE1_TodoLinkedList;

public class TodoLinkedList {
    // *** Membervariablen ***
    Node first;
    Node last;

    // *** Get-Methoden (Set-Methoden nicht notwendig) ***

    public Node getFirst() {

        return first;
    }

    public Node getLast() {

        return last;
    }

    // *** Operationen ***

    public void appendTodoText(String todoText) {
       //Fall 1 Leere List
        //neue Node machen
        Node newNode=new Node();
        newNode.setTodoText(todoText);
        if(first==null){
            first=newNode;
            last=first;
        }
        //Fall 2 Liste mit nur einen Element:
        else {
            last.setNext(newNode);  //ova linija povezuje element koji je bio
            //zadnji sa ubacenim elementom koji je sad zadnji
            last=newNode;
        }
    }

    public void deleteLastTodoText() {
        if(first != null) {

            Node current = first;
            do {
                current = current.getNext();
            }
            while (current != null && current.getNext() != last);
            //ovdje je current predzadnji element

            if (current != null) {
                current.setNext(null);
                last = current;
            } else {
                first = null;
                last = null;
            }
            
        }
    }

    public String getTodoTextAtIndex(int index) {
       Node current=first;
        for(int i=0;i<index-1;i++ ){
            current=current.next; //mit next se krecem kroz niz

        }
        return current.getTodoText();
    }
}

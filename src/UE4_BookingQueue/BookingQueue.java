package UE4_BookingQueue;

public class BookingQueue
{
    // *** Membervariablen ***
   private Node front;
   private Node rear;

    // *** Getter- und Setter-Methoden ***

    public Node getFront() {
        return front;
    }


    // *** Operationen ***

    public void enqueue(Booking newBooking)
    {
        // Kondet anlegen
        Node newNode =new Node (newBooking);
      //FAL: leer
      if(front==null)  {
          front=newNode;
          rear=newNode;
      }
      //FAL: nicht leer
      else{
          rear.setNext(newNode);
          rear=newNode;

      }
    }

    public Booking dequeue() throws QueueEmptyException
    {
        // Fall: leer
        if(front==null){
            throw  new QueueEmptyException();
        }
        //FAL nur 1 element
        else if(front==rear){
            Booking retournBooking = front.getBooking();
            front=null;
            rear=null;
            return  retournBooking;
        } //Fall:mehrere
        else {
            Booking retournBooking = front.getBooking();
            front=front.getNext(); //zweiter knodet wird zum ersten Konoten
            return retournBooking;

        }

    }

    public int getCount()
    { int counter=0;
        Node currentNode=front;

//Fall: mit viele elemente
        while(currentNode!=null){
            counter++;
            currentNode=currentNode.getNext();
        }

       return counter;
    }
}

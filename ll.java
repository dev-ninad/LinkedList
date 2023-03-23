public class ll {
    Node head;
    class Node{
        int data;
        Node next;
    

    public Node(int data)
    {
    
        this.data = data;
        this.next = null;
    }
}

// add element in LL
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
       
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            return;
        }
        Node currNode  = head;
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }


        public void print()  //print function
        {   

            if(head == null)
            {
                System.out.println("List is empty-->");
                return;
            }
            
        

        Node currNode = head;
        while(currNode != null)
        {
            System.out.print(currNode.data +" --> ");
            currNode = currNode.next;
        }
            System.out.println();
     }


     public void deleteFirst()
     {
            if(head == null)
            {
                System.out.println("Empty");
                return;
            }

            head = head.next;
     }

     public void deleteLast()
     {
        if(head == null)
        {
            System.out.println("Empty");
            return;
        }

        if(head.next == null)
        {
            head = null;
            return;
        }

        Node secondlast = head;
        Node lastNode = head.next;

        while(lastNode.next!=null)
        {
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }

        // we are at secondlast an now point it to null and lastnode will be deleted

        secondlast.next = null;

     }

    public static void main(String[] args) {
       ll list = new ll();
       
       list.addFirst(10);
       list.addFirst(20);
       list.addFirst(5);
       list.addFirst(01);
       list.addLast(30);
       list.print();
       list.deleteFirst();
       list.print();
       list.deleteLast();
       list.print();
    }
}

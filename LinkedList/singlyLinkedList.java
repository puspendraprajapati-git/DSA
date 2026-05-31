class LinkedList {
    static class Node{
        private int data;
        private Node next;

        public Node(int value){
            data=value;
            next=null;
        }
    }

    private Node head;

    public LinkedList(){
        head=null;
    }
    
    public boolean isEmpty(){
        return head==null;
    }
//Insert at first
    public void addFirst(int value){
        Node newNode= new Node(value);
        newNode.next=head;
        head=newNode;

    }
//Insert at end
    public void addLast(int value){
        Node newNode= new Node(value);
        if(head==null){
            head=newNode;
            return;
        }
        Node trav= head;

        while(trav.next!=null){
            trav=trav.next;
        }
        trav.next= newNode;
    }

    public void addAtPosition(int value, int pos){
        Node newNode= new Node(value);
        if(head==null && pos <=1){
            head=newNode;
            return;
        }

        Node trav= head;
        
        for(int i= 1;i< pos-1 && trav.next!=null ;i++){
            trav=trav.next;
        }
        newNode.next = trav.next;
        trav.next = newNode;
    }


    public void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(" "+ temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
}
public class singlyLinkedList {
    public static void main(String[] args){
        LinkedList list= new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);
        list.addLast(60);
        list.addLast(70);
        list.addLast(90);
        list.addAtPosition(65,6 );
        list.display();

    }
}




import Node.*;

class SinglyLinkedList{

  Node head;
  
  void insert(Node node){
    if(head==null){
      head=node;
    }
    else{
      Node ptr = head;
      while(ptr.next!=null){
        ptr=ptr.next;
      }
      ptr.next=node;
    }
  }

  void displayList(){
    Node ptr=head;
    while(ptr!=null){
      System.out.print(ptr.data+" ");
      ptr=ptr.next;
    }
  }
  public static void main(String args[]){
    Node head = new Node(0);
    SinglyLinkedList sll = new SinglyLinkedList();
    sll.head=head;

    for(int i=1;i<=5;i++){
      sll.insert(new Node(i));
    }

    sll.displayList();
  }
}
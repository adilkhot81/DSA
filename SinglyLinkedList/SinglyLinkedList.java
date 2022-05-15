class Node{
  int data;
  Node next;

  Node(int data){
    this.data=data;
    this.next=null;
  }

  static void insert(Node head, Node node){
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

  static void displayList(Node head){
    Node ptr=head;
    while(ptr!=null){
      System.out.print(ptr.data+" ");
      ptr=ptr.next;
    }
  }
}

class SinglyLinkedList{
  public static void main(String args[]){
    Node head = new Node(0);

    for(int i=1;i<=5;i++){
      Node.insert(head,new Node(i));
    }

    Node.displayList(head);
  }
}
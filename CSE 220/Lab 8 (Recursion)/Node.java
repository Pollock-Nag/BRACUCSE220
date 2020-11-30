public class Node{
  int elem;
  Node next;
  Node prev;
  public Node(int elem,Node next){
    this.elem=elem;
    this.next=next;
  }
  public Node(int elem,Node next,Node prev){
    this.elem=elem;
    this.next=next;
    this.prev=prev;
  }
}
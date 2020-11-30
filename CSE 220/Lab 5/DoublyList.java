import java.util.*;

public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
      head = new Node (null, null, null);
      Node tail=head;
      for(int i=0;i<a.length;i++){
        Node n= new Node(a[i], null, null);
        tail.next=n;
        n.prev=tail;
        tail=tail.next;
      }
      tail.next=head;
      head.prev=tail;
    }

    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        // TO DO
  int count=0;
  for(Node n= head.next;n!=head;n=n.next ){
  count++;
  }
return count;
    }

    
    /* prints the elements in the list */
    public void forwardprint(){
        // TO DO 
      for(Node n= head.next; n!=head;n=n.next){
        if(n.next!=head){
        System.out.print(n.element+", ");
      }
        else{
        System.out.print(n.element+".");
        }
      }System.out.println();
    }

         
    
    public void backwardprint(){
      // TO DO
      for(Node n= head.prev;n!=head;n=n.prev){
        if(n.prev!=head){
          System.out.print(n.element+", ");
        }
        else{
          System.out.print(n.element+".");
        }
      }
      System.out.println();
    }




    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
      // TO DO
      int count= countNode();
      if(idx<0||idx>count){
      }
      else{
        Node n= head.next;
        for(int i=0;i<count;i++){
          if(i==idx){
            return n;
          }
          n=n.next;
        }
      }
      return null;
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        // TO DO
      int count=countNode();
      int index=-1;
      for(int i=0;i<count;i++){
        for(Node n=head.next;n!=null;n=n.next){
          if(n.element==elem){
            index=i;
            break;
          }
        }
      }
      return index;
    }

    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        // TO DO
 
        int c=countNode();
        if(idx<0||idx>c){
          System.err.println("Invalid Index"); 

        }
        else{
         
          Node n = new Node(elem, null,null);
          Node x= null;
          Node y= null;
          Node temp= head;
          for(int i=0;i<=idx;i++){
          temp=temp.next;
          }
        x=temp.prev;
        y=temp;
        x.next=n;
        n.next=y;
        y.prev=n;
        n.prev=x;
        
        }
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        // TO DO
   int c=countNode();
       Node x= null;
        Node y= null;
        Node z= null;
        Node temp=head;
        if(index<0||index>c){
          return null;

        }
        else{
    
        for(Node n=head.next;n!=head;n=n.next){
      temp=temp.next;
        }
        y=temp;
        x=temp.prev;
        z=temp.next;
        x.next=z;
        z.prev=x;
       
        }
        return y.element;

    }
    
    
    
}
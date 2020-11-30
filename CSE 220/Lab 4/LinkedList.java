public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    // TO DO 
    Node n = new Node(a[0], null);
    head=n;
    Node tail= head;
    
    for(int i=1;i<a.length;i++){
      Node x = new Node (a[i], null);
      tail.next=x;
      tail=tail.next;
      
    }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    // TO DO
 head=h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    // TO DO
    int count=0;
    for(Node x=head;x!= null;x=x.next){
    count++;
    }
    return count;
    
      }
  
  /* prints the elements in the list */
  public void printList(){
    // TO DO
    for(Node n= head; n!= null; n=n.next){
    System.out.print(n.element+", ");
    }
    System.out.println();
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    // TO DO
    if(idx<0){
    }
    else{
    int count= countNode();
    Node start= head;
    for(int i=0;i<=count;i++){
      if(i==idx){
      return start;
      }
    start= start.next;
    }
    }
    return null; 
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    // TO DO
    int count = countNode();
    if(idx<0 || idx>count){
    }
    else{
    Node start= head;
    for(int i=0;i<=count;i++){
   
        if(i==idx){
        return start.element;
        }
      
        start=start.next;
    }
    }
    return null;
    }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    // TO DO
   
  int count = countNode();
  if(idx<0 || idx>count){
  }
  else {
  Node start = head;
  for(int i=0;i<count;i++){
    if(start.element==elem){
    Object temp= start.element;
    start.element= elem;
    return temp;
    }
    start=start.next;
  }
  }
  return null;
  }
    
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    // TO DO
   int count = countNode();
   int index= -1;
   for(int i=0;i<count ;i++){
     for(Node n= head; n!=null;n=n.next){
       if(n.element==elem){
       index=i;
       }
     }
   }
   return index;
  }
    
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    // TO DO
    int count = countNode();
    boolean flag = false;
    for(int i=0;i<count;i++){
      for(Node n=head;n!= null; n=n.next){
        if(n.element==elem){
        flag = true;
        }
      }
    }
    return flag;
    }
    
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    // TO DO
    Node newNode = new Node(head.element,null);
    Node tail=newNode;
    for(Node n= head.next;n!=null;n=n.next){
    Node x = new Node(n.element,null);
    tail.next=x;
    tail= tail.next;
    }
    return newNode; 
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    // TO DO
    Node reverseNode = new Node (head.element,null);
    for(Node n=head.next;n!=null;n=n.next){
     Node x = new Node (n.element, reverseNode);
     reverseNode=x;
    }
   return reverseNode;
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    // TO DO
 int count = countNode();
 if(idx<0||idx>count){
 }
 else if (idx==0){
   Node n = new Node(elem, null);
   n.next=head;
   head=n;
   }
 else{
int i=0;
Node x=null;
Node y=null;
for(Node n=head;n!= null;n=n.next){
  if(i == idx-1){
  x=n;
y=n.next;
}
i++;
}
 
 Node n = new Node(elem,null);
 n.next=y;
 x.next=n;
 }
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    // TO DO
   int count = countNode();
   if(index<0||index>count){
   return 0;
   }
   else if(index==0){
   Node n = new Node (head.element,null);
   Node temp =head;
   head=head.next;
   return temp.element;
   }
   else{
   int i=0;
   Node a=head;
   Node b=head.next;
   Node c= head.next.next;
   for(Node n=head;n!=null;n=n.next){
     if(i==index-1){
   a.next=c;
   return b.element;
   }
   i++;
   }
  }
    return null;
  }
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    // TO DO
    Node temp = head;
    head= head.next;
    int count= countNode();
    Node a= head;
    for(int i=0;i<=count;i++){
      if(a.next==null){
      a.next=temp;
      temp.next= null;
      }
      a=a.next;
    }
  }
    
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    // TO DO
    Node x= head;
    Node y= null;
    int count= countNode();
    for(int i=1;i<count;i++){
    y=x;
    x=x.next;
    }
    y.next= null;
    x.next=head;
    head=x;
  }
}
 
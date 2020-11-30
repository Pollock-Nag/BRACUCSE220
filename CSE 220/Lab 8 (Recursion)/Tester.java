public class Tester{
  public static void main(String[]pollock){
    Methods m=new Methods();
    int a[]={64,25,12,22,11}; 
    m.selectionSortArray(a,0);
    System.err.println("1. Selection sort for array:");
    for(int i=0; i<a.length;i++){
      System.out.print(a[i]+" ");
    }
    System.out.println();
    System.err.println("2. Insertion sort for array:");
    int c[]={64,25,12,22,11};
    m.insertionSortForArray(c,c.length);
    for(int i=0; i<c.length;i++){
      System.out.print(c[i]+" ");
    }
    System.out.println();
    System.err.println("3. Bubble sort for array:");
    int e[]={64,25,12,22,11};
    m.bubbleSortArray(e,e.length);
    for(int i=0; i<e.length;i++){
      System.out.print(e[i]+" ");
    }
    System.out.println();
    System.err.println("4. Selection sort for linkedList:");
    int b[]={64,25,12,22,11};
    Node head=m.linkedList(b);
    m.selectionSortForList(head);
    for(Node n=head;n!=null;n=n.next){
      System.out.print(n.elem+" ");
    }
    System.out.println();
    System.err.println("5. Insertion sort for linkedList:");
    int d[]={64,25,12,22,11};
    head=m.linkedList(d);
    m.insertionSortForList(head);
    for(Node n=head;n!=null;n=n.next){
      System.out.print(n.elem+" ");
    }
    System.out.println();
    System.err.print("6. Binary search: ");
    
    System.out.println(m.fibonacci(5));
    System.err.print("7. Fibonacci number: ");
    System.out.println(m.fibonacci(5));
  }
}
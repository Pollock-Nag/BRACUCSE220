public class Methods{
  public  void selectionSortArray(int a[],int idx){
    int min=a[idx];
    int minidx=idx;
    for(int i=idx+1; i<a.length;i++){
      if(a[i]<min){
        min=a[i];
        minidx=i;
      }
    }
    int temp=a[idx];
    a[idx]=a[minidx];
    a[minidx]=temp;
    if(idx==(a.length-1)) return ;
    else selectionSortArray(a,idx+1);
  }
  public void bubbleSortArray(int a[],int length){
     if(length==1) return;
     for(int i=0; i<length-1;i++){
        if(a[i]>a[i+1]){
           int temp=a[i];
           a[i]=a[i+1];
           a[i+1]=temp;
        }
     }
     bubbleSortArray(a,length-1);
  }
  public Node linkedList(int a[]){
    Node head=new Node (a[0],null);
    Node tail=head;
    for(int i=1; i<a.length;i++){
      Node n=new Node(a[i],null);
      tail.next=n;
      tail=tail.next;
    }
    return head;
  }
  public void selectionSortForList(Node head){
    for(Node n=head.next;n!=null;n=n.next){
      int temp=0;
      if(n.elem<head.elem){
        temp=head.elem;
        head.elem=n.elem;
        n.elem=temp;
      }
    }
    if(head.next==null) return;
    else selectionSortForList(head.next);
  }
  public int fibonacci(int a){
    if(a<2) return a;
    return fibonacci(a-1)+fibonacci(a-2);
  }
  public void insertionSortForArray(int []a,int length){
    if(length==1) return;
    insertionSortForArray(a,length-1);
    int key = a[length-1];
    int j = length-2;
    while (j>=0 && a[j]>key) {
      a[j+1]=a[j];
      j=j-1;
    }
    a[j+1]=key;
  }
  public void insertionSortForList(Node head){
     Node n=head;
    if(n.next==null) return;
    insertionSortForList(head.next);
    int key=n.elem;
    while(n.prev!=null && n.prev.elem>key){
       n.elem=n.prev.elem;
       n.prev.elem=key;
       n=n.prev;
    }
  }
  public int binarySearch(int arr[], int left, int right, int value){ 
    if(right >= left){ 
      int mid = left + (right - left) / 2; 
      if (arr[mid] == value) return mid; 
      if (arr[mid] > value) return binarySearch(arr, left, mid - 1, value); 
      return binarySearch(arr, mid + 1, right, value); 
    } 
    return -1; 
  }
}
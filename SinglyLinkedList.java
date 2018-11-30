public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head=null;
    }
    public void printValues(){
        if(this.head != null){
            Node current = this.head;
            while(current != null){
                System.out.println(current.value);
                current = current.next;
            }
        }
    }

    public void remove(){
        if (this.head !=null){
            Node current=this.head;
            while(current.next.next!=null){
                current=current.next;
            }
            current.next=null;
        }
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }  

    public Node find(int value){
        if(this.head!=null){
            if (this.head.value==value){
                return this.head;
            }else{
                Node current=this.head;
                while(current.next!=null){
                    if(current.value==value){
                        return current;
                    }
                    current=current.next;
                }
            }
        }
        return this.head;
        
    }  
}
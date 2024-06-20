class ll {
    node head;

    class node {
        int data;
        node next;

        // constructor
        node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public void addFirst(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    //count nodes
    public void countNodes(){
        int count=0;
        node currNode=head;
        while(currNode != null){
            currNode=currNode.next;
            count++;
        }
        System.out.println("number of nodes="+count);
    }
    public static void main(String args[]){
    ll list=new ll();
    list.addFirst(4);
    list.addFirst(3);
    list.addFirst(2);
    list.addFirst(1);
    list.printList();
    list.countNodes();
}
}

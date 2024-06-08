class linkedList {
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

    // add first function
    public void addFirst(int data) {
        node newNode = new node(data);
        // if list is empty
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        // if list is empty
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        // if list has one node
        if (head.next == null) {
            head = null;
            return;
        }
        node secLast = head;
        node lastNode = head.next;
        while (lastNode.next != null) {
            secLast = secLast.next;
            lastNode = lastNode.next;
        }
        secLast.next = null;

    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        }
        node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        linkedList list = new linkedList();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
        list.addLast(4);
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();

    }

}
package verwaltung;


public class DoublyLinkedList implements Listable {
    private class Node {
        Item data;
        Node previous;
        Node next;

        public Node(Item data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public void add(Item item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    @Override
    public void delete(Item item) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(item)) {
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                } else if (current == head) {
                    head = current.next;
                    head.previous = null;
                } else if (current == tail) {
                    tail = current.previous;
                    tail.next = null;
                } else {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                }
                break;
            }
            current = current.next;
        }
    }

    @Override
    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
    }

    @Override
    public void edit(Item item) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(item)) {
                current.data = item;
                break;
            }
            current = current.next;
        }
    }
}

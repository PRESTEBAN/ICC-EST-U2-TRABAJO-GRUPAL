package Model;

public class LinkedList<T> {

    public Node<T> head;
    private int size = 0;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void appenedToTail(T data) {
        if (head == null) {
            head = new Node<>(data);
            size++;
            return;
        }

        Node<T> current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(new Node<>(data));
        size++;
    }

    public T findByValue(T value) {
        Node<T> current = head;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public T deleteByValue(T value) {

        if (head == null) {
            return null;
        }

        if (head.getValue().equals(value)) {
            T deletedValue = head.getValue();
            head = head.getNext();
            size--;
            return deletedValue;
        }

        Node<T> current = head;

        while (current.getNext() != null) {
            if (current.getNext().getValue().equals(value)) {
                T deletedValue = current.getNext().getValue();
                current.setNext(current.getNext().getNext());
                size--;
                return deletedValue;
            }
            current = current.getNext();
        }

        return null;

    }

    public void print() {
        if (head == null) {
            System.out.println("END");
            return;
        }
        Node<T> current = head;
        while (current.getNext() != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println(current.getValue() + " -> END");
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    

}

package musterrrs.SorterApp.linkedlist;

import java.util.NoSuchElementException;

public class PrivLinkedList<E> {
    public static class Node<E> {
        E value;
        Node<E> next;
        Node(E value) {
            this.value = value;
            this.next = null;
        }
    }
    private Node<E> head;
    private int size;
    public PrivLinkedList(){
        this.head= null;
        this.size = 0;
    }
    public int size(){
        return this.size;
    }
    public void add (E element) {
        Node<E> nN = new Node<>(element);
        if (head == null) {
            head = nN;
        }else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = nN;
        }
        size++;

    }
    public void addIndex ( int index, E element) {
        if (index<0 || index>size) {
            throw new IndexOutOfBoundsException("Index : " + index + ", Size" + size);
        }Node<E> nN = new Node<>(element);
        if (index == 0 ) {
            nN.next = head;
            head = nN;
        } else {
            Node<E> previous = getNode(index - 1);
            nN.next = previous.next;
            previous.next = nN;
        }
        size++;
    }
    public E get(int index) {
        if(index<0||index>=size) {
            throw new IndexOutOfBoundsException("Info ; " + index+ ", Size" +size);
        }
        Node<E> current = getNode(index);
        return current.value;
    }

    private Node<E> getNode(int index) {
        Node<E> current = head;
        for (int i = 0; i< index; i++) {
            current = current.next;
        }
        return current;
    }

    public String toString() {
        if (head == null) {
            return "[]";
        } StringBuilder sb = new StringBuilder("[");
        Node<E> current = head;
        while (current != null) {
            sb.append(current.value);
            if (current.next !=null) {
                sb.append(" -> ");
            } current = current.next;
        } sb.append("]");
        return sb.toString();
    }
    public E remove(int index) {
        if(index<0 || index>=size) {
            throw new IndexOutOfBoundsException("index" + index + ", size " + size);
        } E removedvalue;
        if (index==0) {
            removedvalue = head.value;
            head = head.next;
        } else {
            Node<E> previous = getNode(index - 1);
            Node<E> nodeToRemove = previous.next;
            removedvalue = nodeToRemove.value;
            previous.next = nodeToRemove.next;
        } size--;
        return removedvalue;
    }
    public E removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is leer");
        }
        E oldValue = head.value;
        head = head.next;
        size--;
        return oldValue;
    }
}

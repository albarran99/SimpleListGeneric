package org.iesfm.genericList;

import java.util.Objects;

public class Lista<T> {
    private Nodo<T> head;

    public Lista(Nodo<T> head) {
        this.head = head;
    }

    public Lista() {
    }

    public void add(T value) {
        if (head == null) {
            head = new Nodo<>(value);
        } else {
            head.add(value);
        }
    }

    public T get(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        } else {
            return head.get(i);
        }

    }

    public int size() {
        if(head == null) {
            return 0;
        }else {
            return head.count(0);
        }
    }

    public int sizeWithBucleWhile() {
        Nodo<T> n = head;
        int size = 0;
        while(n != null) {
            size++;

            n = n.getNext();
        }

        return size;
    }

    public Nodo<T> getHead() {
        return head;
    }

    public void setHead(Nodo<T> head) {
        this.head = head;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lista)) return false;
        Lista<?> lista = (Lista<?>) o;
        return Objects.equals(head, lista.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head);
    }

    @Override
    public String toString() {
        return "List{" +
                "head=" + head +
                '}';
    }
}

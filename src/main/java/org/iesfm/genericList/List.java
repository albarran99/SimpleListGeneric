package org.iesfm.genericList;

import java.util.Objects;

public class List<T> {
    private Nodo<T> head;

    public List(Nodo<T> head) {
        this.head = head;
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
        if (!(o instanceof List)) return false;
        List<?> list = (List<?>) o;
        return Objects.equals(head, list.head);
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

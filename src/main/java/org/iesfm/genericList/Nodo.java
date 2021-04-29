package org.iesfm.genericList;

import java.util.Objects;

public class Nodo<T> {
    private T value;
    private Nodo<T> next;

    public Nodo(T value, Nodo<T> next) {
        this.value = value;
        this.next = next;
    }

    public Nodo(T value) {
        this.value = value;
    }

    public T get(int i) {
        if (i == 0) {
            return value;
        } else {
            return next.get(i - 1);
        }
    }

    public int count(int size) {
        if (next == null) {
            return size + 1;
        } else {
            return next.count(size + 1);
        }
    }

    public void add(T value) {
        if (next == null) {
            next = new Nodo<>(value);
        } else {
            next.add(value);
        }
    }

    public void removeLast() {
        if (next.getNext() == null) {
            next = null;
        }else {
            getNext().removeLast();
        }
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Nodo<T> getNext() {
        return next;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nodo)) return false;
        Nodo<?> nodo = (Nodo<?>) o;
        return Objects.equals(value, nodo.value) && Objects.equals(next, nodo.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next);
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}

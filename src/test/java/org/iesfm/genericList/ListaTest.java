package org.iesfm.genericList;

import org.junit.Assert;
import org.junit.Test;

public class ListaTest {

    @Test
    public void addEmptyTest() {
        Lista<String> listaStrings = new Lista<>();

        listaStrings.add("hola");

        Assert.assertEquals("hola", listaStrings.getHead().getValue());
    }

    @Test
    public void addNotEmptytest() {
        Lista<String> listaStrings = new Lista<>(new Nodo<>("adios"));

        listaStrings.add("hola");

        Assert.assertEquals("hola", listaStrings.getHead().getNext().getValue());
    }

    @Test
    public void getHeadTest() {
        Lista<String> listaStrings = new Lista<>(new Nodo<>("adios"));

        Assert.assertEquals(1, listaStrings.sizeWithBucleWhile());
    }

    @Test
    public void getLastTest() {
        Lista<String> listaStrings = new Lista<>(new Nodo<>("adios", new Nodo<>("hola")));

        Assert.assertEquals(2, listaStrings.sizeWithBucleWhile());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getOutOfBoundsTest() {
        Lista<String> listaStrings = new Lista<>(new Nodo<>("adios", new Nodo<>("hola")));
        listaStrings.get(3);
    }

    @Test
    public void removeHead() {
        Lista<String> listaStrings = new Lista<>(new Nodo<>("adios", new Nodo<>("hola")));

        listaStrings.removeHead();

        Assert.assertEquals("hola", listaStrings.getHead().getValue());
        Assert.assertEquals(1, listaStrings.sizeWithBucleWhile());
    }

    @Test
    public void removeLast() {
        Lista<String> listaStrings = new Lista<>(new Nodo<>("adios", new Nodo<>("hola")));

        listaStrings.removeLast();

        Assert.assertEquals("adios", listaStrings.getHead().getValue());
    }

}

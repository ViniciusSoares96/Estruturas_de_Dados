package SequenciaLista;

public class No<T> {

    private T element;
    private No<T> next;
    private No<T> prev;

    public No() {}

    public No(T element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public No<T> getNext() {
        return next;
    }

    public void setNext(No<T> next) {
        this.next = next;
    }

    public No<T> getPrev() {
        return prev;
    }

    public void setPrev(No<T> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "No{" +
                "element=" + element +
                '}';
    }
}

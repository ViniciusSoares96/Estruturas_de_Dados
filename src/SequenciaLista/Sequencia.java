package SequenciaLista;

public class Sequencia<T> {

    private No<T> head;
    private No<T> tail;
    int size = 0;

    public Sequencia(){
        head = new No<T>();
        tail = new No<T>();
        head.setNext(tail);
        tail.setPrev(head);
    }

    public int size(){
        return getSize();
    }

    public void inserirAntes(No next, T element){
        No no = new No(element);
        no.setNext(next);
        no.setPrev(next.getPrev());
        next.setPrev(no);
        no.getPrev().setNext(no);
        size++;
    }

    public void inserirDepois(No prev , T element){
        No no = new No(element);
        no.setPrev(prev);
        no.setNext(prev.getNext());
        no.getNext().setPrev(no);
        no.getPrev().setNext(no);
        size++;
    }

    public void inserirFinal(T element){
        inserirAntes(tail, element);
    }

    public void inserirInicio(T element){
        inserirDepois(head, element);
    }

    public void mostrarElementos(){
        No aux = head.getNext();
        while(aux != tail){
            System.out.println(aux.getElement());
            aux = aux.getNext();
        }
    }

    public No<T> primeiro(){
        No no = new No<T>();
        no = head.getNext();
        return no;
    }

    public No<T> ultimo(){
        No no = new No<T>();
        no = tail.getPrev();
        return no;
    }

    public T remover(No<T> no){
        no.getPrev().setNext(no.getNext());
        no.getNext().setPrev(no.getPrev());
        size--;
        return no.getElement();
    }

    public T trocarElemento(No<T> no, T elemento){
        T trocado = no.getElement();
        no.setElement(elemento);
        return trocado;
    }

    public No<T> antes(No<T> no) {
        return no.getPrev();
    }

    public No<T> depois(No<T> no) {
        return no.getNext();
    }

    public void trocarNos(No<T> no1, No<T> no2){
        T trocado = no1.getElement();
        no1.setElement(no2.getElement());
        no2.setElement(trocado);
    }

    public No<T> rankOf(No<T> no ){
        No n = head.getNext();
        int rank = 0;
        while(n != no){
            n = no.getNext();
            rank++;
        }
        if(no == tail){
            System.out.println("No nao existe na lista!");
            return n;
        }
        return n;
    }

    public int getSize(){
        return size;
    }

    public No<T> AtRank(int rank){
        No no;
        if(rank <=size/2){
            no = head.getNext();
            for(int i=0;i<rank;i++){
                no = no.getNext();
            }
        }else{
            no = tail.getPrev();
            for(int i = size-1; i>rank; i--){
                no = no.getPrev();
            }
        }
        return no;
    }

    public T elemAtRank(int rank){
        return AtRank(rank).getElement();
    }

    public void replaceAtRank(int rank, T element){
        AtRank(rank).setElement(element);
    }

    public void removeAtRank(int rank){
        No no = AtRank(rank);
        remover(no);
    }

    public void insertAtRank(int r ,T element){
        inserirAntes(AtRank(r), element);
    }
}

package FilaArray;

public class Fila implements IFila{

    int inicio, fim, capacidade;
    Object[] fila;

    public Fila(int capacidade) {
        inicio = 0;
        fim = 0;
        this.capacidade = capacidade;
        fila = new Object[capacidade];

    }

    @Override
    public void enqueue(Object o) {
        if(isFull()){
            duplicar();
        }
        fila[fim] = o;
        fim = (fim+1)%capacidade;
    }

    @Override
    public Object dequeue() throws FilaVaziaException{
        if(isEmpty()){
            throw new FilaVaziaException("Fila vazia");
        }
        Object o = fila[inicio];
        inicio = (inicio+1)%capacidade;
        return o;
    }

    public boolean isEmpty(){
        return inicio == fim;
    }

    public int size(){
        return (capacidade - inicio + fim) % capacidade;
    }

    public boolean isFull(){
        return size() == capacidade -1 ;
    }

    @Override
    public Object first() {
        Object o = fila[inicio];
        return o;
    }

    public void print(){
        for(int i = 0; i < fila.length; i++){
            System.out.printf(fila[i]+" ");
        }
        System.out.println();
    }

    private void duplicar(){
        int novaCapacidade = capacidade*2;
        Object[] filaNova = new Object[novaCapacidade];
        int ii = inicio;
        for(int ff = 0;ff<size();ff++){
            filaNova[ff] = fila[ii];
            ii=(ii+1)%novaCapacidade;
        }
        fim = size();
        inicio = 0;
        fila = filaNova;
    }

}

package VetorArray;

public class Vetor<T> {
    int capacidade, size;
    Object[] vetor;
    int inicio = 0;
    int fim = 0;

    public Vetor(int capacidade) {
        this.capacidade = capacidade;
        vetor = new Object[capacidade];
    }

    public void insertAtRank(int rank, T element) {
        if(isFull()){
            duplicar();
        }
        for(int i = size +1; i > rank; i--){
            vetor[i] = vetor[i-1];
        }
        vetor[rank] = element;
        size++;
    }

    public boolean isFull(){
        return size +1 == capacidade;
    }

    public void mostrar(){
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }

    public void duplicar(){
        System.out.println("era p duplicar kkk");
    }
}

package PilhaArray;

public class Pilha<T extends Comparable<T>> {

    public int t = -1;
    public int capacidade;

    Object[] pilha; // Usamos Object[] em vez de T[]

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.pilha = new Object[capacidade]; // Inicializando como Object[]
    }

    public int size() {
        return t + 1;
    }

    public boolean isFull() {
        if (t == capacidade - 1) {
            System.out.println("Pilha cheia");
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        return t == -1;
    }

    @SuppressWarnings("unchecked")
    public T top() throws PilhaVaziaExcecao {
        if (isEmpty()) {
            throw new PilhaVaziaExcecao("Pilha vazia");
        } else {
            return (T) pilha[t];  // Realiza um cast seguro
        }
    }

    public void push(T o) {
        if (isFull()) {
            capacidade *= 2;
            Object[] novoPilha = new Object[capacidade];
            for (int i = 0; i < pilha.length; i++) {
                novoPilha[i] = pilha[i];
            }
            System.out.println("Capacidade da pilha dobrada");
            pilha = novoPilha;
        }
        pilha[++t] = o;
    }

    @SuppressWarnings("unchecked")
    public T pop() throws PilhaVaziaExcecao {
        if (isEmpty()) {
            throw new PilhaVaziaExcecao("Pilha vazia");
        } else {
            T temp = (T) pilha[t]; // Realiza um cast seguro
            pilha[t] = null; // Limpa o índice
            t--;
            return temp;
        }
    }

    public void mostrarPilha() {
        for (int i = capacidade - 1; i >= 0; i--) {
            System.out.println(pilha[i]);
        }
        System.out.println(" ");
    }
}
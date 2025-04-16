package PilhaArray;

public class Pilha implements IPilha {

    public int t = -1;
    public int capacidade;

    Object[] pilha;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
         this.pilha = new Object[capacidade];
    }

    @Override
    public int size() {
        return t+1;
    }

    public boolean isFull(){
         if(t==capacidade-1){
             System.out.println("Pilha cheia");
             return true;
         }else{
             return false;
         }
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public Object top() throws PilhaVaziaExcecao {
        if(isEmpty()){
            throw new PilhaVaziaExcecao("Pilha vazia");
        }else{
            return pilha[t];
        }
    }

    @Override
    public void push(Object o) {
         if(isFull()){
             capacidade*=2;
             Object[] novoPilha = new Object[capacidade];
             for(int i=0;i<pilha.length;i++){
                 novoPilha[i] = pilha[i];
             }
             System.out.println("Capacidade da pilha dobrada");
             pilha = novoPilha;
             pilha[++t] = o;
         }else{
             pilha[++t] = o;
         }
    }

    @Override
    public Object pop() throws PilhaVaziaExcecao {
        if(isEmpty()){
            throw new PilhaVaziaExcecao("Pilha vazia");
        }else{
            t--;
            return pilha[t+1];
        }
    }
}

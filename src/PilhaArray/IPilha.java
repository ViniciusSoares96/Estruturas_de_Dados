package PilhaArray;


public interface IPilha<T> {
    public int size();    
    public boolean isEmpty();
    public T top() throws PilhaVaziaExcecao;
    public void push(T o);
    public T pop() throws PilhaVaziaExcecao;
}

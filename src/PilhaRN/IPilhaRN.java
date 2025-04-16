package PilhaRN;

import PilhaArray.PilhaVaziaExcecao;

public interface IPilhaRN {

    //          Pilha Vermelha
    public int sizeV();
    public boolean isEmptyV();
    public Object topV() throws PilhaVaziaExcecao;
    public void pushV(Object o);
    public Object popV() throws PilhaVaziaExcecao;

    //          Pilha Preta
    public int sizeP();
    public boolean isEmptyP();
    public Object topP() throws PilhaVaziaExcecao;
    public void pushP(Object o);
    public Object popP() throws PilhaVaziaExcecao;
}

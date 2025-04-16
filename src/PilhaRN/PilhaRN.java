package PilhaRN;

import PilhaArray.PilhaVaziaExcecao;

public class PilhaRN implements IPilhaRN {

    public int tp, tv, capacidade;
    Object[] pilhaRN;

    public PilhaRN(int capacidade) {
        this.capacidade = capacidade;
        this.pilhaRN = new Object[capacidade];
        this.tp = -1;
        this.tv = capacidade;
    }

    @Override
    public int sizeV() {
        return capacidade - tv;
    }

    @Override
    public boolean isEmptyV() {
        return capacidade == tv;
    }

    @Override
    public Object topV() throws PilhaVaziaExcecao {
        if(isEmptyV()){
            throw new PilhaVaziaExcecao("Pilha vazia");
        }
        return pilhaRN[tv];
    }

    @Override
    public void pushV(Object o) {
        if(isFull()){
            System.out.println("pilha cheia!");
        }
        pilhaRN[--tv] = o;
    }

    public boolean isFull(){
        return sizeV() + sizeP() == capacidade;
    }

    @Override
    public Object popV() throws PilhaVaziaExcecao {
        if(isEmptyV()){
            throw new PilhaVaziaExcecao("Pilha vermelha vazia");
        }
        return pilhaRN[++tv];
    }

    //      pilha preta funções

    @Override
    public int sizeP() {
        return tp+1;
    }

    @Override
    public boolean isEmptyP() {
        return tp==-1;
    }

    @Override
    public Object topP() throws PilhaVaziaExcecao {
        if (isEmptyP()){
            throw new PilhaVaziaExcecao("Pilha preta vazia");
        }
        return pilhaRN[tp];
    }

    @Override
    public void pushP(Object o) {
        if(isFull()){
            System.out.println("pilha preta");
        }
        pilhaRN[++tp] = o;
    }

    @Override
    public Object popP() throws PilhaVaziaExcecao {
        if (isEmptyP()){
            throw new PilhaVaziaExcecao("Pilha preta vazia");
        }
        return pilhaRN[--tp];
    }


    public void mostrar(){
        for(int i=0;i<pilhaRN.length;i++){
            System.out.println(pilhaRN[i]);
        }
    }
}

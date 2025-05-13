package ListaSimplesEncadeada;

public class ListaSimplesEncadeada {

    public NoSimples inicio = null;
    public NoSimples fim = null;



    public NoSimples getInicio() {
        return inicio;
    }

    public void setInicio(NoSimples inicio) {
        this.inicio = inicio;
    }

    public NoSimples getFim() {
        return fim;
    }

    public void setFim(NoSimples fim) {
        this.fim = fim;
    }

    public void inserirInicio(Object o) {
        NoSimples no = new NoSimples(o);
        if(inicio == null && fim == null) {
            fim = no;
        }
        no.setProximo(inicio);
        inicio = no;
    }

    public void inserirFim(Object o) {
        NoSimples no = new NoSimples(o);
        fim.setProximo(no);
        fim = fim.getProximo();
        fim.setProximo(null);
    }

    public void mostrarElementos() {
        NoSimples atual = inicio;

        if (atual == null) {
            System.out.println("Lista vazia");
            return;
        }

        System.out.print("Elementos da lista: ");
        while (atual != null) {
            System.out.print(atual.getElemento() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}



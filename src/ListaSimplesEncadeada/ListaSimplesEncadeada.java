package ListaSimplesEncadeada;

public class ListaSimplesEncadeada {

    public NoSimples inicio;
    public NoSimples fim;

    public void adicionarNo(Object o) {
        NoSimples no = new NoSimples(o);
        this.inicio = no;


    }

    public void adicionarNoInicio(Object o) {

    }

    public void adicionarNoFinal(Object o) {

    }
}

package ListaSimplesEncadeada;

public class testeListaSimples {
    public static void main(String[] args) {
        ListaSimplesEncadeada lista = new ListaSimplesEncadeada();
        lista.inserirInicio(10);
        lista.inserirInicio(15);
        lista.inserirInicio(20);
        lista.inserirFim(25);
        lista.mostrarElementos();
    }
}

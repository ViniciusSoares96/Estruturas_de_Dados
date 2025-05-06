package ListaSimplesEncadeada;

public class NoSimples {
    private Object elemento;
    private NoSimples proximo;

    public NoSimples(NoSimples proximo, Object elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public NoSimples(Object elemento) {
        this.elemento = elemento;
    }

    public NoSimples getProximo() {
        return proximo;
    }

    public void setProximo(NoSimples proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
}

package ListaSimplesEncadeada;

public class NoSimples {
    private Object elemento;
    private NoSimples proximo;


    public NoSimples(Object o) {
        this.elemento = o;
        this.proximo = null;
    }

    public NoSimples(Object o, NoSimples proximo) {
        this.elemento = o;
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object e) {
        elemento = e;
    }

    public NoSimples getProximo() {
        return proximo;
    }

    public void setProximo(NoSimples proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "NoSimples{" +
                "elemento=" + elemento +
                ", proximo=>" + proximo +
                '}';
    }
}

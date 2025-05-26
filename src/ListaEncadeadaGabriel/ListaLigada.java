package ListaEncadeadaGabriel;

public class ListaLigada {

        private No head;
        private No tail;
        private int size;

        public ListaLigada() {
            head = new No();
            tail = new No();
            head.setProximo(tail);
        }

        public void insertAfter(Object elemento, No anterior) {
            No no = new No(elemento);
            no.setProximo(anterior.getProximo());
            anterior.setProximo(no);
        }

        public void insertInicio(Object elemento) {
            insertAfter(elemento, head);
        }

        public void mostrarElementos() {
            No aux = head.getProximo();
            while (aux != tail) {
                System.out.println(aux.getElemento());
                aux = aux.getProximo();
            }
        }
}

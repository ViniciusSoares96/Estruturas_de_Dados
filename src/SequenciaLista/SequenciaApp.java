package SequenciaLista;

public class SequenciaApp {
    public static void main(String[] args) {
        Sequencia<Object> sequencia = new Sequencia<Object>();
        sequencia.inserirInicio(10);
        sequencia.inserirInicio(15);
        sequencia.inserirInicio(20);
        sequencia.inserirFinal(25);
        No<Object> noPrimeiro = sequencia.primeiro();
        No<Object> noUltimo = sequencia.ultimo();
        sequencia.mostrarElementos();
        System.out.printf("Primeiro = %d \n",noPrimeiro.getElement());
        System.out.printf("Ultimo = %d \n",noUltimo.getElement());
        Object removido =  sequencia.remover(noPrimeiro);
        System.out.printf("Removido = %d \n",removido);

        sequencia.trocarElemento(sequencia.primeiro(), 100);
        No<Object> noAntes = sequencia.antes(sequencia.ultimo());
        System.out.printf("Antes do ultimo = %d \n", noAntes.getElement());
        No<Object> noDepois = sequencia.depois(sequencia.primeiro());
        System.out.printf("depois do primeiro = %d \n", noDepois.getElement());
        sequencia.mostrarElementos();
        sequencia.trocarNos(sequencia.primeiro(), sequencia.ultimo());
        System.out.println("Depois da troca");
        System.out.println();


        /*
        * Teste metodos de vetor
        * */
        System.out.println("Operações de Vetor: ");
        System.out.print("elemAtRank -> elemento no rank 1: ");
        System.out.println(sequencia.elemAtRank(1));
        System.out.println();
        System.out.print("replaceAtRank -> troca elemento no rank 1: ");
        sequencia.replaceAtRank(1,2);
        System.out.println(sequencia.elemAtRank(1));
        System.out.println();
        System.out.println("insertAtRank -> insere elemento no rank 2: ");
        sequencia.insertAtRank(2,"Bola");
        sequencia.mostrarElementos();
        System.out.println();
        System.out.print("removeAtRank -> remove elemento no rank 2: ");
        sequencia.removeAtRank(2);


        System.out.println();
        sequencia.mostrarElementos();

    }
}

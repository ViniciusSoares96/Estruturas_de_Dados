package VetorArray;

public class testeVetor {
    public static void main(String[] args) {
        Vetor<Integer> vetor = new Vetor<Integer>(10);
        vetor.insertAtRank(0, 10);
        vetor.insertAtRank(1, 20);
        vetor.insertAtRank(2, 30);
        vetor.insertAtRank(3, 40);
        vetor.insertAtRank(4, 50);
        vetor.insertAtRank(3, 60);

        vetor.mostrar();
    }
}

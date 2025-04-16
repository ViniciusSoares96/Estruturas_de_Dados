package PilhaRN;

public class testePilhaRN {
    public static void main(String[] args) {
        PilhaRN pilhaRN = new PilhaRN(5);


        pilhaRN.pushP(4);
        pilhaRN.pushP(3);
        pilhaRN.pushP(2);
        pilhaRN.pushP(1);
        pilhaRN.pushV(0);
        pilhaRN.pushV(-1);
        pilhaRN.pushV(-2);

        pilhaRN.mostrar();

    }
}

package PilhaArray;

public class TorreHanoi {
    Pilha torreA = new Pilha<Integer>(5);
    Pilha torreB = new Pilha<Integer>(5);
    Pilha torreC = new Pilha<Integer>(5);

    public TorreHanoi() {
        torreA.push(5);
        torreA.push(4);
        torreA.push(3);
        torreA.push(2);
        torreA.push(1);
        for(int i = 0;i==5;i++){
            torreB.push(0);
            torreC.push(0);
        }
    }

    public void mover(Pilha<Integer> torre1, Pilha<Integer> torre2) {
        if (!torre1.isEmpty() && (torre2.isEmpty() || torre2.top().compareTo(torre1.top()) > 0)) {
            torre2.push(torre1.pop());
        } else {
            System.out.println("Movimento não permitido");
        }
    }

    /*
    public void mover( Pilha torre1, Pilha torre2){

        if(torre2.top().compareTo(torre1.top()) < 0){
            System.out.print("movimento não possivel");
        }

        torre2.push(torre1.pop());
    }
    */


}

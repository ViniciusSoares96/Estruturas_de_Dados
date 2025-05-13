package PilhaArray;

public class TorreHanoi {
    Pilha torreA = new Pilha(5);
    Pilha torreB = new Pilha(5);
    Pilha torreC = new Pilha(5);

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

    public void mover( Pilha torre1, Pilha torre2){
        /*
        * ainda n é possivel comparar -> fazer pilha ser Generics para usar Integer!
        if(torre2.top() < torre1.top()){
            System.out.print("movimento não possivel");
        }
        */
        torre2.push(torre1.pop());
    }

}

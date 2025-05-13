package PilhaArray;

import java.util.Scanner;

public class TorreHanoiApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TorreHanoi torreHanoi = new TorreHanoi();
        int i = 0;
        int jogadas = 0;
        while(i!=1){
            jogadas++;
            System.out.println("Jogadas: " + jogadas);
            System.out.println("Torre A : ");
            torreHanoi.torreA.mostrarPilha();
            System.out.println("Torre B : ");
            torreHanoi.torreB.mostrarPilha();
            System.out.println("Torre C : ");
            torreHanoi.torreC.mostrarPilha();

            System.out.print("Torre de origem (a,b ou c):");
            String origem = sc.next();
            System.out.print("Torre de destino (a,b ou c):");
            String destino = sc.next();
            if(origem.equals("a") && destino.equals("b")){
                torreHanoi.mover(torreHanoi.torreA, torreHanoi.torreB);
            }else if (origem.equals("a") && destino.equals("c")){
                torreHanoi.mover(torreHanoi.torreA, torreHanoi.torreC);
            }else if(origem.equals("b") && destino.equals("c")){
                torreHanoi.mover(torreHanoi.torreB, torreHanoi.torreC);
            }else if(origem.equals("b") && destino.equals("a")){
                torreHanoi.mover(torreHanoi.torreB, torreHanoi.torreA);
            }else if(origem.equals("c") && destino.equals("a")){
                torreHanoi.mover(torreHanoi.torreC, torreHanoi.torreA);
            }else if(origem.equals("c") && destino.equals("b")){
                torreHanoi.mover(torreHanoi.torreC, torreHanoi.torreB);
            }else{
                System.out.println("Movimento não permitido");
            }
        }


        sc.close();









    }
}

package PilhaArray;

public class TorreHanoiApp {
    public static void main(String[] args) {
        TorreHanoi torreHanoi = new TorreHanoi();
        System.out.println("Terre A : ");
        torreHanoi.torreA.mostrarPilha();
        System.out.println("Terre B : ");
        torreHanoi.torreB.mostrarPilha();
        System.out.println("Terre C : ");
        torreHanoi.torreC.mostrarPilha();

        torreHanoi.mover(torreHanoi.torreA, torreHanoi.torreB);
        System.out.println("Terre A : ");
        torreHanoi.torreA.mostrarPilha();
        System.out.println("Terre B : ");
        torreHanoi.torreB.mostrarPilha();
        System.out.println("Terre C : ");
        torreHanoi.torreC.mostrarPilha();
    }
}

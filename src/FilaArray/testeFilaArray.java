package FilaArray;

public class testeFilaArray {

	public static void main(String[] args) {

		Fila f = new Fila(2);

		f.enqueue(1);
		f.enqueue(2);
		f.enqueue(3);
		f.enqueue(4);
		f.print();
		try {
			System.out.println(f.first());
			f.dequeue();
			System.out.println(f.first());
			f.dequeue();
			System.out.println(f.first());
			f.dequeue();
			System.out.println(f.first());
			f.dequeue();
			System.out.println(f.first());
			f.dequeue();

		} catch (FilaVaziaException erro) {
			System.out.println(erro.getMessage());

		}
	}
}



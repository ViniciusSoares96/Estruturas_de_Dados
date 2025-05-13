package PilhaArray;

public class testePilha {

	public static void main(String[] args) {
		try {
			// Criar uma pilha com capacidade inicial de 3 elementos
			Pilha<Integer> pilha = new Pilha(3);

			// Testar se a pilha está inicialmente vazia
			System.out.println("A pilha está vazia? " + pilha.isEmpty());

			// Adicionar elementos na pilha
			pilha.push(10);
			pilha.push(20);
			pilha.push(30);

			// Exibir o topo da pilha
			System.out.println("Elemento no topo da pilha: " + pilha.top());

			// Tentar empurrar outro elemento (deve redimensionar ou gerar erro se não implementado)
			try {
				pilha.push(40); // Dependendo do tratamento, isso pode lançar um erro de pilha cheia
			} catch (StackOverflowError e) {
				System.out.println("Erro: " + e.getMessage());
			}

			// Remover elementos da pilha (desempilhar)
			System.out.println("Elemento removido: " + pilha.pop());
			System.out.println("Elemento removido: " + pilha.pop());

			// Mostrar itens restantes
			System.out.println("Elemento no topo após remoções: " + pilha.top());

			// Tentar esvaziar completamente
			System.out.println("Elemento removido: " + pilha.pop());

			// Verificar se a pilha está vazia após remover todos os elementos
			System.out.println("A pilha está vazia? " + pilha.isEmpty());
			System.out.println("Elemento no topo da pilha: " + pilha.pop());
			pilha.push(1);
			pilha.push(2);
			pilha.push(3);
			pilha.push(4);
			pilha.push(5);
			System.out.println("Numero de elementos na pilha: " + pilha.size());
			System.out.println("mostrar pilha: ");
			pilha.mostrarPilha();
			// Tentar desempilhar de uma pilha vazia (gera exceção)
			try {
				pilha.pop();
			} catch (PilhaVaziaExcecao e) {
				System.out.println("Erro: " + e.getMessage());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

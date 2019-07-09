package supertrunfo;

public class Principal {

	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		jogo.gerarCartas();
		jogo.getCartas()
			.forEach((c) -> c.mostrarCarta());
		
		jogo.distribuirCartas();
	}

}

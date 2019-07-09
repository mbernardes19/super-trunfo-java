package supertrunfo;

import java.util.ArrayList;

public class Monte {
	private Jogador jogador;
	private int qtdCartas;
	private ArrayList<Carta> cartas;
	private Carta cartaTopo;
	
	public Jogador getJogador() {
		return jogador;
	}
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	public int getQtdCartas() {
		return qtdCartas;
	}
	public void setQtdCartas(int qtdCartas) {
		this.qtdCartas = qtdCartas;
	}
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	public Carta getCartaTopo() {
		return cartaTopo;
	}
	public void setCartaTopo(Carta cartaTopo) {
		this.cartaTopo = cartaTopo;
	}
	
	public void mostrarCartaTopo() {
		this.cartaTopo.mostrarCarta();
	}
	
	public void adicionarCartas(ArrayList<Carta> cartasGanhas) {
		cartasGanhas.forEach((c) -> this.getCartas().add(c));
	}
	
	public void removerCartas(ArrayList<Carta> cartasPerdidas) {
		cartasPerdidas.forEach((c) -> this.getCartas().remove(c));
	}
	
	public Monte(Jogador jogador) {
		this.jogador = jogador;
		this.cartas = new ArrayList<Carta>();
	}
}

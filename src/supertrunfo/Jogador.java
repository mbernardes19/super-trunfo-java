package supertrunfo;

import java.util.ArrayList;

public class Jogador {
	private String nome;
	private Monte monte;
	private ArrayList<Carta> cartasPerdidas;
	private ArrayList<Carta> cartasGanhas;
	private boolean isCPU = false;
	private String caracteristicaSelecionada;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Monte getMonte() {
		return monte;
	}
	public void setMonte(Monte monte) {
		this.monte = monte;
	}
	public ArrayList<Carta> getCartasPerdidas() {
		return cartasPerdidas;
	}
	public void setCartasPerdidas(ArrayList<Carta> cartasPerdidas) {
		this.cartasPerdidas = cartasPerdidas;
	}
	public ArrayList<Carta> getCartasGanhas() {
		return cartasGanhas;
	}
	public void setCartasGanhas(ArrayList<Carta> cartasGanhas) {
		this.cartasGanhas = cartasGanhas;
	}
	public boolean isCPU() {
		return isCPU;
	}
	public void setCPU(boolean isCPU) {
		this.isCPU = isCPU;
	}
	public String getCaracteristicaSelecionada() {
		return caracteristicaSelecionada;
	}
	public void setCaracteristicaSelecionada(String caracteristicaSelecionada) {
		this.caracteristicaSelecionada = caracteristicaSelecionada;
	}
	
	public void verCartaTopo() {
		this.monte.mostrarCartaTopo();
	}
	
	public void selecionarCaracteristica(String caracteristica) {
		this.caracteristicaSelecionada = caracteristica;
	}
	
	public Jogador(String nome, boolean isCPU) {
		this.nome = nome;
		this.monte = new Monte(this);
		this.cartasGanhas = new ArrayList<Carta>();
		this.cartasPerdidas = new ArrayList<Carta>();
		this.isCPU = isCPU;
	}
}

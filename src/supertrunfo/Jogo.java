package supertrunfo;

import java.util.ArrayList;
import java.util.Random;

public class Jogo {
	private ArrayList<Jogador> jogadores;
	private int rodada = 0;
	private ArrayList<Carta> cartas;
	private int qtdCartas = 32;
	private Jogador vencedorRodada;
	private Jogador vez;
	
	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public int getRodada() {
		return rodada;
	}

	public void setRodada(int rodada) {
		this.rodada = rodada;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	public int getQtdCartas() {
		return qtdCartas;
	}

	public void setQtdCartas(int qtdCartas) {
		this.qtdCartas = qtdCartas;
	}

	public Jogador getVencedorRodada() {
		return vencedorRodada;
	}

	public void setVencedorRodada(Jogador vencedorRodada) {
		this.vencedorRodada = vencedorRodada;
	}

	public Jogador getVez() {
		return vez;
	}

	public void setVez(Jogador vez) {
		this.vez = vez;
	}
	
	public Jogo() {
		this.cartas = new ArrayList<Carta>();
		this.jogadores = new ArrayList<Jogador>();
		Jogador jogador1 = new Jogador("José", false);
		Jogador jogador2 = new Jogador("Bipbop", true);
		jogadores.add(jogador1);
		jogadores.add(jogador2);
	}

	public void gerarCartas() {
		double r1 = Math.ceil((Math.random()*100+1));
		double r2 = Math.ceil((Math.random()*100+1));
		double r3 = Math.ceil((Math.random()*100+1));
		double r4 = Math.ceil((Math.random()*100+1));
		double r5 = Math.ceil((Math.random()*100+1));
		Carta carta = new Carta("Charmander","1A",r1, r2, r3, r4, r5, false);
		this.cartas.add(carta);
		r1 = Math.ceil((Math.random()*100+1));
		r2 = Math.ceil((Math.random()*100+1));
		r3 = Math.ceil((Math.random()*100+1));
		r4 = Math.ceil((Math.random()*100+1));
		r5 = Math.ceil((Math.random()*100+1));
		Carta carta2 = new Carta("Bulbasaur","2A",r1, r2, r3, r4, r5, false);
		this.cartas.add(carta2);
		r1 = Math.ceil((Math.random()*100+1));
		r2 = Math.ceil((Math.random()*100+1));
		r3 = Math.ceil((Math.random()*100+1));
		r4 = Math.ceil((Math.random()*100+1));
		r5 = Math.ceil((Math.random()*100+1));
		Carta carta3 = new Carta("Squirtle","3A",r1, r2, r3, r4, r5, false);
		this.cartas.add(carta3);
		r1 = Math.ceil((Math.random()*100+1));
		r2 = Math.ceil((Math.random()*100+1));
		r3 = Math.ceil((Math.random()*100+1));
		r4 = Math.ceil((Math.random()*100+1));
		r5 = Math.ceil((Math.random()*100+1));
		Carta carta4 = new Carta("Pikachu","4A",r1, r2, r3, r4, r5, false);
		r1 = Math.ceil((Math.random()*100+1));
		r2 = Math.ceil((Math.random()*100+1));
		r3 = Math.ceil((Math.random()*100+1));
		r4 = Math.ceil((Math.random()*100+1));
		r5 = Math.ceil((Math.random()*100+1));
		Carta carta5 = new Carta("Charizard","5A",r1, r2, r3, r4, r5, false);
		r1 = Math.ceil((Math.random()*100+1));
		r2 = Math.ceil((Math.random()*100+1));
		r3 = Math.ceil((Math.random()*100+1));
		r4 = Math.ceil((Math.random()*100+1));
		r5 = Math.ceil((Math.random()*100+1));
		Carta carta6 = new Carta("Pidgey","6A",r1, r2, r3, r4, r5, false);
		r1 = Math.ceil((Math.random()*100+1));
		r2 = Math.ceil((Math.random()*100+1));
		r3 = Math.ceil((Math.random()*100+1));
		r4 = Math.ceil((Math.random()*100+1));
		r5 = Math.ceil((Math.random()*100+1));
		Carta carta7 = new Carta("Ratata","7A",r1, r2, r3, r4, r5, false);
		r1 = Math.ceil((Math.random()*100+1));
		r2 = Math.ceil((Math.random()*100+1));
		r3 = Math.ceil((Math.random()*100+1));
		r4 = Math.ceil((Math.random()*100+1));
		r5 = Math.ceil((Math.random()*100+1));
		Carta carta8 = new Carta("Nidoran","8A",r1, r2, r3, r4, r5, false);
		r1 = Math.ceil((Math.random()*100+1));
		r2 = Math.ceil((Math.random()*100+1));
		r3 = Math.ceil((Math.random()*100+1));
		r4 = Math.ceil((Math.random()*100+1));
		r5 = Math.ceil((Math.random()*100+1));
		Carta carta9 = new Carta("Grimer","1B",r1, r2, r3, r4, r5, true);
		r1 = Math.ceil((Math.random()*100+1));
		r2 = Math.ceil((Math.random()*100+1));
		r3 = Math.ceil((Math.random()*100+1));
		r4 = Math.ceil((Math.random()*100+1));
		r5 = Math.ceil((Math.random()*100+1));
	}
	
	public void distribuirCartas() {
		Random r = new Random();
		int x = r.nextInt((cartas.size() - 0) + 1) + 0;
		while(cartas.size() != 0) {
			for(int i = 0; i < jogadores.size(); i++) {
				jogadores.get(i).getMonte().getCartas().add(cartas.get(x));
				cartas.remove(x);
			}
		}
	}
	
	public void compararCartas(String caracteristica) {
		
	}
	
	public void passarVez() {
		
	}
}

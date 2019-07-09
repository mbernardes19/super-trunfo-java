package supertrunfo;

public class Carta {
	private String nome;
	private String caracteristica1Nome;
	private String caracteristica2Nome;
	private String caracteristica3Nome;
	private String caracteristica4Nome;
	private String caracteristica5Nome;
	private double caracteristica1;
	private double caracteristica2;
	private double caracteristica3;
	private double caracteristica4;
	private double caracteristica5;
	private String tipo;
	private boolean isSuperTrunfo;
	private double caracteristicaSelecionada;
	private Monte monte;
	
	public String getCaracteristica1Nome() {
		return caracteristica1Nome;
	}

	public void setCaracteristica1Nome(String caracteristica1Nome) {
		this.caracteristica1Nome = caracteristica1Nome;
	}

	public String getCaracteristica2Nome() {
		return caracteristica2Nome;
	}

	public void setCaracteristica2Nome(String caracteristica2Nome) {
		this.caracteristica2Nome = caracteristica2Nome;
	}

	public String getCaracteristica3Nome() {
		return caracteristica3Nome;
	}

	public void setCaracteristica3Nome(String caracteristica3Nome) {
		this.caracteristica3Nome = caracteristica3Nome;
	}

	public String getCaracteristica4Nome() {
		return caracteristica4Nome;
	}

	public void setCaracteristica4Nome(String caracteristica4Nome) {
		this.caracteristica4Nome = caracteristica4Nome;
	}

	public String getCaracteristica5Nome() {
		return caracteristica5Nome;
	}

	public void setCaracteristica5Nome(String caracteristica5Nome) {
		this.caracteristica5Nome = caracteristica5Nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCaracteristica1() {
		return caracteristica1;
	}

	public void setCaracteristica1(double caracteristica1) {
		this.caracteristica1 = caracteristica1;
	}

	public double getCaracteristica2() {
		return caracteristica2;
	}

	public void setCaracteristica2(double caracteristica2) {
		this.caracteristica2 = caracteristica2;
	}

	public double getCaracteristica3() {
		return caracteristica3;
	}

	public void setCaracteristica3(double caracteristica3) {
		this.caracteristica3 = caracteristica3;
	}

	public double getCaracteristica4() {
		return caracteristica4;
	}

	public void setCaracteristica4(double caracteristica4) {
		this.caracteristica4 = caracteristica4;
	}

	public double getCaracteristica5() {
		return caracteristica5;
	}

	public void setCaracteristica5(double caracteristica5) {
		this.caracteristica5 = caracteristica5;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isSuperTrunfo() {
		return isSuperTrunfo;
	}

	public void setSuperTrunfo(boolean isSuperTrunfo) {
		this.isSuperTrunfo = isSuperTrunfo;
	}

	public double getCaracteristicaSelecionada() {
		return caracteristicaSelecionada;
	}

	public void setCaracteristicaSelecionada(double caracteristicaSelecionada) {
		this.caracteristicaSelecionada = caracteristicaSelecionada;
	}

	public Monte getMonte() {
		return monte;
	}

	public void setMonte(Monte monte) {
		this.monte = monte;
	}
	
	public Carta(String nome,String tipo, double carac1, double carac2, double carac3, double carac4, double carac5,
			boolean isSuperTrunfo) {
		this.nome = nome;
		this.tipo = tipo;
		this.caracteristica1Nome = "Ataque";
		this.caracteristica2Nome = "Defesa";
		this.caracteristica3Nome = "Velocidade";
		this.caracteristica4Nome = "Ataque Esp";
		this.caracteristica5Nome = "Defesa Esp";
		this.caracteristica1 = carac1;
		this.caracteristica2 = carac2;
		this.caracteristica3 = carac3;
		this.caracteristica4 = carac4;
		this.caracteristica5 = carac5;
		this.isSuperTrunfo = isSuperTrunfo;

	}
	
	public void mostrarCarta() {
		System.out.println(
				"Nome: "+nome+"\n"+
				"Tipo: "+tipo+"\n"+
				caracteristica1Nome +": "+caracteristica1+"\n"+
				caracteristica2Nome +": "+caracteristica2+"\n"+
				caracteristica3Nome +": "+caracteristica3+"\n"+
				caracteristica4Nome +": "+caracteristica4+"\n"+
				caracteristica5Nome +": "+caracteristica5+"\n"
				
		);
	}
	
	public void selecionarCaracteristica(double caracteristica) {
		
	}
}

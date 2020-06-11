package TesteOO.domain;


import TesteOO.domain.enums.Titulacao;

public class Professor extends Pessoa {

	private Titulacao titulacao;

	public Professor(String nome, String nacionalidade, String telefone, Titulacao titulacao) {
		super(nome, nacionalidade, telefone);
		this.titulacao = titulacao;
	}

	public Titulacao getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(Titulacao titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "Professor [titulacao=" + titulacao + "]";
	}

}

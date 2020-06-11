package TesteOO.domain;



public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private String nacionalidade;
	private String telefone;

	public Pessoa(String nome, String nacionalidade, String telefone) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void String(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "InfIguais [nome=" + nome + ", nacionalidade=" + nacionalidade + ", telefone=" + telefone + "]";
	}


	@Override
	public int compareTo(Pessoa o) {
		return nome.compareTo(o.nome);
	}
	
}

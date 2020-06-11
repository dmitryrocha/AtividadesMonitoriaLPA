package TesteOO.domain;

public class Aluno extends Pessoa {

	// O atributo telefone é obrigatório apenas para alunos,
	// O tratamento para atributos obrigatórios e validação de atributos deve
	// utilizar exceptions.
	private Integer anoNacimento;
	private String escolaOrigem;

	public Aluno(String nome, String nacionalidade, String telefone, Integer anoNacimento, String escolaOrigem) {
		super(nome, nacionalidade, telefone);
		this.anoNacimento = anoNacimento;
		this.escolaOrigem = escolaOrigem;
	}

	public Integer getAnoNacimento() {
		return anoNacimento;
	}

	public void setAnoNacimento(Integer anoNacimento) {
		this.anoNacimento = anoNacimento;
	}

	public String getEscolaOrigem() {
		return escolaOrigem;
	}

	public void setEscolaOrigem(String escolaOrigem) {
		this.escolaOrigem = escolaOrigem;
	}

	@Override
	public String toString() {
		return "Aluno [anoNacimento=" + anoNacimento + ", escolaOrigem=" + escolaOrigem + "]";
	}

}

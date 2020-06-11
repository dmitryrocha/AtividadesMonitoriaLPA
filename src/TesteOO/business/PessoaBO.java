package TesteOO.business;




import TesteOO.domain.Aluno;
import TesteOO.domain.Professor;
import TesteOO.domain.enums.Titulacao;
import TesteOO.persistence.PessoaDAO;

public class PessoaBO {

	public static void cadastrarProfessor(String nome, String nacionalidade, String telefone, Titulacao titulacao) {
		Professor professor = new Professor(nome, nacionalidade, telefone, titulacao);
		PessoaDAO.inserirProf(professor);
	}

	public static void cadastrarAluno(String nome, String nacionalidade, String telefone, Integer anoNacimento,
			String escolaOrigem) {
		Aluno aluno = new Aluno(nome, nacionalidade, telefone, anoNacimento, escolaOrigem);
		PessoaDAO.inserirAluno(aluno);
	}

	public static void obterPessoasOrdemNome() {

	}

	public static void obterNomesEscolaOrigem() {
		
	}


	public static void obterPessoasOrdemNacionalidadeNome() {

	}
}

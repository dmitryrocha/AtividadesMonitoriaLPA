package TesteOO.persistence;


import TesteOO.domain.Aluno;
import TesteOO.domain.Professor;

public class PessoaDAO {
	private static final int QTD_MAX_ALUNOS = 1000;
	private static final int QTD_MAX_PROF = 100;
	private static int qtdAlunos = 0;
	private static int qtdprof = 0;
	private static Professor[] professores = new Professor[QTD_MAX_PROF];
	private static Aluno[] alunos = new Aluno[QTD_MAX_ALUNOS];

	public static void inserirProf(Professor professor) {
		professores[qtdprof] = professor;
		qtdprof++;
	}

	public static void inserirAluno(Aluno aluno) {
		alunos[qtdAlunos] = aluno;
		qtdAlunos++;
	}
}

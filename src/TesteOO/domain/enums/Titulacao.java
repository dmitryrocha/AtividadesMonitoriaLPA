package TesteOO.domain.enums;



public enum Titulacao {
	ESPECIALISTA(1, " Se Voc� � um Especialista "), 
	MESTRE(2, " Se Voc� � um Mestre "),
	DOUTOR(3, " Se Voc� � um Doutor ");
	
	private Integer codigo;

	private String descricao;

	private Titulacao(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String obterDescricaoDetalhada() {
		return "<" + codigo + "> " + descricao;
	}
	
	public static Titulacao valueOfCodigo (Integer opcaoInteger) {
		for (Titulacao menu: values()) {
			if (opcaoInteger.equals(menu.codigo)) {
				return menu;
			}
		}
		return null;
	}
}

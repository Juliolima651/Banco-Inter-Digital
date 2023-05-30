package enums;

public enum TipoAjuda {
	acesso("Como Acessar A Conta"),
	dados("Acessar Os Dados Da Sua Conta"),
	alterar_dados("Alterar Dados"),
	encerrar_conta("Encerrar Conta");
	
	private String tipoAjuda;

	private TipoAjuda(String tipoAjuda) {
		this.tipoAjuda = tipoAjuda;
	}

	public String getTipoAjuda() {
		return tipoAjuda;
	}

	public void setTipoAjuda(String tipoAjuda) {
		this.tipoAjuda = tipoAjuda;
	}
}

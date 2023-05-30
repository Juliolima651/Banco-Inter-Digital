package enums;

public enum TipoConta {
	Conta_bancaria("Conta Corrente"),
	Conta_bancaria2("Conta Poupança");
	
	private String tipoConta;

	private TipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
}

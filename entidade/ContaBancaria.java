package entidade;

public class ContaBancaria {
	private double saldo;
	private String pix;
	private String chave;
	private double emprestimo;
	private double cartaoDeCredito;
	private double cartaoDeDebito;
	private double deposiar;
	private double enviar;
	private double receber;
	
	public ContaBancaria(double saldo, String pix, String chave, double emprestimo, double cartaoDeCredito,
			double cartaoDeDebito, double depositar, double enviar, double receber) {
		this.saldo = saldo;
		this.pix = pix;
		this.chave = chave;
		this.emprestimo = emprestimo;
		this.cartaoDeCredito = cartaoDeCredito;
		this.cartaoDeDebito = cartaoDeDebito;
		this.deposiar = depositar;
		this.enviar = enviar;
		this.receber = receber;
	}
	public ContaBancaria() {
	}
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getPix() {
		return pix;
	}

	public void setPix(String pix) {
		this.pix = pix;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public double getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(double emprestimo) {
		this.emprestimo = emprestimo;
	}

	public double getCartaoDeCredito() {
		return cartaoDeCredito;
	}

	public void setCartaoDeCredito(double cartaoDeCredito) {
		this.cartaoDeCredito = cartaoDeCredito;
	}

	public double getCartaoDeDebito() {
		return cartaoDeDebito;
	}

	public void setCartaoDeDebito(double cartaoDeDebito) {
		this.cartaoDeDebito = cartaoDeDebito;
	}


	public double getDeposiar() {
		return deposiar;
	}


	public void setDeposiar(double deposiar) {
		this.deposiar = deposiar;
	}
	public double getEnviar() {
		return enviar;
	}
	public void setEnviar(double enviar) {
		this.enviar = enviar;
	}
	public double getReceber() {
		return receber;
	}
    public void setReceber(double receber) {
		this.receber = receber;
	}

}

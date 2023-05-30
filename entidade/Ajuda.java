package entidade;

public class Ajuda {
	private String acesso;
	private String dados;
	private String alterarDados;
	private String encerrarConta;
	
	public Ajuda(String acesso, String dados, String alterarDados, String encerrarConta) {
		this.acesso = acesso;
		this.dados = dados;
		this.alterarDados = alterarDados;
		this.encerrarConta = encerrarConta;
	}

	public String getAcesso() {
		return acesso;
	}

	public void setAcesso(String acesso) {
		this.acesso = acesso;
	}

	public String getDados() {
		return dados;
	}

	public void setDados(String dados) {
		this.dados = dados;
	}

	public String getAlterarDados() {
		return alterarDados;
	}

	public void setAlterarDados(String alterarDados) {
		this.alterarDados = alterarDados;
	}

	public String getEncerrarConta() {
		return encerrarConta;
	}

	public void setEncerrarConta(String encerrarConta) {
		this.encerrarConta = encerrarConta;
	}
}

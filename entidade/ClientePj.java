package entidade;

import heranca.Pessoa;

public class ClientePj extends Pessoa{
	private String nomeEmpresarial;
	private String cnpj;
	
	public ClientePj() {
	}

	public ClientePj(String nome, String dataNascimento, String cpf, String email, String telefone, String criarSenha,
			String novaSenha) {
		super(nome, dataNascimento, cpf, email, telefone, criarSenha, novaSenha);
	}

	public String getNomeEmpresarial() {
		return nomeEmpresarial;
	}

	public void setNomeEmpresarial(String nomeEmpresarial) {
		this.nomeEmpresarial = nomeEmpresarial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}

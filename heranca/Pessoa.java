package heranca;

public abstract class Pessoa {
	private String nome;
	private String dataNascimento;
	private String cpf;
	private String email;
	private String telefone;
	private String criarSenha;
	private String novaSenha;
	
	public Pessoa(String nome, String dataNascimento, String cpf, String email, String telefone, String criarSenha,String novaSenha) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.criarSenha = criarSenha;
		this.novaSenha = novaSenha;
	}
	public Pessoa() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNovaSenha() {
		return novaSenha;
	}
	public void setNovaSenha(String novaSenha) {
		this.novaSenha = novaSenha;
	}
	public String getCriarSenha() {
		return criarSenha;
	}
	public void setCriarSenha(String criarSenha) {
		this.criarSenha = criarSenha;
	}
	

}

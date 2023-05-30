package entidade;

import heranca.Pessoa;

public class ClientePf extends Pessoa{

	public ClientePf() {
	}

	public ClientePf(String nome, String dataNascimento, String cpf, String email, String telefone, String senha,
			String novaSenha) {
		super(nome, dataNascimento, cpf, email, telefone, senha, novaSenha);
	}
}

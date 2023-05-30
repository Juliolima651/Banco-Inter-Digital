package servico;

import java.util.ArrayList;

import entidade.ClientePf;
import repositorioCliente.ClientePfRepositorio;




public class ClientePfServico {
private ClientePfRepositorio clientePfRepositorio;
	
	public ClientePfServico (ArrayList<ClientePf> listaCliente) {
		this.clientePfRepositorio = new ClientePfRepositorio(listaCliente);
	}
	public void cadastrar(ClientePf clientePf) {
		if(clientePf.getNome().isBlank())
			System.out.println("NOME EM BRANCO!");
		else {
		 if(clientePf.getNome().isEmpty())
				System.out.println("NOME VAZIO!");
		else {
				if(clientePf.getNome().length() <= 4)
					System.out.println("DIGITE SEU NOME COMPLETO!");
				else {
					if(clientePf.getCpf().length() != 11)
						System.out.println("CPF INCORRETO!");
					else {
						if(verificarCpfDuplicado(clientePf.getCpf()))
							System.out.println("CPF DUPLICADO!");
						else {
							if(clientePf.getDataNascimento().length() != 8)
								System.out.println("DIGITE A DATA DE NASCIMENTO COM DIA MES E ANO!");
							else {
								if(clientePf.getEmail().length() <= 15)
									System.out.println("DIGITE UM EMAIL VALIDO!");
								else {
									if(verificarEmailDuplicado(clientePf.getEmail()))
										System.out.println("EMAIL DUPLICADO!");
									else {
									if(clientePf.getTelefone().length() <=10)
										System.out.println("DIGITE UM NUMERO DE TELEFONE VALIDO! APENAS NUMEROS!");
									else {
										if(verificarTelefoneDuplicado(clientePf.getTelefone()))
											System.out.println("TELEFONE DUPLICADO!");
										else {
											if(clientePf.getCriarSenha().length() < 7)
												System.out.println("SENHA INVALIDA! DIGITE UMA SENHA COM NO MINIMO 8 CARACTERES");
											else {
											clientePfRepositorio.cadastrar(clientePf);
										}
									}
								}
							}
				        }
					}
				}
			}
		}
	 }
  }
}
	public void atualizar(ClientePf clientePf) {
		clientePfRepositorio.cadastrar(clientePf);
	}
	public void deletar(ClientePf clientePf) {
		clientePfRepositorio.deletar(clientePf);
	}
	public boolean verificarCpfDuplicado(String cpf) {
		for(ClientePf clientePf : listar()) {
			if(clientePf.getCpf().equals(cpf))
				return true;
		}
		return false;
	}
	public boolean verificarTelefoneDuplicado(String telefone) {
		for(ClientePf clientePf : listar()) {
			if(clientePf.getTelefone().equals(telefone))
				return true;
		}
		return false;
	}
	public boolean verificarEmailDuplicado(String email) {
		for(ClientePf clientePf : listar()) {
			if(clientePf.getEmail().equals(email))
				return true;
		}
		return false;
	}
	 public ArrayList<ClientePf> listar(){
	    	return clientePfRepositorio.listar();
 }
	 public void imprimirClientePf() {
	    	
	    	for(ClientePf clientePf : clientePfRepositorio.listar()) {
	    		System.out.println("NOME: " + clientePf.getNome());
	    	}
	    }
	 public void imprimirClienteNovosDadosPf() {
		 for(ClientePf clientePf : clientePfRepositorio.listar()) {
			 System.out.println("NOME: " + clientePf.getNome());
			 System.out.println("CPF: " + clientePf.getCpf());
			 System.out.println("DATA DE NASCIMENTO: " + clientePf.getDataNascimento());
			 System.out.println("EMAIL: " + clientePf.getEmail());
			 System.out.println("TELEFONE: " + clientePf.getTelefone());
			 System.out.println("SENHA: " + clientePf.getCriarSenha());
		 }
	 }
	 public void imprimirClienteContaPf() {
		 for(ClientePf clientePf : clientePfRepositorio.listar()) {
			 System.out.println("NOME: " + clientePf.getNome());
			 System.out.println("CPF: " + clientePf.getCpf());
			 System.out.println("DATA DE NASCIMENTO: " + clientePf.getDataNascimento());
			 System.out.println("EMAIL: " + clientePf.getEmail());
			 System.out.println("TELEFONE: " + clientePf.getTelefone());
			 System.out.println("SENHA: " + clientePf.getCriarSenha());	 
		}
	}
}

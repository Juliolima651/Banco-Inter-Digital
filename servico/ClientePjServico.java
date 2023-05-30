package servico;

import java.util.ArrayList;
import entidade.ClientePj;
import repositorioCliente.ClientePjRepositorio;


public class ClientePjServico {
	private ClientePjRepositorio clientePjRepositorio;
	public ClientePjServico (ArrayList<ClientePj> listaCliente) {
		this.clientePjRepositorio = new ClientePjRepositorio(listaCliente);
	}
	public void cadastrar(ClientePj clientePj) {
		if(clientePj.getNomeEmpresarial().isBlank())
			System.out.println("NOME EM BRANCO!");
		else {
			if(clientePj.getNomeEmpresarial().isEmpty())
				System.out.println("NOME VAZIO!");
			else {
				if(clientePj.getNomeEmpresarial().length() <= 4)
					System.out.println("DIGITE O NOME EMPRESARIAL COMPLETO  DA SUA EMPRESA ");
				else {
					if(clientePj.getCnpj().length() != 14)
						System.out.println("CNPJ INCORRETO!");
					else {
						if(verificarCnpjDuplicado(clientePj.getCnpj()))
							System.out.println("CNPJ DUPLICADO!");
						else {
							if(clientePj.getEmail().length() <= 15)
								System.out.println("DIGITE UM EMAIL VALIDO!");
							else {
								if(verificarEmailDuplicado(clientePj.getEmail()))
									System.out.println("EMAIL DUPLICADO!");
								else {
									if(clientePj.getTelefone().length() <= 10)
										System.out.println("DIGITE UM NUMERO DE TELEFONE VALIDO! APENAS NUMEROS!");
									else {
										if(verificarTelefoneDuplicado(clientePj.getTelefone()))
											System.out.println("TELEFONE DUPLICADO!");
										else {
											if(clientePj.getCriarSenha().length() < 7)
												System.out.println("SENHA INVALIDA! DIGITE UMA SENHA COM NO MINIMO 8 CARACTERES!");
											else {
												clientePjRepositorio.cadastrar(clientePj);
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
	public void atualizar(ClientePj clientePj) {
		clientePjRepositorio.cadastrar(clientePj);
	}
	public void deletar(ClientePj clientePj) {
		clientePjRepositorio.deletar(clientePj);
	}
	public boolean verificarCnpjDuplicado(String cnpj) {
		for(ClientePj clientePj : listar()) {
			if(clientePj.getCnpj().equals(cnpj))
				return true;
		}
		return false;
	}
	public boolean verificarEmailDuplicado(String email) {
		for(ClientePj clientePj : listar()) {
			if(clientePj.getEmail().equals(email))
				return true;
		}
		return false;
	}
	public boolean verificarTelefoneDuplicado(String telefone) {
		for(ClientePj clientePj : listar()) {
			if(clientePj.getTelefone().equals(telefone))
				return true;
		}
		return false;
	}
	public ArrayList<ClientePj> listar(){
    	return clientePjRepositorio.listar();
	}
	public void imprimirClientePj() {
    	
    	for(ClientePj clientePj : clientePjRepositorio.listar()) {
    		System.out.println("NOME EMPRESARIAL: " + clientePj.getNomeEmpresarial());
    	}
    }
	public void imprimirClienteNovosDadosPj() {
		 for(ClientePj clientePj : clientePjRepositorio.listar()) {
			 System.out.println("NOME EMPRESARIAL: " + clientePj.getNomeEmpresarial());
			 System.out.println("CNPJ: " + clientePj.getCnpj());
			 System.out.println("EMAIL: " + clientePj.getEmail());
			 System.out.println("TELEFONE: " + clientePj.getTelefone());
			 System.out.println("SENHA: " + clientePj.getCriarSenha());
		 }
	}
	public void imprimirClienteContaPj() {
		 for(ClientePj clientePj : clientePjRepositorio.listar()){
			 System.out.println("NOME: " + clientePj.getNomeEmpresarial());
			 System.out.println("CNPJ: " + clientePj.getCnpj());
			 System.out.println("EMAIL: " + clientePj.getEmail());
			 System.out.println("TELEFONE: " + clientePj.getTelefone());
			 System.out.println("SENHA: " + clientePj.getCriarSenha());	 
		 }
	}
}
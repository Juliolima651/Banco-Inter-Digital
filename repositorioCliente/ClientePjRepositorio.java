package repositorioCliente;

import java.util.ArrayList;

import entidade.ClientePj;

public class ClientePjRepositorio {
public ArrayList<ClientePj> listaClientePj;
	
	public ClientePjRepositorio(ArrayList<ClientePj> listaClientePj) {
		this.listaClientePj = listaClientePj;
	}
	public void cadastrar(ClientePj clientePj) {
		listaClientePj.add(clientePj);
	}
	public ArrayList<ClientePj> listar(){
		return listaClientePj;
	}
	public ArrayList<ClientePj> listarPorNome(String nomeEmpresarial){
		ArrayList<ClientePj> listaPorNome = new ArrayList<>();
		
		for(ClientePj clientePj : listaClientePj) {
			if(clientePj.getNome().equals(nomeEmpresarial)) 
			listaPorNome.add(clientePj);
		}
		
		return listaPorNome;
	}
	public void atualizar(ClientePj clientePj, int index) {
		listaClientePj.add(index, clientePj);
	}
	
	public void deletar(ClientePj clientePj) {
		listaClientePj.remove(clientePj);
	}
	
	public void deletar(int indice) {
		listaClientePj.remove(indice);
 }
}

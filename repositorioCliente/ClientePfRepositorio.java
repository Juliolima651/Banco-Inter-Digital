package repositorioCliente;

import java.util.ArrayList;

import entidade.ClientePf;

public class ClientePfRepositorio {
public ArrayList<ClientePf> listaClientePf;
	
	public ClientePfRepositorio(ArrayList<ClientePf> listaClientePf) {
		this.listaClientePf = listaClientePf;
	}
	public void cadastrar(ClientePf clientePf) {
		listaClientePf.add(clientePf);
	}
	public ArrayList<ClientePf> listar(){
		return listaClientePf;
	}
	public ArrayList<ClientePf> listarPorNome(String nome){
		ArrayList<ClientePf> listaPorNome = new ArrayList<>();
		
		for(ClientePf clientePf : listaClientePf) {
			if(clientePf.getNome().equals(nome)) 
			listaPorNome.add(clientePf);
		}
		
		return listaPorNome;
	}
	public void atualizar(ClientePf clientePf, int index) {
		listaClientePf.add(index, clientePf);
	}
	
	public void deletar(ClientePf clientePf) {
		listaClientePf.remove(clientePf);
	}
	
	public void deletar(int indice) {
		listaClientePf.remove(indice);
 }	
}

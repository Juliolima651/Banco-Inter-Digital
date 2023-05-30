package repositorioAjuda;

import java.util.ArrayList;

import entidade.Ajuda;

public class AjudaRepositorio {
	public ArrayList<Ajuda> listaAjuda;
	
	public AjudaRepositorio(ArrayList<Ajuda> listaAjuda) {
		this.listaAjuda = listaAjuda;
	}
	public void cadastrar(Ajuda ajuda) {
		listaAjuda.add(ajuda);
	}
	public ArrayList<Ajuda> listar(){
		return listaAjuda;
	}
	public ArrayList<Ajuda> listarPorAjuda(String ajuda1){
		ArrayList<Ajuda> listaPorAjuda = new ArrayList<>();
		
		for(Ajuda ajuda : listaAjuda) {
			if(ajuda.getAcesso().equals(ajuda1)) 
			listaPorAjuda.add(ajuda);
		}
		
		return listaPorAjuda;
	}
	public void atualizar(Ajuda ajuda, int index) {
		listaAjuda.add(index, ajuda);
	}
	public void deletar(Ajuda ajuda) {
		listaAjuda.remove(ajuda);
	}
	public void deletar(int indice) {
		listaAjuda.remove(indice);
 }	
}

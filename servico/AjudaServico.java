package servico;

import java.util.ArrayList;

import entidade.Ajuda;
import repositorioAjuda.AjudaRepositorio;

public class AjudaServico {
	private AjudaRepositorio ajudaRepositorio;
	
	public AjudaServico (ArrayList<Ajuda> listaAjuda) {
		this.ajudaRepositorio = new AjudaRepositorio(listaAjuda);
	}
	public void cadastrar(Ajuda ajuda) {
		ajudaRepositorio.cadastrar(ajuda);;
	}
	public ArrayList<Ajuda> listar(){
    	return ajudaRepositorio.listar();
	}
	public void imprimirAjudaAcesso() {
    	for(Ajuda ajuda : ajudaRepositorio.listar()) {
    		System.out.println("Como Acessar Minha Conta: " + ajuda.getAcesso());   		
    	}
    }
	public void imprimirAjudaDados() {
    	for(Ajuda ajuda : ajudaRepositorio.listar()) {
    		System.out.println("Como Acessar Os Dados Da Minha Conta: " + ajuda.getDados());   		
    	}
    }
	public void imprimirAjudaAlterarDados() {
    	for(Ajuda ajuda : ajudaRepositorio.listar()) {
    		System.out.println("Como Alterar Os Dados Da Minha Conta: " + ajuda.getAlterarDados());   		
    	}
    }
	public void imprimirAjudaEncerrarConta() {
    	for(Ajuda ajuda : ajudaRepositorio.listar()) {
    		System.out.println("Como Encerrar Minha Conta: " + ajuda.getEncerrarConta());   		
    	}
    }
}

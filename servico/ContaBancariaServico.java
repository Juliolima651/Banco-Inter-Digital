package servico;

import java.util.ArrayList;

import entidade.ContaBancaria;
import repositorioContaBancaria.ContaBancariaRepositorio;

public class ContaBancariaServico {
private ContaBancariaRepositorio contaBancariaRepositorio;
	
	public ContaBancariaServico (ArrayList<ContaBancaria> listaContaBancaria) {
		this.contaBancariaRepositorio = new ContaBancariaRepositorio(listaContaBancaria);
	}
	public void cadastrar(ContaBancaria contaBancaria) {
		contaBancariaRepositorio.cadastrar(contaBancaria);;
	}
	public ArrayList<ContaBancaria> listar(){
    	return contaBancariaRepositorio.listar();
	}
	public void imprimirContaBancariaEmprestimo() {
    	for(ContaBancaria contaBancaria : contaBancariaRepositorio.listar()) {
    		System.out.println("Emprestimo: " + contaBancaria.getEmprestimo());
    		
    	}
    }
	public void imprimirContaBancariaSaldo() {
		for(ContaBancaria contaBancaria : contaBancariaRepositorio.listar()) {
			System.out.println("Saldo: " + contaBancaria.getSaldo());
		}
	}
	public void imprimirContaBancariaPix() {
		for(ContaBancaria contaBancaria : contaBancariaRepositorio.listar()){
			System.out.println("Pix: " + contaBancaria.getPix());
		}
	}
	public void imprimirContaBancariaCartaoDeCredito() {
		for(ContaBancaria contaBancaria : contaBancariaRepositorio.listar()){
			System.out.println("Seu Limite É: " + contaBancaria.getCartaoDeCredito());
		}
	}
	public void imprimirContaBancariaCartaoDeDebito() {
		for(ContaBancaria contaBancaria : contaBancariaRepositorio.listar()) {
			System.out.println("Seu Saldo É: " + contaBancaria.getCartaoDeDebito());
			
		}
	}

}

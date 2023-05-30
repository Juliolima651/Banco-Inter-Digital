package repositorioContaBancaria;

import java.util.ArrayList;

import entidade.ContaBancaria;

public class ContaBancariaRepositorio {
public ArrayList<ContaBancaria> listaContaBancaria;
	
	public ContaBancariaRepositorio(ArrayList<ContaBancaria> listaContaBancaria) {
		this.listaContaBancaria = listaContaBancaria;
	}
	public void cadastrar(ContaBancaria contaBancaria) {
		listaContaBancaria.add(contaBancaria);
	}
	public ArrayList<ContaBancaria> listar(){
		return listaContaBancaria;
	}
}

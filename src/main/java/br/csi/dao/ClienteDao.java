package br.csi.dao;

import java.util.ArrayList;

import br.csi.modelo.Cliente;

public class ClienteDao {
	
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public Long geraCodigo(){
		int co = clientes.size()+1;
		String cod = String.valueOf(co);
		Long codigo = Long.parseLong(cod);
		return codigo;
	}
	
	
	private void initClientes(){

		
		if(clientes.size() <= 0){
			clientes = new ArrayList<Cliente>();
			Cliente c = new Cliente();
			
			c.setCodigo(geraCodigo());
			c.setNome("Wilson");
			c.setRuaNroComp("Rodnei");
			c.setBairro("Victor Hugo");
			c.setCidade("Vilson");
			clientes.add(c);
		}
		
	}
	
	public boolean adicionar(Cliente c){
		System.out.println("Nome: "+c.getNome());
		System.out.println("Bairro: "+c.getBairro());
		c.setCodigo(geraCodigo());
		clientes.add(c);
		
		return true;
	}
	
	public ArrayList<Cliente> listaClientes(){
		initClientes();
		return clientes;
	}
	
	public boolean remover(Cliente c){
		System.out.println("Entrou em remover Cliente do Dao -------");
		
		for(Cliente cl : clientes){
			if(cl.getCodigo() == c.getCodigo()){
				clientes.remove(cl);
				return true;
			}
		}
		
		return false;
	}
	
	
}

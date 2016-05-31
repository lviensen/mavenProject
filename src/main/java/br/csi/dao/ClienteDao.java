package br.csi.dao;

import java.util.ArrayList;

import br.csi.modelo.Cliente;

public class ClienteDao {
	
	private ArrayList<Cliente> clientes;
	
	private void initClientes(){
		clientes = new ArrayList<Cliente>();
		Cliente c = new Cliente();
		c.setNome("Wilson");
		c.setRuaNroComp("Rodnei");
		c.setBairro("Victor Hugo");
		c.setCidade("Vilson");
		clientes.add(c);
	}
	
	public boolean adicionar(Cliente c){
		System.out.println("Nome: "+c.getNome());
		System.out.println("Bairro: "+c.getBairro());
		
		clientes.add(c);
		
		return true;
	}
	
	public ArrayList<Cliente> listaClientes(){
		initClientes();
		return clientes;
	}
	
}

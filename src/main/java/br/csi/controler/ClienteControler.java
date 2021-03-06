package br.csi.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.csi.dao.ClienteDao;
import br.csi.modelo.Cliente;

@Controller

public class ClienteControler {
@RequestMapping("clientes")
	public String msgTeste(){
		System.out.println("chamou o controlador");
		return "forward:listaClientes";
	}
	@RequestMapping("adicionarClientes")
	public String adiciona(Cliente cliente){
		boolean retorno = new ClienteDao().adicionar(cliente);
		if(retorno){
			return "forward:listaClientes";
		}else{
			return "erro";
		}
		
	}
	@RequestMapping("listaClientes")
	public ModelAndView lista(){
		System.out.println("......Chamou o listar ......");
		ModelAndView mv = new ModelAndView("cliente");
		mv.addObject("clientes", new ClienteDao().listaClientes());
		return mv;
	}
	@RequestMapping("removeClientes")
	public String remove(Cliente cliente){
		System.out.println("Entrou em remover Cliente");
		boolean remove = new ClienteDao().remover(cliente);
		return "forward:listaClientes";
	}
	
}

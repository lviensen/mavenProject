package br.csi.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ClienteControler {
@RequestMapping("clientes")
	public String msgTeste(){
		System.out.println("chamou o controlador");
		return "cliente";
	}
	
}

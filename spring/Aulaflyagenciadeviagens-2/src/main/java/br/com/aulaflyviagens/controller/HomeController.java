package br.com.aulaflyviagens.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/contato")
	public String mensagem() {
		
		return "msg";
	}
	
	@GetMapping("/destino")
	public String mensagem2() {
		
		return "msg2";
		
	}
	
	@GetMapping("/promocoes")
	public String mensagem3() {
		
		return "msg3";
		
	}
	
	@GetMapping("/entre")
	public String mensagem4() {
		
		return "msg4";
		
	}
	
	@GetMapping("/flyviagens")
	public String mensagem5() {
		
		return "msg5";
		
	}
}

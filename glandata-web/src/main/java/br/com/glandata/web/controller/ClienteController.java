package br.com.glandata.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.glandata.web.model.Cliente;
import br.com.glandata.web.repository.ClienteRepository;


@Controller
@RequestMapping("clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	// Exibe página com todos os clientes
	@GetMapping()
	public ModelAndView index() {
		return new ModelAndView("cliente/index");
	}
	
	// Acessa formulario de cadastro do cliente
	@GetMapping("novo")
	public ModelAndView novo(Cliente cliente) {	
		return new ModelAndView("cliente/novo");
	}
	
	//Recebe os dados do formulario e cadastra no bando ce dados
	@PostMapping("novo")
	public ModelAndView inserir(@Valid Cliente cliente, BindingResult result, RedirectAttributes redirect) {
		
		if(result.hasErrors()) {
			return new ModelAndView("cliente/novo");
		}
	
		//cliente.setCpf(cliente.getCpf().replace("\\.", "")); Exemplo para tirar pontos do texto
		
		clienteRepository.save(cliente);
		
		redirect.addFlashAttribute("mensagem", "Cliente cadastrado com sucesso!");
			
		return new ModelAndView("redirect:/clientes");	
	
	}
	
	// Alterar os dados do cliente
	@GetMapping("editar")
	public ModelAndView editar(Long idCliente) {
		return new ModelAndView("cliente/editar");
	
	}
	
	// Recebe dados do formulário alteração para alterar o cliente
	@PostMapping("editar")
	public ModelAndView editar(Cliente cliente) {
		return new ModelAndView("cliente/editar");

	}
	
	/**
	 *  Este metodo e responsavel por excluir um cliente a partir do id informado
	 * @param idCliente recebe o id do cliente que sera excluido
	 * @return retona para a pagina de listagem de clientes exibindo a mensagem de status
	 */
	
	//Recebe o id do cliente e deleta registros
	@PostMapping("deletar")
	public ModelAndView deletar(Long idCliente) {
		return new ModelAndView("cliente/deletar");

	}
	

}

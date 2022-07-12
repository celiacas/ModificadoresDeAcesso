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

import br.com.glandata.web.model.Produto;
import br.com.glandata.web.repository.ProdutosRepository;


@Controller
@RequestMapping("produtos")
public class ProdutosController {
	
	@Autowired
	private ProdutosRepository produtoRepository;
	
	// Exibe página com todos os produtos
	@GetMapping()
	public ModelAndView index() {
		return new ModelAndView("produto/index");
	}
	
	// Acessa formulario de cadastro do produto
	@GetMapping("novo")
	public ModelAndView novo(Produto produto) {	
		return new ModelAndView("produto/novo");
	}
	
	//Recebe os dados do formulario e cadastra no bando ce dados
	@PostMapping("novo")
	public ModelAndView inserir(@Valid Produto produto, BindingResult result, RedirectAttributes redirect) {
		
		if(result.hasErrors()) {
			return new ModelAndView("produto/novo");
		}
			
		produtoRepository.save(produto);
		
		redirect.addFlashAttribute("mensagem", "Produto cadastrado com sucesso!");
			
		return new ModelAndView("redirect:/produtos");	
	
	}
	
	// Alterar os dados do produto
	@GetMapping("editar")
	public ModelAndView editar(Long idProdutoe) {
		return new ModelAndView("produto/editar");
	
	}
	
	// Recebe dados do formulário alteração para alterar o cliente
	@PostMapping("editar")
	public ModelAndView editar(Produto produto) {
		return new ModelAndView("produto/editar");

	}
	
	
	//Recebe o id do produto e deleta registros
	@PostMapping("deletar")
	public ModelAndView deletar(Long idProduto) {
		return new ModelAndView("produto/deletar");

	}
	

}

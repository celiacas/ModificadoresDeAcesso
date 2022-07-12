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

import br.com.glandata.web.model.Categoria;
import br.com.glandata.web.repository.CategoriaRepository;

@Controller
@RequestMapping("categorias")
public class CategoriaController {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	// Exibe página com todas as categorias
	@GetMapping()
	public ModelAndView index() {
		return new ModelAndView("categoria/index");
	}
	
	// Acessa formulario de cadastro de categorias
	@GetMapping("novo")
	public ModelAndView novo(Categoria categoria) {	
		return new ModelAndView("categoria/novo");
	}
	
	//Recebe os dados do formulario e cadastra no bando de dados
	@PostMapping("novo")
	public ModelAndView inserir(@Valid Categoria categoria, BindingResult result, RedirectAttributes redirect) {
		
		if(result.hasErrors()) {
			return new ModelAndView("categoria/novo");
		}
		
		categoriaRepository.save(categoria);
		
		System.out.println(categoria);
		
		redirect.addFlashAttribute("mensagem", "Categoria cadastrada com sucesso!");
			
		return new ModelAndView("redirect:/categorias");	
	
	}
	
	// Alterar os dados de categorias
	@GetMapping("editar")
	public ModelAndView editar(Long idCategoria) {
		return new ModelAndView("categoria/editar");
	
	}
	
	// Recebe dados do formulário alteração para alterar o categoria
	@PostMapping("editar")
	public ModelAndView editar(Categoria categoria) {
		return new ModelAndView("categoria/editar");

	}
	
	
	//Recebe o id da categoria e deleta registros
	@PostMapping("deletar")
	public ModelAndView deletar(Long idCategoria) {
		return new ModelAndView("categoria/deletar");

	}

	
}

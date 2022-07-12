package br.com.glandata.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.glandata.web.model.Cliente;
import br.com.glandata.web.model.Produto;

@Repository
public interface ProdutosRepository  extends JpaRepository<Produto, Long> {
	
	
}

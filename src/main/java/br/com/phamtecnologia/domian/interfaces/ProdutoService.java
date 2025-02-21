package br.com.phamtecnologia.domian.interfaces;

import java.util.List;
import java.util.UUID;

import br.com.phamtecnologia.domian.entities.Produto;
import br.com.phamtecnologia.dtos.ProdutoPostDto;

public interface ProdutoService {

	void create(ProdutoPostDto dto) throws Exception;
	void update(Produto produto) throws Exception;
	void delete(UUID id) throws Exception;
	
	List<Produto> findAll() throws Exception;
	Produto findById(UUID id) throws Exception; 
}

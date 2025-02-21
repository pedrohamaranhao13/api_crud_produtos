package br.com.phamtecnologia.domian.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.phamtecnologia.domian.entities.Produto;
import br.com.phamtecnologia.domian.interfaces.ProdutoService;
import br.com.phamtecnologia.dtos.ProdutoPostDto;
import br.com.phamtecnologia.repositories.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService{
	
	@Autowired
	ProdutoRepository produtoRepository;

	@Override
	public void create(ProdutoPostDto dto) throws Exception {
		
		Produto produto = new Produto();
		produto.setId(UUID.randomUUID());
		produto.setNome(dto.getNome());
		produto.setDescricao(dto.getDescricao());
		produto.setPreco(dto.getPreco());
		produto.setQuantidade(dto.getQuantidade());
		
		produtoRepository.save(produto);
			
	}

	@Override
	public void update(Produto produto) throws Exception {
		produtoRepository.save(produto);
		
	}

	@Override
	public void delete(UUID id) throws Exception {
		Produto produto = findById(id);
		produtoRepository.delete(produto);
		
	}

	@Override
	public List<Produto> findAll() throws Exception {
		return (List<Produto>) produtoRepository.findAll();
	}

	@Override
	public Produto findById(UUID id) throws Exception {
		return produtoRepository.findById(id).get();
	}

}

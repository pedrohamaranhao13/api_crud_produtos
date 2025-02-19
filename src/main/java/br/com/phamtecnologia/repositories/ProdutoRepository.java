package br.com.phamtecnologia.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.phamtecnologia.domian.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, UUID>{

}

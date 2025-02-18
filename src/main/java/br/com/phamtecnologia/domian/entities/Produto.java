package br.com.phamtecnologia.domian.entities;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.Data;

@Data
public class Produto {

	private UUID id;
	private String nome;
	private Integer quantidade;
	private BigDecimal preco;
	private String descricao;
}

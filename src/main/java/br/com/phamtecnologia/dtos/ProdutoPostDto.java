package br.com.phamtecnologia.dtos;

import java.math.BigDecimal;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ProdutoPostDto {

	@Size(min = 8, max = 100, message = "Nome do produto deve ter de 8 a 100 caracteres.")
	@NotBlank(message = "informe o nome do produto.")
	private String nome;
	
	@Size(min = 10, max = 500, message = "Descriçao deve ter de 10 a 500 caracteres.")
	@NotBlank(message = "informe a descrição do produto.")
	private String descricao;
	
	@Min(value = 1, message = "Quantidade deve ser igual ou maior que 1.")
	private BigDecimal preco;
	
	@Min(value = 1, message = "Quantidade deve ser igual ou maior que 1.")
	private Integer quantidade;
}

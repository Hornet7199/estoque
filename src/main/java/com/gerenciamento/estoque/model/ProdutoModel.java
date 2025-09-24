package com.gerenciamento.estoque.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProdutoModel {
    private Integer cdProduto;
    private String nmProduto;
    private String dsProduto;
    private String flAtivo;
}

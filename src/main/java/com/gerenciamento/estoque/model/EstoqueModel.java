package com.gerenciamento.estoque.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EstoqueModel {
    private Integer cdEstoque;
    private Integer cdLocalEstoque;
    private Integer qtEstoque;
    private String flAtivo;
}

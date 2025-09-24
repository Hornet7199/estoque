package com.gerenciamento.estoque.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record EmpresaDto(
        @NotBlank(message = "Não é possivel salvar empresa sem razão social")
        String nmRazao,
        String nmFantasia,
        @NotBlank(message = "Não é possivel salvar empresa sem CNPJ")
        String nuCnpj,
        String nuTelefone,
        @NotBlank(message = "Não é possivel salvar empresa sem Endereço")
        String dsEndereco,
        String nuEndereco,
        @Pattern(regexp = "^S|N$", message = "Só é possível salvar status de empresa com S ou N")
        String flAtivo
) {}

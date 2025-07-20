package com.araujo.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

@Data
@Setter
public class UsuarioResponseDTO {
    private String nome;
    private String cpf;
    private String telefone;
}

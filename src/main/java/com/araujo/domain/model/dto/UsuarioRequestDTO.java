package com.araujo.domain.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsuarioRequestDTO {

        private String nome;
        private String cpf;
        private String telefone;

}

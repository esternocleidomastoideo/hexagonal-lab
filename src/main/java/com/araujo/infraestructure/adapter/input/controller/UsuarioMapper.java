package com.araujo.infraestructure.adapter.input.controller;

import com.araujo.domain.model.Usuario;
import com.araujo.domain.model.UsuarioResponseDTO;
import com.araujo.domain.model.dto.UsuarioRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    public Usuario toDomain(UsuarioRequestDTO dto){
        return new Usuario(dto.getNome(), dto.getCpf(), dto.getTelefone());
    }

    public UsuarioResponseDTO toResponseDTO(Usuario usuario){

        UsuarioResponseDTO dto = new UsuarioResponseDTO();
        dto.setNome(usuario.getNome());
        dto.setCpf(usuario.getCpf());
        dto.setTelefone(usuario.getTelefone());
        return dto;


    }

}

package com.araujo.infraestructure.adapter.input.controller;


import com.araujo.domain.model.Usuario;
import com.araujo.domain.model.UsuarioResponseDTO;
import com.araujo.domain.model.dto.UsuarioRequestDTO;
import com.araujo.domain.ports.input.UsuarioUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioUseCase usuarioUseCase;
    private final UsuarioMapper mapper;

    public UsuarioController(UsuarioUseCase usuarioUseCase, UsuarioMapper mapper) {
        this.usuarioUseCase = usuarioUseCase;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> cadastrar(@RequestBody UsuarioRequestDTO usuarioRequestDTO) {
        Usuario usuario = mapper.toDomain(usuarioRequestDTO);
        Usuario usuarioSaved = usuarioUseCase.cadastrarUsuario(usuario);
        return ResponseEntity.ok(mapper.toResponseDTO(usuarioSaved));
    }

    @GetMapping("/oi")
    public String hello(){
        return "oi";
    }
}

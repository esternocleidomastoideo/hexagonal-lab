package com.araujo.application.service;

import com.araujo.domain.model.Usuario;
import com.araujo.domain.ports.input.UsuarioUseCase;
import com.araujo.domain.ports.output.UsuarioRepositoryPort;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService implements UsuarioUseCase {

    private final UsuarioRepositoryPort usuarioRepository;

    public UsuarioService(UsuarioRepositoryPort usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        usuarioRepository.salvar(usuario);
        return usuario;
    }
}

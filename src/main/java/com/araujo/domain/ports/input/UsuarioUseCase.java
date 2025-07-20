package com.araujo.domain.ports.input;

import com.araujo.domain.model.Usuario;

public interface UsuarioUseCase {
    Usuario cadastrarUsuario(Usuario usuario);
}

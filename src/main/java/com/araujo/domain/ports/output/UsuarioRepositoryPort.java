package com.araujo.domain.ports.output;

import com.araujo.domain.model.Usuario;

public interface UsuarioRepositoryPort {
    void salvar(Usuario usuario);
}

package com.araujo.infraestructure.adapter.output.repository;

import com.araujo.domain.model.Usuario;
import com.araujo.domain.ports.output.UsuarioRepositoryPort;
import org.springframework.stereotype.Component;

@Component
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

    private final JpaUsuarioRepository repository;

    public UsuarioRepositoryAdapter(JpaUsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public void salvar(Usuario usuario) {

        UsuarioEntity entity = new UsuarioEntity();
        entity.setNome(usuario.getNome());
        entity.setCpf(usuario.getCpf());
        entity.setTelefone(usuario.getTelefone());
        repository.save(entity);

    }
}

package br.springboot.auth;

import br.springboot.auth.common.datatype.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listAll() {
        return StreamSupport
                .stream(usuarioRepository.findAll().spliterator(), false)
                .collect(Collectors.toList())
                .stream().map(UsuarioModel::to)
                .collect(Collectors.toList());
    }

    public Usuario findBy(String id) {
        return usuarioRepository
                .findById(id)
                .map(UsuarioModel::to)
                .orElse(null);
    }

}

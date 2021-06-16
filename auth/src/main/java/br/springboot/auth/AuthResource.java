package br.springboot.cambio;

import br.springboot.auth.UsuarioService;
import br.springboot.auth.common.controller.AuthController;
import br.springboot.auth.common.datatype.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

@RestController
public class AuthResource implements AuthController {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public Usuario usuario(String idUsuario) {
        return usuarioService.findBy(idUsuario);
    }

}

package br.springboot.auth.common.controller;

import br.springboot.auth.common.datatype.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("auth-service")
public interface AuthController {

    @GetMapping("/usuario/{idUsuario}")
    Usuario usuario(@PathVariable String idUsuario);

}

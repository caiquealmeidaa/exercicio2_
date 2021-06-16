package br.springboot.auth;

import br.springboot.auth.common.datatype.Usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @Column(name = "id_usuario")
    private String idUsuario;

    @Column(name = "tx_nome")
    private String txNome;

    public UsuarioModel() {

    }

    public UsuarioModel(Usuario u) {
        this.idUsuario = u.getId();
        this.txNome = u.getNome();
    }

    public Usuario to() {
        Usuario u = new Usuario();
        u.setId(idUsuario);
        u.setNome(txNome);
        return u;
    }

}

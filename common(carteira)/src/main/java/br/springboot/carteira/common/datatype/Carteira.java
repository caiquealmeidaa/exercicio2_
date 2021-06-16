package br.springboot.carteira.common.datatype;

import br.springboot.auth.common.datatype.Usuario;

import java.math.BigDecimal;
import java.util.List;

public class Carteira {

    private String id;
    private Usuario usuario;
    private BigDecimal saldo;
    private List<TransacaoCambio> transacoesCambio;

    public String getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public List<TransacaoCambio> getTransacoesCambio() {
        return transacoesCambio;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void setTransacoesCambio(List<TransacaoCambio> transacoesCambio) {
        this.transacoesCambio = transacoesCambio;
    }

}

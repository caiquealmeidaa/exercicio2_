package br.springboot.auth.common.datatype;

public class Usuario {

    private String id;
    private String nome;

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

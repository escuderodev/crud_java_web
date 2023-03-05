package br.com.escuderodev.kfeitarriafit.crud_kafeitariafit.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcliente")
    private Integer idcliente;
    @Column(name = "nome", length = 150, nullable = true)
    private String nome;
    @Column(name = "telefone", length = 20, nullable = true)
    private String telefone;
    @Column(name = "endereco", length = 200, nullable = true)
    private String endereco;
    @Column(name = "restricao", length = 100, nullable = true)
    private String restricao;

//    getters and setters
    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRestricao() {
        return restricao;
    }

    public void setRestricao(String restricao) {
        this.restricao = restricao;
    }
}

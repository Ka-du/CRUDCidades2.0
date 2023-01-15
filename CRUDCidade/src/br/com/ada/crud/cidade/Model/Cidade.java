package br.com.ada.crud.cidade.Model;

import java.time.LocalDate;
import java.util.UUID;

public class Cidade {

    private UUID id;

    private String nome;

    private String estado;

    private LocalDate dataDeFundacao;

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeFundacao() {
        return dataDeFundacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setDataFundacao(LocalDate dataFundacao) {
        this.dataDeFundacao = dataFundacao;
    }
}
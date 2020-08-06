package com.giovicente.chancela.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Chancela {

    private String valor;

    public Chancela() { }

    @JsonProperty("chancela_comprovante")
    public String getValor() { return valor; }

    public void setValor(String valor) { this.valor = valor; }
}

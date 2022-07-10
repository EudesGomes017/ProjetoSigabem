package com.siga.apirest.models;

import javax.persistence.Entity;

@Entity
public class Destino {

    private String cep;
    private String bairro;
    private String uf;
    private Integer ddd;

    public Destino(String cep, String bairro, String uf, Integer ddd) {
        this.cep = cep;
        this.bairro = bairro;
        this.uf = uf;
        this.ddd = ddd;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }
}

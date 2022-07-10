package com.siga.apirest.models.dto;

import java.util.Date;

public class DestinoDTO {
    private Double vlTotalFrete;
    private Date dataPrevistaEntrega;
    private String cepOrigem;
    private String cepDestino;

    public DestinoDTO(Double vlTotalFrete, Date dataPrevistaEntrega, String cepOrigem, String cepDestino) {
        this.vlTotalFrete = vlTotalFrete;
        this.dataPrevistaEntrega = dataPrevistaEntrega;
        this.cepOrigem = cepOrigem;
        this.cepDestino = cepDestino;
    }

    public Double getVlTotalFrete() {
        return vlTotalFrete;
    }

    public void setVlTotalFrete(Double vlTotalFrete) {
        this.vlTotalFrete = vlTotalFrete;
    }

    public Date getDataPrevistaEntrega() {
        return dataPrevistaEntrega;
    }

    public void setDataPrevistaEntrega(Date dataPrevistaEntrega) {
        this.dataPrevistaEntrega = dataPrevistaEntrega;
    }

    public String getCepOrigem() {
        return cepOrigem;
    }

    public void setCepOrigem(String cepOrigem) {
        this.cepOrigem = cepOrigem;
    }

    public String getCepDestino() {
        return cepDestino;
    }

    public void setCepDestino(String cepDestino) {
        this.cepDestino = cepDestino;
    }
}

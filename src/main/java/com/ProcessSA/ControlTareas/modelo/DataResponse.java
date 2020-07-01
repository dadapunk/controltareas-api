package com.ProcessSA.ControlTareas.modelo;

import lombok.Data;

import java.util.List;

public class DataResponse {
    private String glosa;
    private Integer codigo;
    private List<Data> data;


    public String getGlosa() {
        return glosa;
    }

    public void setGlosa(String glosa) {
        this.glosa = glosa;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}

package br.com.meli.springbootworkshop.dto;

public class CarroDto {

    private Long id;

    private String modelo;

    private String cor;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

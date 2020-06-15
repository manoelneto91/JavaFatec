package com.manoel;

import enums.OrderStatus;

//CLASEE ROUPA - HERANÇA DA CLASSE PRODUTO
public class Roupa extends Produto{
    private String tamanho;
    private String cor;
    private String tipo;

    //CONSTRUTOR
    public Roupa(String name, Double price, OrderStatus status, String tamanho, String cor, String tipo){
        //BUSCANDO NOME, PREÇO E STATUS NA CLASSE ORIGEM PRODUTO
        super(name, price, status);
        this.tamanho = tamanho;
        this.cor = cor;
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

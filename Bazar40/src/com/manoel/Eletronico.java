package com.manoel;

import enums.OrderStatus;

//CLASSE ELETRONICO - HERANÇA DA CLASSE PRODUTO
public class Eletronico extends Produto {
    private String tensao;
    private String corrente;

    //CONSTRUTOR
    public Eletronico(String name, Double price, OrderStatus status, String tensao, String corrente){
        super (name, price, status);
        this.tensao = tensao;
        this.corrente = corrente;

    }

    //ENCAPSULAMENTO
    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String getCorrente() {
        return corrente;
    }

    public void setCorrente(String corrente) {
        this.corrente = corrente;
    }
}

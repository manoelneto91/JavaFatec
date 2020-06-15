package com.manoel;

import enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {
    //DEFININDO A DATA
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    //VARIAVEL PARA ARMAZENAR A DATA
    private Date moment;

    //INSTANCIANDO A CLASSE CLIENTE
    private Cliente cliente;
    //CRIANDO O ARRAYLIST
    private List<CompraItem> items = new ArrayList<>();

    //CONSTRUTOR
    public Compra(Date moment, Cliente cliente) {
        this.moment = moment;
        this.cliente = cliente;
    }

    //ENCAPSULAMENTO

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Cliente getClient() {
        return cliente;
    }

    public void setClient(Cliente client) {
        this.cliente = client;
    }

    public List<CompraItem> getItems() {
        return items;
    }

    //ADICIONANDO ITENS NO ARRAYLIST
    public void addItem(CompraItem item) {
        items.add(item);
    }

    public void removeItem(CompraItem item) {
        items.remove(item);
    }

    //ACUMULADOR DO TOTAL
    public double total() {
        double sum = 0.0;
        for (CompraItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    //RETORNANDO OS DADOS DA COMPRA DO ARRAYLIST
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data da compra: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + " \n");
        sb.append("Itens da compra:\n");
        for (CompraItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Preço total: R$");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}

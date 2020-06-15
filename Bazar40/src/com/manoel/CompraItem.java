package com.manoel;

public class CompraItem {
    private Integer quantity;
    private Double price;

    //CHAMANDO PRODUTO
    private Produto produto;

    //CONSTRUTOR
    public CompraItem(Integer quantity, Double price, Produto produto) {
        this.quantity = quantity;
        this.price = price;
        this.produto = produto;
    }

    //ENCAPSULAMENTO
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Produto getProduct() {
        return produto;
    }

    public void setProduct(Produto product) {
        this.produto = product;
    }

    //CALCULANDO O SUBTOTAL
    public double subTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return produto.getName()
                + ", R$"
                + String.format("%.2f", price)
                + ", Quantidade: "
                + quantity +
                ", Condicoes: "
                + produto.getStatus() +
                ", Subtotal: R$"
                + String.format("%.2f", subTotal());
    }
}

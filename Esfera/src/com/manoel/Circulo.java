package com.manoel;

public class Circulo {
    //VARIAVEL
    private double raio;

    //CONSTRUTOR
    public Circulo(double raio) {
        this.raio = raio;
    }

    //METODO CALCULAR
    public double calcular (){
        return ((4*Math.PI)*Math.pow(raio,3)/3);
    }
}

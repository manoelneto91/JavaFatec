package com.manoel;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        //INSTACIANDO O SC
        Scanner sc = new Scanner(System.in);

        //ENTRADA DE VALORES
        System.out.println("Digite o valor do Raio: ");
        double raio = sc.nextDouble();

        //INSTANCIANDO O CIRCULO1
        Circulo circulo1 = new Circulo(raio);

        //SAIDA
        System.out.printf("Valor do volume da esfera: %.2f ", circulo1.calcular());

    }
}

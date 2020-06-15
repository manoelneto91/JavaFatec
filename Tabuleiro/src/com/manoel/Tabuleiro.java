package com.manoel;

import java.util.Random;

public class Tabuleiro {
    //DECLARAÇÃO DAS VARIAVEIS
    private int[][] matriz = new int [10] [10];
    private int n1;
    private int n2;
    private int acu1 = 0;
    private int acu2 = 0;
    private int nroSorteado = 0;

    //CONSTRUTOR COM 2 PARAMETROS
    public Tabuleiro (int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    //ENCAPSULAMENTO APENAS GET
    public int getAcu1() {
        return acu1;
    }

    public int getAcu2() {
        return acu2;
    }

    public int getNroSorteado() {
        return nroSorteado;
    }

    //METODO SORTEAR
    public void Sortear(){
        //ALIMENTANDO A TABELA COM NUMEROS RANDOMICOS
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                Random random = new Random();
                matriz[i][j] = random.nextInt(101);
            }

        }

    }

    //METODO PREMIAR
    public void Premiar() {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == n1) {
                    acu1 = getAcu1() + 1;
                    nroSorteado = matriz[i][j];
                }
                else if (matriz[i][j] == n2) {
                    acu2 = getAcu2() + 1;
                    nroSorteado = matriz[i][j];
                }
            }

        }

    }

}

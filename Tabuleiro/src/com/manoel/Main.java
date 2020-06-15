package com.manoel;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        //INSTANCIANDO O OBJETO SC
        Scanner sc = new Scanner(System.in);
        String op;

            //SOLICITANDO A ENTRADA DOS DADOS
        do {
            System.out.println("Digite o 1º numero: ");
            int n1 = sc.nextInt();
            System.out.println("Digite o 2º numero");
            int n2 = sc.nextInt();
            sc.nextLine();

            //INSTACIANDO O OBJETO TABULEIRO1
            Tabuleiro tabuleiro1 = new Tabuleiro(n1, n2);

            //CHAMANDO O METODO SORTEAR
            tabuleiro1.Sortear();

            //CHAMANDO O METODO SORTEAR
            tabuleiro1.Premiar();

            //CONDIÇOES PARA PREMIAÇÃO
            if (tabuleiro1.getAcu1()>3){
                //SAIDAS
                System.out.println();
                System.out.print("*******************************\n");
                System.out.print("Parabéns!!! Você Ganhou!!!\n");
                System.out.print("Total de acertos: " + tabuleiro1.getAcu1() + "\n");
                System.out.print("Total do premio: " + tabuleiro1.getAcu1() * 1000 + "\n");
                System.out.print("Numero premiado: " + tabuleiro1.getNroSorteado() + "\n");
                System.out.print("*******************************\n");

            }
            else if (tabuleiro1.getAcu2() >3){
                //SAIDAS
                System.out.println();
                System.out.print("*******************************\n");
                System.out.print("Parabéns!!! Você Ganhou!!!\n");
                System.out.print("Total de acertos: " + tabuleiro1.getAcu2() + "\n");
                System.out.print("Total do premio: " + tabuleiro1.getAcu2() * 1000 + "\n");
                System.out.println("Numero sorteado: " + tabuleiro1.getNroSorteado()+ "\n");
                System.out.print("*******************************\n");
            }
            else{
                //NÃO PREMIADO
                System.out.println("Infelizmente você não ganhou... Tente novamente!!!");
            }

            System.out.print("Deseja continuar? (Digite s para continuar)");
            op = sc.nextLine();
        }while (op.equalsIgnoreCase("s"));


        sc.close();
    }
}

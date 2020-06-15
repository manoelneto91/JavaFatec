package com.manoel;

import enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Main {

        public static void main(String[] args) throws ParseException {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            String asw;
            int quantity;

            //ENTRADA DE DADOS DO CLIENTE
            System.out.println("Entre com os dados do Cliente:");
            System.out.print("ID: ");
            int idCliente = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Digite seu CPF: ");
            String cpf = sc.next();

            //INSTACIANDO A CLASSE CLIENTE
            Cliente cliente = new Cliente(idCliente, name, email, cpf);

            System.out.println("Entre com os dados da Compra:");

            //INSTACIANDO A CLASSE COMPRA
            Compra compra = new Compra(new Date(), cliente);

            do {
                System.out.println("*--------------------*");
                System.out.println("|   1 - Eletronicos  |");
                System.out.println("|     2 - Roupas     |");
                System.out.println("*--------------------*");
                System.out.print("Selecione a categoria do Item que deseja comprar: ");
                int op = sc.nextInt();
                System.out.println("Entre com os dados do item:");
                System.out.print("Nome do Produto: ");
                sc.nextLine();
                String productName = sc.nextLine();
                System.out.print("Preço do Produto: ");
                double productPrice = sc.nextDouble();
                System.out.print("Condicoes: ");
                OrderStatus productStatus = OrderStatus.valueOf(sc.next());

                //DIRECIONAMENTO PARA O PRODUTO
                switch (op){
                    //PRODUTOS ELETRONICOS
                    case 1:
                        System.out.print("Digite a tensão do Equipamento: ");
                        String productTensao = sc.next();
                        System.out.print("Digite a corrente do Equipamento: ");
                        String productCorrente = sc.next();

                        //INSTANCIANDO A CLASSE ELETRONICO
                        Eletronico eletronico = new Eletronico(productName, productPrice, productStatus, productTensao, productCorrente);

                        System.out.print("Quantidade: ");
                        quantity = sc.nextInt();

                        //INSTANCIANDO A CLASSE COMPRA ITEM
                        CompraItem compraItem = new CompraItem(quantity, productPrice, eletronico);
                        //ADICIONDO ITEM
                        compra.addItem(compraItem);
                        break;
                    case 2:
                        //ROUPAS
                        System.out.print("Digite o tamanho: ");
                        String productTamanho = sc.next();
                        System.out.print("Digite a cor: ");
                        String productCor = sc.next();
                        System.out.print("Digite o tipo: ");
                        String productTipo = sc.next();

                        //INSTANCIANDO A CLASSE ROUPAS
                        Roupa roupa = new Roupa(productName, productPrice, productStatus, productTamanho, productCor, productTipo);
                        System.out.print("Quantidade: ");
                        quantity = sc.nextInt();

                        //INSTANCIANDO A CLASSE COMPRA ITEM
                        CompraItem compraItem1 = new CompraItem(quantity, productPrice, roupa);
                        //ADICIONANDO ITENS
                        compra.addItem(compraItem1);
                        break;
                    default:
                        System.out.println("Opcao Invalida!!!");
                        break;
                }

                System.out.print("Novo Item S/N? ");
                asw = sc.next();
            }while (!asw.equalsIgnoreCase("n"));

            //GERA RELATORIO DE COMPRA
            System.out.println();
            System.out.println("Relatorio da compra: ");
            System.out.println(compra);

            sc.close();
        }
    }


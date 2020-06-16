package com.manoel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class GerenciarControlePonto {

    public static void main(String[] args) {
    	//DADOS DO GERENTE
		Gerente gerente = new Gerente();
		gerente.setIdFunc(0001);
		gerente.setNome("José gerente");
		gerente.setLogin("jose.gerente");
		gerente.setSenha("gerente@123");
		gerente.setDocumento("456.963.988-88");
		gerente.setEmail("gerente@poo.com");

		//DADOS DA SECRETARIA
		Secretaria secretaria = new Secretaria();
		secretaria.setIdFunc(0002);
		secretaria.setNome("Maria Secretaria");
		secretaria.setRamal("1020");
		secretaria.setTelefone("3633-4588");
		secretaria.setDocumento("856.967.888-55");
		secretaria.setEmail("secretaria@poo.com");

		//DADOS DO OPERADOR
		Operador operador = new Operador();
		operador.setIdFunc(0003);
		operador.setNome("João Operador");
		operador.setValorHora(10.50);
		operador.setDocumento("152.635.985-75");
		operador.setEmail("operador@poo.com");

		//OBJETOS DO REGISTRO PONTO
		RegistroPonto registroGerente = new RegistroPonto();
		RegistroPonto registroSecretaria = new RegistroPonto();
		RegistroPonto registroOperador = new RegistroPonto();

		//TEMPO DE 1 SEGUNDO
		try {
			Thread.sleep (1000);
		}
		catch (InterruptedException ex) {

		}

		//DADOS REGISTRO PONTO GERENTE
		registroGerente.setIdRegPonto(001);
		registroGerente.setFunc(gerente);
		registroGerente.setDataRegistro(LocalDate.now());
		registroGerente.setHoraEntrada(LocalDateTime.now());
		registroGerente.apresentarRegistoPonto();

		try {
			Thread.sleep (1000);
		}
		catch (InterruptedException ex) {

		}

		//DADOS REGISTRO PONTO OPERADOR
		registroOperador.setIdRegPonto(002);
		registroOperador.setFunc(operador);
		registroOperador.setDataRegistro(LocalDate.now());
		registroOperador.setHoraEntrada(LocalDateTime.now());
		registroOperador.apresentarRegistoPonto();

		try {
			Thread.sleep (1000);
		}
		catch (InterruptedException ex) {

		}

		//DADOS REGISTRO PONTO SECRETARIA
		registroSecretaria.setIdRegPonto(003);
		registroSecretaria.setFunc(secretaria);
		registroSecretaria.setDataRegistro(LocalDate.now());
		registroSecretaria.setHoraEntrada(LocalDateTime.now());
		registroSecretaria.apresentarRegistoPonto();

		try {
			Thread.sleep (1000);
		}
		catch (InterruptedException ex) {

		}

		//SAIDA GERENTE
		registroGerente.setHoraSaida(LocalDateTime.now());
		registroGerente.apresentarRegistoPonto();

		try {
			Thread.sleep (1000);
		}
		catch (InterruptedException ex) {

		}

		//SAIDA OPERADOR
		registroOperador.setHoraSaida(LocalDateTime.now());
		registroOperador.apresentarRegistoPonto();

		try {
			Thread.sleep (1000);
		}
		catch (InterruptedException ex) {

		}

		//SAIDA SECRETARIA
		registroSecretaria.setHoraSaida(LocalDateTime.now());
		registroSecretaria.apresentarRegistoPonto();

    }
}

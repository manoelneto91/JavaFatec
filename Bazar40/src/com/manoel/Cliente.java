package com.manoel;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private  int idCliente;
    private String name;
    private String email;
    private String cpf;

    //CONSTRUTOR
    public Cliente(int idCliente, String name, String email, String cpf) {
        this.idCliente = idCliente;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
    }

    public int getIdCliente(){return idCliente;}
    public void setIdCliente(int idCliente){ this.idCliente = idCliente;}

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //RETORNO DOS DADOS DO CLIENTE
    @Override
    public String toString() {
        return idCliente + ", " + name + ", " + email+ ", " + cpf + "\n";
    }
}

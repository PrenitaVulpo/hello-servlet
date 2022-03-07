package com.example.helloservlet.model;


public class ContaModel {
    private Double saldo;
    private ClienteModel cliente;

    public ContaModel(Double saldo, ClienteModel cliente){
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }
}

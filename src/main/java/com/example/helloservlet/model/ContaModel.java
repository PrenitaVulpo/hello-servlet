package com.example.helloservlet.model;

import com.example.helloservlet.Cliente;

public class ContaModel {
    private Double saldo;
    private Cliente cliente;

    public ContaModel(Double saldo, Cliente cliente){
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }
}

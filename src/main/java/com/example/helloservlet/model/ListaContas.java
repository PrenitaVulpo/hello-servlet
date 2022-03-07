package com.example.helloservlet.model;

import java.util.List;

public class ListaContas {
    private static List<ContaModel> contas;

    public void adicionar (ContaModel contaModel){
        ListaContas.contas.add(contaModel);
    }

    public List<ContaModel> buscaContas(){
        return ListaContas.contas;
    }
}

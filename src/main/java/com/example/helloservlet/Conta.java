package com.example.helloservlet;

import com.example.helloservlet.model.ClienteModel;
import com.example.helloservlet.model.ContaModel;
import com.example.helloservlet.model.ListaClientes;
import com.example.helloservlet.model.ListaContas;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;


@WebServlet(name = "Conta", value="/conta")
public class Conta extends HttpServlet {
    ListaContas listaContas = new ListaContas();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeCliente = request.getParameter("cliente");
        Double valor = Double.valueOf(request.getParameter("valor"));
        ListaClientes listaClientes = (ListaClientes) request.getAttribute("clientes");

        if (1 == (listaClientes.buscaClientes().indexOf(nomeCliente))){
            ClienteModel[] clientes = (ClienteModel[]) listaClientes.buscaClientes().toArray();
            listaContas.adicionar(new ContaModel(valor, clientes[listaClientes.buscaClientes().indexOf(nomeCliente)]));
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ContaModel> contas = listaContas.buscaContas();

        request.setAttribute("contas", contas);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("listaClientes.jsp");

        requestDispatcher.forward(request, response);
    }
}

package com.example.helloservlet;

import com.example.helloservlet.model.ClienteModel;
import com.example.helloservlet.model.ListaClientes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "Cliente", value = "/cliente")
public class Cliente extends HttpServlet {
    ListaClientes listaClientes = new ListaClientes();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeCliente = request.getParameter("nomeCliente");

        listaClientes.adicionar(new ClienteModel(nomeCliente));

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + nomeCliente + " cadastrado com sucesso" + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        ListaClientes listaClientes = new ListaClientes();
        List<ClienteModel> clientes = listaClientes.buscaClientes();

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<ul>");
        for (ClienteModel clienteModel: clientes){
            out.println("<li>"+clienteModel.getNome()+"</li>");
        }
        out.println("</ul>");
        out.println("</body></html>");
    }
}

package com.example.helloservlet;

import com.example.helloservlet.model.ClienteModel;
import com.example.helloservlet.model.ListaClientes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Cliente", value = "/cliente")
public class Cliente extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeCliente = request.getParameter("nomeCliente");

        ListaClientes listaClientes = new ListaClientes();
        listaClientes.adicionar(new ClienteModel(nomeCliente));

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + nomeCliente + " cadastrado com sucesso" + "</h1>");
        out.println("</body></html>");
    }

}

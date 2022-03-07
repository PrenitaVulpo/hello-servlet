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

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("clienteCadastrado.jsp");
        requestDispatcher.forward(request, response);

        RequestDispatcher dispatchToConta = request.getRequestDispatcher("Conta");
        request.setAttribute("clientes", listaClientes);
        dispatchToConta.forward(request, response);

        RequestDispatcher dispatchToFormContas = request.getRequestDispatcher("formConta.jsp");
        request.setAttribute("clientes", listaClientes);
        dispatchToFormContas.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ClienteModel> clientes = this.listaClientes.buscaClientes();

        request.setAttribute("clientes", clientes);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("listaClientes.jsp");

        requestDispatcher.forward(request, response);

//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<ul>");
//        for (ClienteModel clienteModel: clientes){
//            out.println("<li>"+clienteModel.getNome()+"</li>");
//        }
//        out.println("</ul>");
//        out.println("</body></html>");
    }
}

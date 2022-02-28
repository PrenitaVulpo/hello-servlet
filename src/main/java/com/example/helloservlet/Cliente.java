package com.example.helloservlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Cliente", value = "/cliente")
public class Cliente extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeCliente = request.getParameter("nomeCliente");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + nomeCliente + " cadastrado com sucesso" + "</h1>");
        out.println("</body></html>");
    }

}

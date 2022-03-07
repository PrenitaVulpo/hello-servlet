<%@ page import="com.example.helloservlet.model.ContaModel" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: pingu
  Date: 07/03/2022
  Time: 05:42
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Contas</title>
</head>
<body>
    Lista de contas:
    <ul>
        <%
            List<ContaModel> contas = (List<ContaModel>) request.getAttribute("contas");
            for (ContaModel conta: contas){
        %>
        <li>Cliente: <% conta.getCliente().getNome(); %>, Saldo: <% conta.getSaldo(); %></li>

        <% } %>
    </ul>
</body>
</html>

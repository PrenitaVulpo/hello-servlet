<%@ page import="com.example.helloservlet.model.ClienteModel" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: pingu
  Date: 07/03/2022
  Time: 05:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <form action="/hello/conta" method="post">
        Nome: <input type="text" placeholder="Cliente" name="nomeCliente">
        <label for="cliente">Nome: </label>
        <select name="cliente" id="cliente">
            <%
                List<ClienteModel> clientes = (List<ClienteModel>) request.getAttribute("clientes");
                for( ClienteModel cliente : clientes){
            %>
                <option value=<%cliente.getNome();%>><%cliente.getNome();%></option>
            <% } %>
        </select><br>
        Saldo: <input type="number" placeholder="0000" name="saldo"><br>
        <input type="submit">
    </form>
</head>
<body>

</body>
</html>

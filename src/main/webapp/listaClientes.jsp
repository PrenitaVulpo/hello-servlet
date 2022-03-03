<%@ page import="com.example.helloservlet.model.ClienteModel" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <ul>
        <%
            List<ClienteModel> clientes = (List<ClienteModel>) request.getAttribute("clientes");
            ClienteModel[] arr = (ClienteModel[]) clientes.toArray();
            for(ClienteModel clienteModel: arr){
        %>
            <li><%= clienteModel.getNome()%></li>
        <% } %>
    </ul>
</body>
</html>

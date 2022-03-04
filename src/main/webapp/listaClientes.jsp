<%@ page import="com.example.helloservlet.model.ClienteModel" %>
<%@ page import="java.util.List" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <ul>
        <%
            List<ClienteModel> clientes = (List<ClienteModel>) request.getAttribute("clientes");
            for(ClienteModel clienteModel: clientes){
        %>
            <li><%= clienteModel.getNome()%></li>
        <% } %>
    </ul>
</body>
</html>

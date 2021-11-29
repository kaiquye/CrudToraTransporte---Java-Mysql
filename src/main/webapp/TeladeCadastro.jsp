<%@ page import="DAO.ConnectionMysql" %><%--
  Created by IntelliJ IDEA.
  User: kaique
  Date: 24/11/2021
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro</title>
</head>
<body>
    <header>
        <h1>CADASTRO</h1>
    </header>
<script src="Js/TelaCadastroJS.js"></script>
<main>
    <div>
        <form name="formCadastro" action="ServletCadastro" method="get">
        <table>



            <tr>
                <th>Nome</th>
                <th>Segundo nome</th>
            </tr>
            <tr>
                <th><input type="text" id="nomeCadastro" name="nome" placeholder="nome"></th>
                <th><label id="erroNome" style="color: red" ></label></th>
                <th><input type="text" id="senhaCadatro" name="senha"  placeholder="senha"></th>
                <th><label id="erroSenha" style="color: red" ></label></th>

            </tr>
            <tr>
                <th>CPF</th>
                <th>Telefone</th>
            </tr>
            <tr>
                <th><input type="text" id="cpfCadastro" name="cpf" placeholder="CPF"></th>
                <th><label id="erroCPF" style="color: red" ></label></th>
                <th><input type="text" id="telefoneCadastro"  name="telefone" placeholder="Telefone"></th>
                <th><label id="erroTelefone" style="color: red" ></label></th>
            </tr>
        </table>


        <button type="submit" id="btnCadastro" onclick=" return validaForm()"> CADASTRAR </button>
        </form>

        </div>


</main>


</body>
</html>

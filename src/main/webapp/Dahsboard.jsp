<%--
  Created by IntelliJ IDEA.
  User: kaique
  Date: 21/11/2021
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dahsboard</title>
    <link rel="">
</head>

<body>
        <h1>Dahsboard</h1>
        <article>
            <div>
                <form action="CadastarCaminhao"  method="post">
                    <table>
                        <tr>
                            <th>Modelo</th>
                            <th>Chassi</th>
                            <th>Placa</th>

                        </tr>
                        <tr>
                            <td> <input type="text" name="Modelo" placeholder="Modelo"> </td>
                            <td> <input type="text" name="Chassi" placeholder="Chassi"> </td>
                            <td> <input type="text" name="Placa" placeholder="Modelo"> </td>

                        </tr>
                        <tr>
                            <th>Ano de Fabraicação</th>
                            <th>Cor</th>
                            <th>Eixos</th>
                        </tr>
                        <tr>
                            <td> <input type="text" name="Ano" placeholder="Ano de Fabricação"> </td>
                            <td> <input type="text" name="Cor" placeholder="Cor"> </td>
                            <td> <input type="text" name="Eixos" placeholder="Eixos"> </td>
                        </tr>

                    </table>
                    <br>

                    <button type="submit">CADASTRAR</button>

                </form>


            </div>
        </article>
</body>
</html>

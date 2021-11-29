<%--
  Created by IntelliJ IDEA.
  User: kaique
  Date: 21/11/2021
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Painel de Controler</title>
</head>


<body>

<article>


    <script type="text/javascript">

        function validarCampo() {
            var placa = document.forms["BuscarCaminhao"]["Placa"].value;
            var Chassi = document.forms["BuscarCaminhao"]["Chassi"].value;
            var erro = document.getElementById("erroCaminhoa");

            if (!(placa == null || placa.length <= 3)) {
                alert("placa esta correta");
                if (!(Chassi == null || Chassi.length <= 8)) {
                    alert("chassi esta correto");
                }
            } else if (placa.length < 3) {
                alert("Placa com valor incorreto");
            } else if (Chassi.length < 7) {
                alert("Chassi com valor incorreto, tem que ter no minimo 8 char");
            } else {
                alert("Valor digitado esta incorreto");
            }

        }

    </script>


    <section>

        <div>
            <h1>PAINEL DE CONTROLER</h1>

        </div>
        <div>
            <nav>
                <ul>
                    <li><a href="idDoTextCaminhao"> Buscar por caminhão</a></li>
                    <li><a href="idDoTextMotorista"> Buscar por Motorista </a></li>
                    <li><a href="idDoTextCarga"> Buscar por Carga </a></li>
                    <li><a href="idDoTextRota"> Buscar por Rota </a></li>
                </ul>
            </nav>
        </div>
        <div>
            <form name="BuscarCaminhao" action="buscarCaminhaoServe" method="post">
                <ul>
                    <h1>Buscar por Caminhão : </h1>
                    <label>Placa : </label>
                    <input type="text" name="Placa" placeholder="Placa do Caminhão">
                    <label>Chassi : </label>
                    <input type="text" name="Chassi" placeholder="Chassi do Caminhão">
                    <button type="submit" onclick="return validarCampo();">BUSCAR CARRO</button>
                </ul>

            </form>


        </div>
        <div>
            <form name="BuscarMotorista" action="buscarCargaServe">
                <ul>
                    <h1>Buscar por Motorista : </h1>
                    <label>CPF: </label>
                    <input type="text" name="CPF" placeholder="CFP do motorista">
                    <label>Nome: </label>
                    <input type="text" name="Nome" placeholder="Nome do motorista">
                    <button type="submit">BUSCAR</button>
                </ul>
            </form>


        </div>
        <div>
            <form name="buscarCarga" action="buscarCargaServe">
                <ul>
                    <h1>Buscar por Carga : </h1>
                    <label>CODIGO DA CARGA : </label>
                    <input type="text" name="Codigo" placeholder="Codigo da carga">
                    <label>Empresa: </label>
                    <input type="text" name="Empresa" placeholder="Nome da empresa">
                    <button type="submit">BUSCAR</button>
                </ul>
            </form>


        </div>
        <div>
            <form name="BuscarRota" action="buscarRotaServe">
                <ul>
                    <h1>Buscar por Rota : </h1>
                    <label>Cidade : </label>
                    <input type="text" name="Placa" placeholder="Placa do Caminhão">
                    <label>Caminhao: </label>
                    <input type="text" name="Chassi" placeholder="Chassi do Caminhão">
                    <button type="submit">BUSCAR</button>
                </ul>

            </form>

        </div>

    </section>

</article>


</body>
</html>

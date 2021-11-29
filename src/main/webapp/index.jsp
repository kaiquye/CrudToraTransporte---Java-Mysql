<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>


</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>


<article>

    <div>
        <form name="loginForm" action="Logar" method="post">
            <div>
                <input type="text" id="Login" value="Login">
                <input type="text" id="Passaword" value="Passaword"> <br>
            </div>

            <button type="submit" id="Logar">Logar</button>

        </form>
         <button type="button" id="btnCadastro">Cadastrar</button>
    </div>
<script src="Js/ClassJs.js"></script>
</article>

</body>
</html>
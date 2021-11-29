
const button = document.getElementById("Logar");


button.addEventListener("click", validarLogin);

function validarLogin(){
    let nome = document.forms["loginForm"]["Login"].value;
    let senha = document.forms["loginForm"]["Passaword"].value;

    var nomeL = "admin";
    var senhaL = "admin";


    if(nome == nomeL && senha == senhaL ){
                alert("Acesso liberado");
    }else {
        alert("Acesso negado");
    }
}








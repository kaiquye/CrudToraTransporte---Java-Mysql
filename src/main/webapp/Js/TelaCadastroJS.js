var btnCadastro = document.getElementById("btnCadastro");


function validaForm() {


    var nome_ = document.getElementById("nomeCadastro").value;
    var senha = document.getElementById("senhaCadatro").value;
    var cpf = document.getElementById("cpfCadastro").value;
    var telefone = document.getElementById("cpfCadastro").value;


    var erro1 = document.getElementById("erroNome");
    var erro2 = document.getElementById("erroSenha");
    var erro3 = document.getElementById("erroCPF");
    var erro4 = document.getElementById("erroTelefone");
    // alert(nome_.length);


    if (!(nome_.length <= 4)) {
        erro1.innerHTML = "";
        if (senha.length >= 7) {
            var i = 0;
            var char;


            while (i < senha.length) {
                char = senha.charAt(i);
                if (char == char.toUpperCase()) {
                    erro2.innerHTML = "";
                    if (!(cpf <= 5)) {
                        erro3.innerHTML = "";
                        if (!(telefone <= 5)) {
                            erro4.innerHTML = "";
                            return true;
                        } else {
                            erro4.innerHTML = "Telefone invalido";
                            return  false;
                        }
                    } else {
                        erro3.innerHTML = "CPF invalido";
                        return false;
                    }
                    break;
                }
                i++;
            }
        } else {
            erro2.innerHTML = "*Senha invalida ! "
            return false;
        }
    } else {

        erro1.innerHTML = "*Nome muito curto";
        return false;
    }
}



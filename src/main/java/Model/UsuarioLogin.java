package Model;

public class UsuarioLogin extends Pessoa {


    String senha;
    String email;

    private UsuarioLogin(Builder b) {
        super(b.nome, b.cpf, b.telefone, null);
        this.senha = b.senha;
        this.email = b.email;
    }

    public static class Builder {
        private String nome;
        private String cpf;
        private String telefone;
        private String senha;
        private String email;

        public Builder(String nome, String cpf, String telefone, String senha, String email) {
            this.senha = senha;
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
            this.cpf = cpf;
        }

        public UsuarioLogin builder() {
            return new UsuarioLogin(this);
        }


    }

    public String getSenha() {
        return senha;
    }


    public String getEmail() {
        return email;
    }


}

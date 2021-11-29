package Model;

public abstract class Pessoa {

    private String id;
    private String nome;
    private String cpf;
    private String telefone;
    private Endereco.Builder builderEndereco;



    public Pessoa(String nome, String cpf, String telefone, Endereco.Builder builderEndereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.builderEndereco = builderEndereco;

    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco.Builder getEndereco() {
        return builderEndereco;
    }

    public void setEndereco(Endereco.Builder endereco) {
        this.builderEndereco = endereco;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

package Model;

public class Carga {


    private String id;
    private String nome;
    private String peso;
    private Endereco.Builder builderDestino;
    private Caminhao.Builder builderCaminhao;
    private String id_Caminhao;


    public static class Builder {
        private String id;
        private String nome;
        private String peso;
        private Endereco.Builder builderDestino;
        private Caminhao.Builder builderCaminhao;
        private String id_Caminhao;

        public Builder(String id, String nome, String peso, Endereco.Builder builderDestino) {
            this.id = id;
            this.nome = nome;
            this.peso = peso;
            this.builderDestino = builderDestino;
        }

        public Builder adicionarCaminhaoAcarga(Caminhao.Builder builderCaminhao) {
            this.builderCaminhao = builderCaminhao;
            return this;
        }

        public Builder id_caminhao(String id_caminhao) {
            this.id_Caminhao = id_caminhao;
            return this;
        }

        public Carga carga() {
            return new Carga(this);
        }

    }

    private Carga(Builder b) {
        this.id = b.id;
        this.builderDestino = b.builderDestino;
        this.builderCaminhao = b.builderCaminhao;
        this.peso = b.peso;
        this.nome = b.nome;
        this.id_Caminhao = b.id_Caminhao;

    }

    public String getNome() {
        return nome;
    }


    public String getPeso() {
        return peso;
    }


    public Endereco.Builder getDestino() {
        return builderDestino;
    }


    public String getId() {
        return id;
    }

    public Caminhao.Builder getBuilderCaminhao() {
        return builderCaminhao;
    }

    public String getId_Caminhao() {
        return id_Caminhao;
    }

    public Endereco.Builder getBuilderDestino() {
        return builderDestino;
    }
}

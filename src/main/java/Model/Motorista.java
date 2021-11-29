package Model;

import ModelBuilder.CreateBuilderModel;

public class Motorista extends Pessoa{

     String numeroAbilitacao ;
     String XP;


    public static class BuilderMotorista{
        private  String nome;
        private String cpf;
        private String telefone;
        private String numeroAbilitacao;
        private  String XP;
        private Endereco.Builder builderEndereco;

        public BuilderMotorista(String nome, String cpf, String telefone){
            this.nome = nome;
            this.cpf = cpf;
            this.telefone =telefone;
        }
        public BuilderMotorista numeroAMotorista_Xp (String numeroAbilitacao, String XP){
                this.numeroAbilitacao = numeroAbilitacao;
                this.XP = XP;
            return this;
        }
        public  BuilderMotorista adicionarEnderecoDoMotorista (Endereco.Builder builderEndereco) {
            this.builderEndereco = builderEndereco;
            return this;
        }
        public Motorista motorista(){
            return  new Motorista(this);
        }




    }

    private Motorista (BuilderMotorista motorista){
        super(motorista.nome, motorista.cpf, motorista.telefone, motorista.builderEndereco);
        this.numeroAbilitacao = motorista.numeroAbilitacao;
        this.XP = motorista.XP;
    }


    /*
    public Motorista(String nome, String cpf, String telefone, String numeroAbilitacao, String XP, Endereco endereco) {
        super(nome, cpf, telefone, endereco);
        this.numeroAbilitacao = numeroAbilitacao;
        this.XP = XP;
    }


    public Motorista(String nome, String cpf, String telefone, Endereco endereco) {
        super(nome, cpf, telefone, endereco);

    }
    */
    public String getNumeroAbilitacao() {
        return numeroAbilitacao;
    }

    public void setNumeroAbilitacao(String numeroAbilitacao) {
        this.numeroAbilitacao = numeroAbilitacao;
    }

    public String getXP() {
        return XP;
    }

    public void setXP(String XP) {
        this.XP = XP;
    }
}

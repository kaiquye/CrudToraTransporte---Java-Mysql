package Model;
 public class Endereco {


    private String id;
    private String numero;
    private String rua;
    private String bairro;
    private String cidade;
    private String pais;



    public static class Builder{

        private String id;
        private String numero;
        private String rua;
        private String bairro;
        private String cidade;
        private String pais;

        public Builder(String bairro, String rua, String cidade){
            this.bairro = bairro;
            this.rua = rua;
            this.cidade = cidade;
        }
        public Builder numero(String numero){
            this.numero =numero;
            return this;
        }
        public  Builder pais(String pais){
            this.pais = pais;
            return  this;
        }
        public Endereco endereco (){
            return new Endereco(this);
        }
    }

    private  Endereco(Builder builder){
        this.bairro =  builder.bairro;
        this.rua = builder.rua;
        this.cidade = builder.cidade;
        this.numero = builder.numero;
        this.pais = builder.pais;

    }



     /*
     public Endereco(String numero, String rua, String bairro, String cidade, String pais) {
         this.numero = numero;
         this.rua = rua;
         this.bairro = bairro;
         this.cidade = cidade;
         this.pais = pais;

     }

    */

     public String getNumero() {
        return numero;
    }


    public String getRua() {
        return rua;
    }


    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getPais() {
        return pais;
    }

     public String getId() {
         return id;
     }

 }

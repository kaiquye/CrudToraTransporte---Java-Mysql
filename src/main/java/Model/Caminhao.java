package Model;

public class Caminhao  extends  Veiculo{


    private String cor;
    private String avarias;
    private String eixos;
    private String id_Motorista;



    public static class Builder {
        private String cor;
        private String avarias;
        private String eixos;
        private String id_Motorista;
        private String modelo;
        private String chassi;
        private String placa;
        private String anoFabricacao;


        public Builder (String modelo, String chassi, String placa, String anoFabricacao){
           this.modelo =modelo;
           this.chassi =chassi;
           this.placa =placa;
           this.anoFabricacao = anoFabricacao;
        }
        public Builder cor(String cor){
            this.cor = cor;
            return this;
        }
        public Builder avarias(String avarias){
            this.avarias =avarias;
            return this;
        }
        public Builder eixos(String eixos){
            this.eixos =eixos;
            return this;
        }
        public Builder id_motorista(String id_Motorista){
            this.id_Motorista =id_Motorista;
            return this;
        }
        public Caminhao caminhao(){
            return new Caminhao(this);
        }
    }
    private Caminhao(Builder builder){
        super(builder.modelo, builder.chassi, builder.placa, builder.anoFabricacao);
        this.cor = builder.cor;
        this.eixos = builder.eixos;
        this.avarias = builder.avarias;
        this.id_Motorista =builder.id_Motorista;
    }

    /*

    public Caminhao(String modelo, String chassi, String placa, String anoFabricacao, String cor, String avarias, String eixos) {
        super(modelo, chassi, placa, anoFabricacao);
        this.cor = cor;
        this.avarias = avarias;
        this.eixos = eixos;
    }

    private Caminhao(){}
    */

    public String getCor() {
        return cor;
    }

    public void setCor(String cpr) {
        this.cor = cpr;
    }

    public String getAvarias() {
        return avarias;
    }

    public void setAvarias(String avarias) {
        this.avarias = avarias;
    }

    public String getEixos() {
        return eixos;
    }

    public void setEixos(String eixos) {
        this.eixos = eixos;
    }

    public String getId_Motorista() {
        return id_Motorista;
    }

    public void setId_Motorista(String id_Motorista) {
        this.id_Motorista = id_Motorista;
    }
}

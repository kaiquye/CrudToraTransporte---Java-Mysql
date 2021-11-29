package Model;

public abstract class Veiculo {

    private String id;
    private  String modelo;
    private  String chassi;
    private String placa;
    private String anoFabricacao;

    public Veiculo(String modelo, String chassi, String placa, String anoFabricacao) {
        this.modelo = modelo;
        this.chassi = chassi;
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;

    }

    public Veiculo(){}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }


}

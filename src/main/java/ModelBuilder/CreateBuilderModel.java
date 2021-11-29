package ModelBuilder;

import Model.Caminhao;
import Model.Carga;
import Model.Motorista;
import Model.UsuarioLogin;


public class CreateBuilderModel {
    private UsuarioLogin.Builder  usuarioLogin;
    private  Caminhao.Builder builderCaminhao;
    private Motorista.BuilderMotorista motorista;
    private Carga.Builder builderCarga;

    private CreateBuilderModel(Builder builder) {

        this.builderCaminhao = builder.builderCaminhao;
        this.motorista = builder.BuilderMotorista;
        this.builderCarga = builder.builderCarga;
        this.usuarioLogin = builder.usuarioLogin;
    }

    public static class Builder {
        private UsuarioLogin.Builder  usuarioLogin;
        private  Caminhao.Builder builderCaminhao;
        private Motorista.BuilderMotorista BuilderMotorista;
        private Carga.Builder builderCarga;

        public Builder Motorsita(Motorista.BuilderMotorista builderMotorista) {
            this.BuilderMotorista = builderMotorista;
                return  this;
        }

        public Builder adicionarCaminhao(Caminhao.Builder builderCaminhao) {
            this.builderCaminhao =  builderCaminhao;
            return this;
        }

        public Builder adicionarCarga(Carga.Builder carga) {
            this.builderCarga = carga;
            return this;
        }
        public Builder usuarioLogin(UsuarioLogin.Builder usuario){
            this.usuarioLogin = usuario;
            return  this;
        }

        public CreateBuilderModel builder() {
            return new CreateBuilderModel(this);
        }

    }

    public Caminhao.Builder getCaminhao() {
        return builderCaminhao;
    }


    public Motorista.BuilderMotorista getMotorista() {
        return motorista;
    }

    public Carga.Builder getCarga() {
        return builderCarga;
    }

    public UsuarioLogin.Builder getUsuarioLogin() {
        return usuarioLogin;
    }

}

package DAO;

import Controller.CadastroUsuario;
import Controller.Controller_Caminhao;
import Model.*;
import ModelBuilder.CreateBuilderModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// CLASSE "Protected"
public class ConnectionMysql {
    private static final ConnectionMysql INSTANCE = new ConnectionMysql();




    private ConnectionMysql() {

    }

    public static  ConnectionMysql getINSTANCE() {
        return INSTANCE;
    }

    public Connection ligarMysql() {
        Connection conexao = null;

        try {

            conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/toradatabase?useTimezone=true&serverTimezone=UTC", "root", "1234");
            System.out.println("Conexado com susseço meu querido");
        } catch (SQLException erro ) {
            System.out.println("Erro ao tentar ligar o banco de dados  " + erro );
        }
        return  conexao;
    }

    public static void main(String[] args) {
        /*
    }
        CadatrarMotorista c = new CadatrarMotorista();

        CreateBuilderModel ClientOne = new CreateBuilderModel.Builder(new Motorista
            ("Carlos","0214993952","034535213", "0099943", "139999",new Endereco
                ("432","Alvarenga","Dom Bosco","BH", "BR"))).sengCaminhao
            (new Caminhao("Scania 480", "0120ASDASD", "HYM-3123",
                "2012", "BRANCO", "JUNTA DO CABEÇOTE QUEIMADA", "6")).builder();

        CreateBuilderModel clienteM = new CreateBuilderModel.Builder(new Motorista.BuilderMotorista("Alex dos Anjos", "0231.312.433.11", "33112321").numeroAMotorista_Xp("999913", "00001").
            adicionarEnderecoDoMotorista(new Endereco.Builder("Dom jacim","Das dores", "Vila Rica"))).builder();

        CadatrarMotorista cadatrarMotorista = new CadatrarMotorista();
        String id_motorista =  cadatrarMotorista.Cadastrar(clienteM.getMotorista().motorista());
        CreateBuilderModel cliente2 = new CreateBuilderModel.Builder(null).adicionarCaminhao(new Caminhao.Builder("VOLVO 498", "GNNHH41213", "GHT1231", "2011").id_motorista(id_motorista)).builder();

        System.out.println("muito bem, vamos lá ! id do motorista é : " + cliente2.getCaminhao().caminhao().getId_Motorista());



        CreateBuilderModel Motoristas = new CreateBuilderModel.Builder(new Motorista.BuilderMotorista("gabriel", "1111-231313-01213","31.9.111111191-313").numeroAMotorista_Xp("000211333","0022003")
            .adicionarEnderecoDoMotorista(new Endereco.Builder("Dom bosco","carlosPrates", "BH").numero("333").pais("Angola"))).builder();
        CadatrarMotorista cadatrarMotorista = new CadatrarMotorista();
        String  idmotorista = cadatrarMotorista.Cadastrar(Motoristas.getMotorista().motorista());


        CreateBuilderModel Caminhao = new CreateBuilderModel.Builder(null).adicionarCaminhao(new Caminhao.Builder("DAF", "KGAA1231Y8da12359H", "KWH-11991", "2001").eixos("6").cor("AMARELO").id_motorista(idmotorista)).builder();

        CadastrarCaminhao cadastrarCaminhao = new CadastrarCaminhao();
        String idCaminhao = cadastrarCaminhao.Cadastrar(Caminhao.getCaminhao().caminhao());

        CreateBuilderModel Carga = new CreateBuilderModel.Builder(null).adicionarCarga(new Carga.Builder("0001","TORA", "994KG", null).id_caminhao(idCaminhao)).builder();
        CadastroCarga cadastroCarga = new CadastroCarga();
        try {
            cadastroCarga.Cadastrar(Carga.getCarga().carga());
        } catch (SQLException e) {
            System.out.println(e);
        }

      CreateBuilderModel usuario = new CreateBuilderModel.Builder().usuarioLogin(new UsuarioLogin.Builder("asdasd","asdasdasd","asdasd","asdasdas","asdasdasd")).builder();
        System.out.println(usuario.getUsuarioLogin().builder().getEmail() + usuario.getUsuarioLogin().builder().getSenha());
        CadastroUsuarioADM d = new CadastroUsuarioADM();
        try {
            d.Cadastrar(usuario.getUsuarioLogin().builder());
        } catch (SQLException e) {
            e.printStackTrace();
        }
 */

    }
}
package DAO;

import Model.Caminhao;

import java.sql.*;
import java.util.List;

// CLASSE "Protected"
public class CadastrarCaminhao implements CadastroDAO<Caminhao> {

    public static String idCaminhoa;

    @Override
    public String Cadastrar(Caminhao obj) {


        System.out.println("metodo chamado mas nao nao cadastrou ainda ");

        try (Connection conexao = ConnectionMysql.getINSTANCE().ligarMysql()) {
            String sqlQuery = "INSERT INTO caminhao (Modelo, Chassi, Placa, AnoFabricacao, Cor, Eixos, Motorista_idMotorista) " +
                " VALUES (?,?,?,?,?,?,?)";
            System.out.println("Caminhao");
            PreparedStatement preparaConexao = conexao.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS);
            preparaConexao.setString(1, obj.getModelo());
            preparaConexao.setString(2, obj.getChassi());
            preparaConexao.setString(3,obj.getPlaca());
            preparaConexao.setString(4, obj.getAnoFabricacao());
            preparaConexao.setString(5, obj.getCor());
            preparaConexao.setString(6, obj.getEixos());
            preparaConexao.setString(7, CadatrarMotorista.idMontorista);
            preparaConexao.execute();
            ResultSet rs = preparaConexao.getGeneratedKeys();
            rs.next();
            idCaminhoa = rs.getString(1);
            System.out.println("Cadastrado com susseço " + CadatrarMotorista.idMontorista);

        } catch (SQLException erro) {
            System.out.println("Erro ao tentar cadastrar um novo veiculo : " + erro);
        }
        return  idCaminhoa;

    }

    @Override
    public ResultSet Buscar(String parametro) {
        return null;
    }

    @Override
    public void Editar(String parametro) {

    }

    @Override
    public void Deletar(String motoristaID, String caminhaoID) {

    }
}

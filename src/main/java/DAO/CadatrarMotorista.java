package DAO;

import Model.Motorista;

import java.sql.*;

class CadatrarMotorista implements CadastroDAO<Motorista> {


    public static  String idMontorista ;

    @Override
    public String Cadastrar(Motorista obj) {


        try (Connection conexao = ConnectionMysql.getINSTANCE().ligarMysql()) {


                String sqlQuery = "INSERT INTO motorista (Nome, Cpf, Telefone, XP) " +
                    "VALUES (?,?,?,?)";
                PreparedStatement preparaConexao = conexao.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS);
                preparaConexao.setString(1, obj.getNome());
                preparaConexao.setString(2, obj.getCpf());
                preparaConexao.setString(3, obj.getTelefone());
                preparaConexao.setString(4, obj.getXP());
                preparaConexao.execute();
                ResultSet result = preparaConexao.getGeneratedKeys();
                result.next();
                idMontorista = result.getString(1);


        } catch (SQLException erro) {
            System.out.println("Erro ao tentar cadastrar um motorista " +  erro);
        }
            return idMontorista;
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

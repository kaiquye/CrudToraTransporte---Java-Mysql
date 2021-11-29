package DAO;


import Model.Carga;

import java.sql.*;
// CLASSE "Protected"
 class CadastroCarga  implements CadastroDAO<Carga> {

    public static String idSQLCaminhao;




    @Override
    public String Cadastrar(Carga obj){
        try (Connection conexao = ConnectionMysql.getINSTANCE().ligarMysql()){
            String sqlQuery = "INSERT INTO carga (Nome, Peso, Destino, Caminhao_idCaminhao) " +
                "VALUES (?,?,?,?) ";
            PreparedStatement preparaConexao = conexao.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS);
            preparaConexao.setString(1, obj.getNome());
            preparaConexao.setString(2, obj.getPeso());
            preparaConexao.setString(3, "nullo");
            preparaConexao.setString(4, obj.getId_Caminhao());
            preparaConexao.execute();
            ResultSet rs =  preparaConexao.getGeneratedKeys();
            rs.next();
            idSQLCaminhao = rs.getString(1);

         }catch (SQLException erro){

        }
    return idSQLCaminhao;

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

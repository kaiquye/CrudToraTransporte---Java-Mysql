package DAO;

import Controller.CadastroUsuario;
import Model.UsuarioLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CadastroUsuarioADM implements CadastroDAO<UsuarioLogin> {


    @Override
    public String Cadastrar(UsuarioLogin obj) throws SQLException {
        System.out.println("Chamou !");
        try{
            Connection conexao = ConnectionMysql.getINSTANCE().ligarMysql();
            String sql = "INSERT INTO login (nome, passaword, email) VALUES (?,?,?)";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, obj.getNome());
            ps.setString(2, "obj.getSenha()");
            ps.setString(3, "obj.getEmail()");
            ps.execute();
        } catch (SQLException erro) {
            System.out.println("Erro ao tentar cadastrar um novo Usuario ADM : " + erro);
        }
        return  null;
    }

    @Override
    public ResultSet Buscar(String parametro) throws SQLException {
        return null;
    }

    @Override
    public void Editar(String parametro) throws SQLException {

    }

    @Override
    public void Deletar(String motoristaID, String caminhaoID) throws SQLException {

    }
}

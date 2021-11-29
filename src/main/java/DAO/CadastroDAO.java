package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface CadastroDAO<Objt> {

    String Cadastrar(Objt obj) throws SQLException ;
    ResultSet Buscar(String parametro) throws SQLException ;
    void Editar(String parametro) throws SQLException ;
    void Deletar(String motoristaID, String caminhaoID) throws SQLException ;


}

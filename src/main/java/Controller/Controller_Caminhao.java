package Controller;

import DAO.CadastrarCaminhao;
import DAO.CadastroDAO;
import DAO.ControllerDAO;
import DAO.enumDAO;
import Model.Caminhao;
import ModelBuilder.CreateBuilderModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Controller_Caminhao {

    public static void cadastar(CreateBuilderModel caminhao) throws SQLException {
        System.out.println("__________________");
     ControllerDAO.fabricaDAO(enumDAO.DAHSBOARDCAMINHOA).Cadastrar(caminhao.getCaminhao().caminhao());




    }

    public static List buscar(String caminhao) {

        List lista = new ArrayList<>();
        ResultSet result = null;

        try {
            result = ControllerDAO.fabricaDAO(enumDAO.DAHSBOARDCAMINHOA).Buscar(caminhao);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }


}

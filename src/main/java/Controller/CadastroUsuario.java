package Controller;

import DAO.*;
import Model.UsuarioLogin;
import ModelBuilder.CreateBuilderModel;

import java.sql.SQLException;

public class CadastroUsuario {

    public void cadastrar(CreateBuilderModel model) throws SQLException {
        System.out.println(model.getUsuarioLogin().builder().getNome() + model.getUsuarioLogin().builder().getNome() );

        if(true){
            System.out.println("______");
            CadastroUsuarioADM ad = new CadastroUsuarioADM();
            ad.Cadastrar(model.getUsuarioLogin().builder());
        }



    }


}

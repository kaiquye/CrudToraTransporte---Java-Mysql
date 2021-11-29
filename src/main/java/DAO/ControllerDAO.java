package DAO;

import Controller.Controller_Caminhao;

public interface ControllerDAO<T> {





    static CadastroDAO fabricaDAO(enumDAO type) {


         switch (type) {
            case DAHSBOARDCAMINHOA:
                return new CadastrarCaminhao();

            case DAHSBOARDMOTORISTA:
                return new CadatrarMotorista();

            case DAHSBOARDCARGA:
                return new CadastroCarga();
             case DAHSBOARDUSUARIOADM:
                 return new CadastroUsuarioADM();
             default:
                 System.out.println("( _________________ classe dao não selecioanda ! _________________) ");
         }
            return  null;
    }


}

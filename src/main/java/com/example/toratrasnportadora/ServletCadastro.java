package com.example.toratrasnportadora;

import Controller.CadastroUsuario;
import DAO.ConnectionMysql;
import Model.UsuarioLogin;
import ModelBuilder.CreateBuilderModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet(name = "ServletCadastro", value = "/ServletCadastro")
public class ServletCadastro extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String telefone = request.getParameter("telefone");
        String senha = request.getParameter("senha");
        String email = "aww.w.wwww";


        CreateBuilderModel model = new CreateBuilderModel.Builder().usuarioLogin(new UsuarioLogin.Builder(nome, cpf, telefone, senha, email)).builder();



        CadastroUsuario cad = new CadastroUsuario();
        try {
            cad.cadastrar(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    protected void cadastrarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {






    }




}

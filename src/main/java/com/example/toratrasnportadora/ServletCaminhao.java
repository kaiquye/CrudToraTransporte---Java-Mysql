package com.example.toratrasnportadora;

import Controller.BuscarMetodos;
import Controller.Controller_Caminhao;
import Model.Caminhao;
import Model.Motorista;
import ModelBuilder.CreateBuilderModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ServletCaminhao", value = "/CadastarCaminhao")
public class ServletCaminhao extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String modelo = request.getParameter("Modelo");
        String cor = request.getParameter("Cor");
        String Ano =  request.getParameter("Ano");
        String Chassi = request.getParameter("Chassi");
        String Placa = request.getParameter("Placa");
        String Eixos = request.getParameter("Eixos");

        System.out.println("caminhao");

        CreateBuilderModel caminhao = new CreateBuilderModel.Builder().adicionarCaminhao(new Caminhao.Builder(modelo,Chassi,Placa, Ano).cor(cor).
            eixos(Eixos)).builder();

        String action = request.getServletPath();
        switch (action){
            case "/CadastarCaminhao":
                System.out.println("boa");
                cadastrarCaminhao(request,response, caminhao);
        }

    }

    protected void cadastrarCaminhao(HttpServletRequest request, HttpServletResponse response, CreateBuilderModel caminhao) throws ServletException, IOException {

        try {
            System.out.println("boa");
            Controller_Caminhao.cadastar(caminhao);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }



}

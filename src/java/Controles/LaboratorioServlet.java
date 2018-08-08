/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import DAOs.DAOLaboratorio;
import Entidades.Laboratorio;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jaque
 */
@WebServlet(name = "LaboratorioServlet", urlPatterns = {"/laboratorioLista"})
public class LaboratorioServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int idLaboratorio = 0;
        String nomeLaboratorio = "";
        String localizacao = "";
        String fotoLaboratorio = "";
        DAOLaboratorio daoLaboratorio = new DAOLaboratorio();
        Laboratorio laboratorio = new Laboratorio();
        try (PrintWriter out = response.getWriter()) {
            idLaboratorio = Integer.parseInt(request.getParameter("idLaboratorio"));
            nomeLaboratorio = request.getParameter("nomeLaboratorio");
            localizacao = request.getParameter("localizacao");
            fotoLaboratorio = request.getParameter("fotoLaboratorio");
            laboratorio.setIdLaboratorio(idLaboratorio);
            laboratorio.setNomeLaboratorio(nomeLaboratorio);
            laboratorio.setLocalizacao(localizacao);
            laboratorio.setFotoLaboratorio(fotoLaboratorio);

            daoLaboratorio.inserir(laboratorio);
            String resultadoLaboratorio = "";

            resultadoLaboratorio = listaLaboratoriosCadastrados();

            request.getSession().setAttribute("resultadoLaboratorio", resultadoLaboratorio);
            response.sendRedirect(request.getContextPath() + "/Paginas/laboratorioLista.jsp");
        }
    }

    protected String listaLaboratorioId(String idLaboratorio) {
        DAOLaboratorio laboratorio = new DAOLaboratorio();
        String tabela = "";
        List<Laboratorio> lista = laboratorio.listById(0);
        for (Laboratorio l : lista) {
            tabela += "<tr>"
                    + "<td>" + l.getIdLaboratorio() + "</td>"
                    + "<td>" + l.getNomeLaboratorio() + "</td>"
                    + "<td>" + l.getLocalizacao() + "</td>"
                    + "<td>" + l.getFotoLaboratorio() + "</td>"
                    + "</tr>";
        }

        return tabela;
    }

    protected String listaLaboratoriosCadastrados() {
        DAOLaboratorio laboratorio = new DAOLaboratorio();
        String tabela = "";
        List<Laboratorio> lista = laboratorio.listInOrderNome();
        for (Laboratorio l : lista) {
            tabela += "<tr>"
                    + "<td>" + l.getIdLaboratorio() + "</td>"
                    + "<td>" + l.getNomeLaboratorio() + "</td>"
                    + "<td>" + l.getLocalizacao() + "</td>"
                    + "<td>" + l.getFotoLaboratorio() + "</td>"
                    + "</tr>";
        }

        return tabela;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        System.out.println("teste doget");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        System.out.println("teste dopost");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

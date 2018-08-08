/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import DAOs.DAOProfessor;
import Entidades.Professor;
import Entidades.Professor;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jaque
 */
@WebServlet(name = "ProfessorServlet", urlPatterns = {"/professorLista"})
public class ProfessorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    DAOProfessor daoProfessor = new DAOProfessor();
    Professor professor = new Professor();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String resultadoProfessor = "";
        String nomeProfessor = "";
        String lattes = "";
        String fotoProfessor = "";
        int idProfessor = 0;
        try (PrintWriter out = response.getWriter()) {
            idProfessor = Integer.parseInt(request.getParameter("idProfessor"));
            nomeProfessor = request.getParameter("nomeProfessor");
            lattes = request.getParameter("lattes");
            fotoProfessor = request.getParameter("fotoProfessor");
            professor.setIdProfessor(idProfessor);
            professor.setNomeProfessor(nomeProfessor);
            professor.setLattes(lattes);
            professor.setFotoProfessor(fotoProfessor);
            daoProfessor.inserir(professor);
            resultadoProfessor = listaProfessoresCadastrados();

            request.getSession().setAttribute("resultadoProfessor", resultadoProfessor);
            response.sendRedirect(request.getContextPath() + "/Paginas/professorLista.jsp");
        }
    }

    protected String listaProfessorId(String idProfessor) {
        DAOProfessor professor = new DAOProfessor();
        String tabela = "";
        List<Professor> lista = professor.listById(0);
        for (Professor l : lista) {
            tabela += "<tr>"
                    + "<td>" + l.getIdProfessor() + "</td>"
                    + "<td>" + l.getNomeProfessor() + "</td>"
                    + "<td>" + l.getLattes() + "</td>"
                    + "<td>" + l.getFotoProfessor() + "</td>"
                    + "</tr>";
        }

        return tabela;
    }

    protected String listaProfessoresCadastrados() {
        DAOProfessor professor = new DAOProfessor();
        String tabela = "";
        List<Professor> lista = professor.listInOrderNome();
        for (Professor l : lista) {
            tabela += "<tr>"
                    + "<td>" + l.getIdProfessor() + "</td>"
                    + "<td>" + l.getNomeProfessor() + "</td>"
                    + "<td>" + l.getLattes() + "</td>"
                    + "<td>" + l.getFotoProfessor() + "</td>"
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

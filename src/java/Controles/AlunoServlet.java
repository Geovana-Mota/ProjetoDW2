/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import DAOs.DAOAluno;
import Entidades.Aluno;
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
@WebServlet(name = "AlunoServlet", urlPatterns = {"/alunoLista"})
public class AlunoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    DAOAluno daoAluno = new DAOAluno();
    Aluno aluno = new Aluno();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int idAluno = 0;
        String nomeAluno = "";
        String area = "";
        String resultadoAluno = "";

        try (PrintWriter out = response.getWriter()) {
            idAluno = Integer.parseInt(request.getParameter("idAluno"));
            nomeAluno = request.getParameter("nomeAluno");
            area = request.getParameter("area");
            aluno.setIdAluno(idAluno);
            aluno.setNomeAluno(nomeAluno);
            aluno.setArea(area);

            daoAluno.inserir(aluno);

            resultadoAluno = listaAlunosCadastrados();

            request.getSession().setAttribute("resultadoAluno", resultadoAluno);
            response.sendRedirect(request.getContextPath() + "/Paginas/alunoLista.jsp");
        }
    }

    protected String listaAlunoId(String idAluno) {
        DAOAluno tipo = new DAOAluno();
        String tabela = "";
        List<Aluno> lista = tipo.listById(0);
        for (Aluno l : lista) {
            tabela += "<tr>"
                    + "<td>" + l.getIdAluno() + "</td>"
                    + "<td>" + l.getNomeAluno() + "</td>"
                    + "<td>" + l.getArea() + "</td>"
                    + "</tr>";
        }

        return tabela;
    }

    protected String listaAlunosCadastrados() {
        DAOAluno tipo = new DAOAluno();
        String tabela = "";
        List<Aluno> lista = tipo.listInOrderNome();
        for (Aluno l : lista) {
            tabela += "<tr>"
                    + "<td>" + l.getIdAluno() + "</td>"
                    + "<td>" + l.getNomeAluno() + "</td>"
                    + "<td>" + l.getArea() + "</td>"
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

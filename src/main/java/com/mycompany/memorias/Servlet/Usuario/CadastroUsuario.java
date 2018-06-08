/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.memorias.Servlet.Usuario;

import com.mycompany.memorias.Hibernate.HibernateUtil;
import com.mycompany.memorias.Models.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Chico
 */
public class CadastroUsuario extends HttpServlet {

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
        Usuario usuario = new Usuario();
        //usuario.setDataNasc(request.getParameter("inputDataNasc"));
        usuario.setEmail(request.getParameter("inputEmail"));
        usuario.setNascionalidade(request.getParameter("inputPais"));
        usuario.setNome(request.getParameter("inputNome"));
        usuario.setSenha("inputSenha");
        HibernateUtil<Usuario> hup = new HibernateUtil<>();
        String s = hup.salvar(usuario);
        HttpSession sessao = request.getSession();
        sessao.setAttribute("usuario", usuario);
        sessao.setAttribute("usuario_logado", "true");
        sessao.setAttribute("nome_usuario", request.getParameter("inputLogin"));
        response.sendRedirect("Interface/menu.jsp");
    }

}
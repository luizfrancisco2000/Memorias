/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.memorias.Servlet.Usuario;

import com.mycompany.memorias.Hibernate.HibernateFactory;
import com.mycompany.memorias.Hibernate.HibernateUtil;
import com.mycompany.memorias.Models.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                Usuario usuario = new Usuario();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = formato.parse(request.getParameter("inputDataNasc"));
            usuario.setDataNasc(date);
        } catch (ParseException ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        usuario.setEmail(request.getParameter("inputEmail"));
        usuario.setNacionalidade(request.getParameter("inputPais"));
        usuario.setNome(request.getParameter("inputName"));
        usuario.setSenha(request.getParameter("inputSenha"));
        PrintWriter out = response.getWriter();
        //out.print(usuario.toString());
        HttpSession sessao = request.getSession();
        HibernateUtil<Usuario> hup = new HibernateUtil<>();
        String s = hup.salvar(usuario);
        sessao.setAttribute("usuario", usuario);
        sessao.setAttribute("usuario_logado", "true");
        sessao.setAttribute("nome_usuario", request.getParameter("inputEmail"));
        response.sendRedirect("Interface/menu.jsp");
    }
}

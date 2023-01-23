package com.mycompany.web.servlets;

import com.mycompany.web.models.Inscripto;

import java.io.IOException;

import com.mycompany.web.models.AccionesInscripto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/nuevoinscripto")
public class InsertarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int i;
        String n , a, co, cat ;

        n = req.getParameter("nombre");

        a = req.getParameter("apellido");

        co = req.getParameter("correo");

        i = Integer.parseInt(req.getParameter("cantidad"));

        cat = req.getParameter("categoria");

        Inscripto nuevoInscripto = new Inscripto();

        nuevoInscripto.setNombre(n);
        nuevoInscripto.setApellido(a);
        nuevoInscripto.setCorreo(co);
        nuevoInscripto.setCantidad(i);
        nuevoInscripto.setCategoria(cat);

        int estado = AccionesInscripto.registrarInscripto(nuevoInscripto);

        if (estado == 1){
            resp.sendRedirect("exito.jsp");
            System.out.println("todo ok");
        } else {
            System.out.println("Error");
            resp.sendRedirect("error.jsp");
        }



    }
}

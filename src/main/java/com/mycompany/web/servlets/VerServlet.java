package com.mycompany.web.servlets;

import java.io.IOException;

import com.mycompany.web.models.AccionesInscripto;
import com.mycompany.web.models.Inscripto;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/verinscripto")
public class VerServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int i = Integer.parseInt(req.getParameter("nro"));

        Inscripto registro = AccionesInscripto.verInscripto(i);

        req.setAttribute("c", registro);

        RequestDispatcher respuesta = req.getRequestDispatcher("/datoinscripto.jsp");
        respuesta.forward(req,resp);
    }
}

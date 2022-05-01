/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import modelo.Rectangulo;


/**
 *
 * @author Rafaelito
 */
public class Controlador extends HttpServlet {

   

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
        
        
        String operacionStr = request.getParameter("operacion");
        String baseStr = request.getParameter("base");
        String alturaStr = request.getParameter("altura");
        
        double base = Double.parseDouble(baseStr);
        double altura = Double.parseDouble(alturaStr);
        
        Rectangulo rectangulo = new Rectangulo(base, altura);
        double resultado;
        
        if(operacionStr.equalsIgnoreCase("area")){
            resultado = rectangulo.calcularAreaRectangulo();
            request.setAttribute("resultadoArea", resultado);
            request.setAttribute("operacion", "Area");
        }else{
            resultado = rectangulo.calcularPerimetroRectangulo();
            request.setAttribute("resultadoPerimetro", resultado);
            request.setAttribute("operacion", "Perimetro");
        }
        
        String ruta = "web/WEB-INF/JSP/rectangulo.jsp";
        
        request.getRequestDispatcher(ruta).forward(request, response);
        
        
        
        
        
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
         String operacionStr = request.getParameter("operacion");
        String baseStr = request.getParameter("base");
        String alturaStr = request.getParameter("altura");
        
        double base = Double.parseDouble(baseStr);
        double altura = Double.parseDouble(alturaStr);
        
        Rectangulo rectangulo = new Rectangulo(base, altura);
        double resultado;
        
        if(operacionStr.equalsIgnoreCase("area")){
            resultado = rectangulo.calcularAreaRectangulo();
            request.setAttribute("resultadoArea", resultado);
            request.setAttribute("operacion", "Area");
        }else{
            resultado = rectangulo.calcularPerimetroRectangulo();
            request.setAttribute("resultadoPerimetro", resultado);
            request.setAttribute("operacion", "Perimetro");
        }
        
        String ruta = "web/WEB-INF/JSP/rectangulo.jsp";
        
        request.getRequestDispatcher(ruta).forward(request, response);
        
        
        
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

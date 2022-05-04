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
import java.io.PrintWriter;
import modelo.Circulo;
import modelo.Rectangulo;

/**
 *
 * @author Rafaelito
 */
public class Controlador extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       

        String figura = request.getParameter("figura");

        if (figura.equalsIgnoreCase("circulo")) {

            String ruta = "WEB-INF/JSP/circulos-jsp/circulo-form.jsp";

            request.getRequestDispatcher(ruta).forward(request, response);

        } else {
            String ruta = "WEB-INF/JSP/rectangulo-jsp/rectangulo-form.jsp";

            request.getRequestDispatcher(ruta).forward(request, response);
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String operacionCadena = request.getParameter("operacion");
        
        String figura = request.getParameter("figura");
        String baseCadena = request.getParameter("base");
        String alturaCadena = request.getParameter("altura");
        String diametroCadena = request.getParameter("diametro");
        double resultado;
        
        if (figura.equalsIgnoreCase("rectangulo")) {

            double base = Double.parseDouble(baseCadena);
            double altura = Double.parseDouble(alturaCadena);

            Rectangulo rectangulo = new Rectangulo(base, altura);
            

            if (operacionCadena.equalsIgnoreCase("area")) {
                resultado = rectangulo.calcularAreaRectangulo();
                request.setAttribute("resultado", resultado);
                request.setAttribute("operacion", "Area");
            } else {
                resultado = rectangulo.calcularPerimetroRectangulo();
                request.setAttribute("resultado", resultado);
                request.setAttribute("operacion", "Perimetro");
            }

            String ruta = "WEB-INF/JSP/rectangulo-jsp/rectangulo.jsp";

            request.getRequestDispatcher(ruta).forward(request, response);
        } else {

            double diametro = Double.parseDouble(diametroCadena);

            Circulo circulo = new Circulo(diametro);

            if (operacionCadena.equalsIgnoreCase("area")) {
                resultado = circulo.calcularAreaCirculo();
                request.setAttribute("resultado", resultado);
                request.setAttribute("operacion", "Area");
            } else if(operacionCadena.equalsIgnoreCase("perimetro")){
                resultado = circulo.calcularPerimetroCirculo();
                request.setAttribute("resultado", resultado);
                request.setAttribute("operacion", "Perimetro");
            }else{
                resultado = circulo.calcularRadioCirculo();
                request.setAttribute("resultado", resultado);
                request.setAttribute("operacion", "Radio");
            }

            String ruta = "WEB-INF/JSP/circulos-jsp/circulo.jsp";

            request.getRequestDispatcher(ruta).forward(request, response);
        }

    }

    
    
    
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

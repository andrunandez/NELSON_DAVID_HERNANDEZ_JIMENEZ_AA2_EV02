import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FormServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
        String nombre = request.getParameter("nombre");
        String edad = request.getParameter("edad");

       
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("<h2>Datos recibidos por GET:</h2>");
        out.println("<p>Nombre: " + nombre + "</p>");
        out.println("<p>Edad: " + edad + "</p>");
        out.println("</body></html>");
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String edad = request.getParameter("edad");

        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Datos recibidos por POST:</h2>");
        out.println("<p>Nombre: " + nombre + "</p>");
        out.println("<p>Edad: " + edad + "</p>");
        out.println("</body></html>");
    }
}



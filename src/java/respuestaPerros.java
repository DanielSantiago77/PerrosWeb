
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author DANIEL BARRANTES
 */

@WebServlet(urlPatterns = {"/respuestaPerros"})
public class respuestaPerros extends HttpServlet {

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
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws  IOException {
       
        Quiz q= new Quiz();
        int horas = Integer.parseInt(request.getParameter("NúmeroDeHoras"));
        int grandes = Integer.parseInt(request.getParameter("NúmeroDePerrosGrandes"));
        int medianos = Integer.parseInt(request.getParameter("NúmeroDePerrosMedianos"));
        int pequeños = Integer.parseInt(request.getParameter("NúmeroDePerrosPequeños"));
        
        try (PrintWriter out = response.getWriter()) {
            
            out.print("<html>");
            out.print("<head>");
            out.print("<utf=8>");
            out.print("<link href=\"Estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>");
            out.print("</head>");
            out.print("<body>");
            
            out.print("<h1>RESPUESTA TOTAL");
            
            out.print("<h3 class='Primerarespuesta'>Usuario la cantidad de horas que vas a pasear a los perros es de = " +horas+ " horas</h3>");
            
            out.print("<h3 class='Segundarespuesta'>Usuario la cantidad de perros grandes que escribiste es = " +grandes+ "</h3>");
            
            out.print("<h3 class='Tercerarespuesta'>Usuario la cantidad de perros medianos que escribiste es = " +medianos+ "</h3>");
           
            out.print("<h3 class='Cuartarespuesta'>Usuario la cantidad de perros pequeños que escribiste es = " +pequeños+ "</h3>");
            
            q.setHorasPaseo(horas);
            q.setPerrosGrandes(grandes);
            q.setPerrosMedianos(medianos);
            q.setPerrosPequeños(pequeños);
            
            out.print("<h2 class='quintarespuesta'>USUARIO SU COSTO TOTAL ES DE = $" +q.calcularCostoPaseo());
            out.print("<utf=8>");
            out.print("</body>");
            out.print("</html>");
            
            out.print("<img src=\"tierno.jpg\" alt=\"\"/>");
        }
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

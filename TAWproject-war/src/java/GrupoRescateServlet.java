/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import TAWproject.dao.GruporescateFacade;
import TAWproject.entity.Gruporescate;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JuanM
 */
@WebServlet(name = "grupoRescate", urlPatterns = {"/grupoRescate"})
public class GrupoRescateServlet extends HttpServlet {

    @EJB
    private GruporescateFacade gruporescateFacade;

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            // TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GruposRescate</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GruposRescate at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Gruporescate> grupos = gruporescateFacade.findAll();
        List<Integer> numusers = new ArrayList<Integer>();
        
        for(Gruporescate gr : grupos){
            numusers.add(0);
        }
        request.setAttribute("grupos", grupos);
        request.setAttribute("numusers",numusers);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/grupoRescate.jsp");
        dispatcher.forward(request,response);
        //processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
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
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    
	/*public void init(ServletConfig cg) throws ServletException {
		super.init(cg);
	}*/
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

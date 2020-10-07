package br.uff.app_corp.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.uff.app_corp.model.Evento;
import br.uff.app_corp.model.EventoDAO;

/**
 * Servlet implementation class DeletaEventoServlet
 */
@WebServlet("/DeletaEdicaoServlet")
public class DeletaEdicaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletaEdicaoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private void deletaEvento(HttpServletRequest request, HttpServletResponse response) 
        	throws ServletException, IOException {   
    			Evento e = new Evento(
    					Integer.parseInt(request.getParameter("edicaoId"))
    					);
                try {
                	(new EventoDAO()).delete(e);
    			} catch (Exception e2) {
    				System.out.println(e2.getMessage());
    			}
        	
        }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		deletaEvento(request, response);
	}

}

package br.uff.app_corp.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.uff.app_corp.model.Edicao;
import br.uff.app_corp.model.Evento;
import br.uff.app_corp.model.EventoDAO;

/**
 * Servlet implementation class EditaEventoServlet
 */
@WebServlet("/EditaEdicaoServlet")
public class EditaEdicaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditaEdicaoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    private void editaEvento(HttpServletRequest request, HttpServletResponse response) 
        	throws ServletException, IOException {  
    	try {
    		Evento evento = (Evento) (new EventoDAO()).getById(Integer.valueOf(request.getParameter("eventoId")));
    		Edicao e = new Edicao(
    				Integer.parseInt(request.getParameter("edicaoId")),	
    				Integer.parseInt(request.getParameter("numero")),
    				Double.parseDouble(request.getParameter("ano")),
    				Double.parseDouble(request.getParameter("dataInicio")),
    				Double.parseDouble(request.getParameter("dataFim")),
    				request.getParameter("cidadeSede"),
    				request.getParameter("paisSede"),
    				evento
			);    
        	(new EventoDAO()).update(e);
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
		editaEvento(request, response);
	}

}

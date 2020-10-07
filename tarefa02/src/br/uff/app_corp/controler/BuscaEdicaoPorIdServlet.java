package br.uff.app_corp.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.uff.app_corp.model.EdicaoDAO;

/**
 * Servlet implementation class BuscaEventoPorIdServelet
 */
@WebServlet("/BuscaEdicaoPorIdServelet")
public class BuscaEdicaoPorIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscaEdicaoPorIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private void buscaEdicaoPorId(HttpServletRequest request, HttpServletResponse response) 
        	throws ServletException, IOException {   
                // Chama método para cadastrar publicação
                try {
                	request.setAttribute("evento", (new EdicaoDAO()).getById(Integer.parseInt(request.getParameter("edicaoId"))));
                	
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
		buscaEdicaoPorId(request, response);
	}

}

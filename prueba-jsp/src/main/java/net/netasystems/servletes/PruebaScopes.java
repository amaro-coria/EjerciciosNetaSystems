package net.netasystems.servletes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PruebaScopes
 */
public class PruebaScopes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PruebaScopes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String scope = request.getParameter("scope");
		switch (scope) {
		case "request":
			System.out.println("Estableciendo parametro en request");
			request.setAttribute("parametro", "VALOR ADQUIRIDO EN EL SCOPE DE REQUEST");
			break;
		case "session":
			System.out.println("Estableciendo parametro en session");
			request.getSession().setAttribute("parametro", "VALOR ADQUIRIDO EN EL SCOPE DE SESSION");
			break;
		case "application":
			System.out.println("Estableciendo parametro en application");
			request.getServletContext().setAttribute("parametro", "VALOR ADQUIRIDO EN EL SCOPE DE APPLICATION");
			break;
		default:
			break;
		}
		RequestDispatcher rd = request.getRequestDispatcher("/ejemplo-scope.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

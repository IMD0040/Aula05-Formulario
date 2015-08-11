package br.imd.ufrn.web2.aula05.formulario;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String nome = request.getParameter("nome");
	    String sobrenome = request.getParameter("sobrenome");
	    String curso = request.getParameter("curso");
	    
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    
	    out.println("<html>");
	    out.println("<head><title>Teste Formulario</title></head>");
	    out.println("<body>");
	    out.println("<h1>Dados do Aluno:</h1><table border=\"1\">");
	    out.println("<tr><th>Nome</th><td>"+nome+"</td></tr>");
	    out.println("<tr><th>Sobrenome</th><td>"+sobrenome+"</td></tr>");
	    out.println("<tr><th>Curso</th><td>"+curso+"</td></tr>");
	    out.println("</table></body></html>");
	}

}

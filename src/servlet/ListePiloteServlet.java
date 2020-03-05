package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Pilote;
import dao.IPiloteDAO;
import dao.PiloteDAO;


@WebServlet("/ListePilote")
public class ListePiloteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	
    public ListePiloteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


    
    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("debut post listepilote");
		List<Pilote> listePilote = new ArrayList<Pilote>();
		IPiloteDAO dao = new PiloteDAO();
		
		listePilote = dao.getPilotList();
		
		request.setAttribute("listeP", listePilote);
		
		System.out.println("fin post listepilote");
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/listepilote.jsp").forward(request, response);
	}


	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/listepilote.jsp").forward(request, response);
		
	}

}

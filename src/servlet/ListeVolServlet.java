package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import beans.Vol;

import dao.IVolDAO;

import dao.VolDAO;


@WebServlet("/ListeVol")
public class ListeVolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	
    public ListeVolServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


    
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Vol> listeVol = new ArrayList<Vol>();
		IVolDAO dao = new VolDAO();
		
		listeVol = dao.getVolList();
		
		request.setAttribute("listeV", listeVol);

		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/listevol.jsp").forward(request, response);
	}


	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/listevol.jsp").forward(request, response);
	}

}

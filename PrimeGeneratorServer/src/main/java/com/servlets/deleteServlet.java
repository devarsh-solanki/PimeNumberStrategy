package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Prime;
import com.factory.factoryProvider;

/**
 * Servlet implementation class deleteServlet
 */
public class deleteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			
			int note_id = Integer.parseInt(request.getParameter("note_id").trim());
			
			Session sc = factoryProvider.getfactory().openSession();
			
			Transaction tx = sc.beginTransaction();
			
			Prime no_note = (Prime) sc.get(Prime.class, note_id);
			
			sc.delete(no_note);
			
			tx.commit();
			
			sc.close();
			
			response.sendRedirect("show_primes.jsp");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Prime;
import com.factory.factoryProvider;
import com.prime.NativePrime1;
import com.prime.NativePrime2;
import com.prime.SieveBooleanPrimeMethod;
import com.prime.SieveOfEratosthenes;

public class SaveServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			String name = request.getParameter("name");
			String strategy = request.getParameter("check-ok").trim();
			int lower = Integer.parseInt(request.getParameter("lower"));
			int upper = Integer.parseInt(request.getParameter("upper"));
			
			Prime prime = new Prime();
			prime.setName(name);
			prime.setPrimeSrategy(strategy);
			prime.setLowerLimit(lower);
			prime.setUpperLimit(upper);
			prime.setTime(new Date());

			boolean flag = true;

			while (flag) {

				try {

					if (strategy.equals("NativePrime1")) {
						long start1 = System.currentTimeMillis();
						String str1 = NativePrime1.nativePrime1(lower, upper);
						long end1 = System.currentTimeMillis();

						prime.setList(str1);
						prime.setExecutionTime(end1 - start1);
						break;

					} else if (strategy.equals("NativePrime2")) {
						long start2 = System.currentTimeMillis();
						String str2 = NativePrime2.nativePrime2(lower, upper);
						long end2 = System.currentTimeMillis();

						prime.setList(str2);
						prime.setExecutionTime(end2 - start2);
						break;

					} else if (strategy.equals("SieveOfEratosthenes")) {
						long start3 = System.currentTimeMillis();
						String str3 = SieveOfEratosthenes.sieveOfEratosthenes(lower, upper);
						long end3 = System.currentTimeMillis();

						prime.setList(str3);
						prime.setExecutionTime(end3 - start3);
						break;

					} else if (strategy.equals("SieveBooleanPrimeMethod")) {
						long start4 = System.currentTimeMillis();
						String str4 = SieveBooleanPrimeMethod.sieveBooleanPrimeMethod(lower, upper);
						long end4 = System.currentTimeMillis();

						prime.setList(str4);
						prime.setExecutionTime(end4 - start4);
						break;

					} else {
						System.out.println("Invalid input !!!");
						break;
					}

				} catch (Exception e) {
					flag = false;
					System.out.println("Exception : " + e.getMessage());
				}

			}

			// create sessionFactory
			// ---------------------------------------------------------------------------------------------------

			Session session = factoryProvider.getfactory().openSession();

			Transaction tx = session.beginTransaction();

			session.save(prime);

			tx.commit();

			session.close();
			
			// create printWriter
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h2 style='text-align: center;'> Prime numbers added successufully...</h2>");
			
			response.sendRedirect("show_primes.jsp");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

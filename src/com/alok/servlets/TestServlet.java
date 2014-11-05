package com.alok.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String fnm = req.getParameter("fname");
		String eml = req.getParameter("email");
		boolean er = false;
		String page = "index.jsp";
		if (fnm == null || fnm.trim().length() == 0) {
			req.setAttribute("fname", "Name is required");
			er = true;
		}

		if (eml == null || eml.trim().length() == 0) {
			req.setAttribute("email", "Email is required");
			er = true;
		}

		System.out.println(fnm);
		System.out.println(eml);

		if (!er) {
			page = "/WEB-INF/home.jsp";
			req.getRequestDispatcher(page).forward(req, res);
		} else {
			req.getRequestDispatcher(page).forward(req, res);
		}
		System.out.println(page);
	}
}

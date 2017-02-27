package com.ltgo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltgo.dao.impl.TravelNoteDaoImpl;
import com.ltgo.model.TravelNote;

@WebServlet("/ToUpdateTravelNoteServlet")
public class ToUpdateTravelNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("Nid");
		System.out.println("---------------"+id);
		int Nid= Integer.parseInt(id);
		TravelNoteDaoImpl dao = new TravelNoteDaoImpl();
		TravelNote tnote = dao.getTravelNoteByNid(Nid);
		request.setAttribute("tnote", tnote);
		request.getRequestDispatcher("/updateTravelNote.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}

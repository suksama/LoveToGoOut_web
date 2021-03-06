package com.ltgo.json.servlet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.ltgo.dao.impl.NotesJsonDaoImpl;
import com.ltgo.json.model.NoteBarJson;
import com.ltgo.json.model.NotesJson;
import com.ltgo.model.User;

/**
 * Servlet implementation class MapJsonServlet
 */
@WebServlet("/MapJsonServlet")
public class MapJsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MapJsonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/json;charset=utf-8");

//		InputStream is=request.getInputStream();
//		byte[] b=new byte[1000];
//		int len;
//		ByteArrayOutputStream baos=new ByteArrayOutputStream();
//		while((len=is.read(b))>0){
//			baos.write(b, 0, len);
//		}
//		String n_Id=new String(baos.toByteArray(),"utf-8");
		NotesJsonDaoImpl njdi=new NotesJsonDaoImpl();
		List<NoteBarJson> notebarlist=njdi.getNoteBarJson(1);
		Gson g=new Gson();
		String newJson=g.toJson(notebarlist);
		PrintWriter out=response.getWriter();
		out.println(newJson);
		
	}

}

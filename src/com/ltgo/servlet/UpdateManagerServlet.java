package com.ltgo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltgo.model.Manager;
import com.ltgo.service.ManagerService;
import com.ltgo.service.impl.ManagerServiceImpl;
import com.ltgo.util.Stringutil;

@WebServlet("/UpdateManagerServlet")
public class UpdateManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//�������������ǿմ���
		String account = request.getParameter("haccount");
		account = Stringutil.processNull(account);
		String password = request.getParameter("password");
		password = Stringutil.processNull(password);
		String sex = request.getParameter("sex");
		sex = Stringutil.processNull(sex);
		String email = request.getParameter("email");
		email = Stringutil.processNull(email);
		String time = request.getParameter("time");
		time = Stringutil.processNull(time);
		Manager manager = new Manager(account,password,sex,email,time);
		ManagerService service = new ManagerServiceImpl();
		boolean flag = service.updateManager(manager);
		/*if(flag){
			response.getWriter().println("<script type=\"text/javascript\">alert(\"�޸ĳɹ�\");location.href = \""+request.getContextPath()+"/ShowStudentServlet.do\";</script>");
		}else{
			response.getWriter().println("<script type=\"text/javascript\">alert(\"�޸�ʧ��\");location.href = \""+request.getContextPath()+"/ToUpdateStudentServlet.do?account=+\""+account+";</script>");
		}*/
		if(flag){
			response.getWriter().println("<script type=\"text/javascript\">alert(\"更改成功\");location.href=\"/LoveToGoOut/ShowManagerServlet\";</script>");
		}else{
			response.getWriter().println("<script type=\"text/javascript\">alert(\"更改失败\");location.href=\"/LoveToGoOut/ToUpdateManagerServlet?account=\"+account\";</script>");
		}
	}

}

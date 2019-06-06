package com.app.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.client.ClientUtil;
import com.app.model.Student;

public class StudentRecordDisplayServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Student> stu =ClientUtil.getEntity();
		req.setAttribute("student", stu);
		//send to UI
		req.getRequestDispatcher("data.jsp").forward(req,resp);
		
	}
	
}

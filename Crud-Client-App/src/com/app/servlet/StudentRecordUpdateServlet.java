package com.app.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.JsonUtil;
import com.app.client.ClientUtil;
import com.app.model.Student;

public class StudentRecordUpdateServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//@read data
		String id= req.getParameter("sid");
		String sname= req.getParameter("sname");
		String sclass=req.getParameter("sclass");
		String marks=req.getParameter("smarks");
		String sschool=req.getParameter("sschool");
		
		//parsing data
		int sid = Integer.parseInt(id);
		double smarks = Double.parseDouble(marks);
		
		//converting data to student obj.
		
		Student s = new Student(sid, sname, sclass, smarks, sschool);
		
		//converting student obj to json 
		String json = JsonUtil.getJsonData(s);
		
		// passing to client 
		String entity = ClientUtil.updateEntity(json);
		
		//set data in request scope
		req.setAttribute("msg",entity);
		
		//send to U
		req.getRequestDispatcher("index.jsp").forward(req,resp); 
		
	}
}

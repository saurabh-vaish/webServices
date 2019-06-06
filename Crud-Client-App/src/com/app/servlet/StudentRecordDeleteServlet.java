package com.app.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.JsonUtil;
import com.app.client.ClientUtil;
import com.app.model.Student;

public class StudentRecordDeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//@read data
		String id= req.getParameter("stuId");
		
		//parsing data
		int sid = Integer.parseInt(id);
		
		// passing to client 
		String entity = ClientUtil.deleteEntity(sid);
		
		//set data in request scope
		req.setAttribute("msg",entity);
		
		//send to UI
		req.getRequestDispatcher("view").forward(req,resp);
		
	}
}

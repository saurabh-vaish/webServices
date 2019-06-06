package com.app.provider;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.app.dao.StudentDao;
import com.app.model.Student;

@Path("/student")

public class StudentProvider {

	//url = http://localhost:8080/CRUD-ReST-Provider/rest/student/save 
	// give data in body ->raw in json or xml for postman
	@POST
	@Path("/save")
	//it will take JSO/XML data from Request Body
		// and converts to Product class object
		// if data type mismatch-415
	@Consumes({"application/json","application/xml"})
	public String saveStudent(Student s)
	{
		
		String msg=null;
		
		int c =StudentDao.save(s);
		
		if(c>0)
		{
			msg="Student data of id '"+s.getStuId()+"'inserted successfully";
		}
		else
		{
			msg="Unable to insert Student details";
		}

		return msg;
	}

	
	//2. to fetch all rows data in List format
		// returns either XML/JSON
	
	//url = http://localhost:8080/CRUD-ReST-Provider/rest/student/get ;
	@GET
	@Path("/get")
	@Produces({"application/json","application/xml"})
	public List<Student> getStuents()
	{
		List<Student> list = StudentDao.getStudent();
		return list;
	}
	
	

	//3. Delete Product based on QueryParam prodId
	// url = http://localhost:8080/CRUD-ReST-Provider/rest/student/delete?sid=101	 ;
	@DELETE
	@Path("/delete")
	public String deleteStudent(@QueryParam("sid")int sid)
	{
		String msg=null;
		int c = StudentDao.delete(sid);
		if(c>0)
		{
			msg="Student id '"+sid+"' data deleted";
		}
		else
		{
			msg="unable to delete";
		}
		return msg;
	}

	
	//url = http://localhost:8080/CRUD-ReST-Provider/rest/student/update ;
	// give data in body ->raw in json or xml for postman
	
	@PUT
	@Path("/update")
	@Consumes({"application/json","application/xml"})
	public String updateStudent(Student s)
	{
		String msg=null;
		int c = StudentDao.updateStudent(s);
		if(c>0)
		{
			msg="Student id '"+s.getStuId()+"' data updated";
		}
		else
		{
			msg="unable to update";
		}
		return msg;
	}

	
	//url= http://localhost:8080/CRUD-ReST-Provider/rest/student/getOne?sid=102 ;
	
	@GET
	@Path("/getOne")
	@Produces({"application/json","application/xml"})
	public List<Student> getOneStuents(@QueryParam("sid")int sid)
	{
		List<Student> list = StudentDao.getOneStudent(sid);
		return list;
	}
	
	
	
}

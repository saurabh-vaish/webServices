package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.app.model.Student;
import com.app.util.ConnectionUtil;

public class StudentDao {

	
	public static int  save(Student s)
	{
		int count=0;
		Connection con=null;
		PreparedStatement prmt=null;
		String sql = "insert into studentdetails values(?,?,?,?,?)";
		try {
		con = ConnectionUtil.getConnection();
		prmt = con.prepareStatement(sql);
		
		prmt.setInt(1,s.getStuId());
		prmt.setString(2, s.getStuName());
		prmt.setString(3, s.getStuClass());
		prmt.setDouble(4, s.getStuMarks());
		prmt.setString(5, s.getStuSchool());
		
		count = prmt.executeUpdate();
		
		}
		catch(Exception e)
		{			
			e.printStackTrace();
		}
		return count;
	}
	

	//this method is used to get DB data into ResultSet
	// rs -> 1 row=1 object ==> List Objects => {} /<></>
	public static List<Student> getStudent(){
		List<Student> list = null;
		Connection con=null;
		PreparedStatement prmt=null;
		ResultSet rs = null;
		String sql = "select * from studentdetails";
		
		try {
			con = ConnectionUtil.getConnection();
			prmt = con.prepareStatement(sql);
			rs =prmt.executeQuery();
			
			list = new ArrayList<Student>(0);
			while(rs.next())
			{
			list.add(
					new Student(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getDouble(4),
						rs.getString(5))
					); //convert one row to one object and adding into list by reading data
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
	// based on Id , row data will be deleted
	public static int delete(int sid) {
		Connection con=null;
		PreparedStatement prmt=null;
		int count =0;
		String sql = "delete from studentdetails where sid=?";
		
		try {
			con = ConnectionUtil.getConnection();
			prmt = con.prepareStatement(sql);
			
			prmt.setInt(1, sid);
			count = prmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
		
	}
	
	
	public static int updateStudent(Student s){
		
		Connection con=null;
		PreparedStatement prmt=null;
		int c = 0;
		String sql = "UPDATE studentdetails SET SNAME=? , SClass=?, smarks=? ,sschool=? WHERE sid=?";
		
		try {
			con = ConnectionUtil.getConnection();
			prmt = con.prepareStatement(sql);
			
			
			prmt.setString(1, s.getStuName());
			prmt.setString(2, s.getStuClass());
			prmt.setDouble(3, s.getStuMarks());
			prmt.setString(4, s.getStuSchool());
			prmt.setInt(5,s.getStuId());
			
			c =prmt.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return c;
	}
	
	

	public static List<Student> getOneStudent(int sid){
		List<Student> list = null;
		Connection con=null;
		PreparedStatement prmt=null;
		ResultSet rs = null;
		String sql = "select * from studentdetails where id=?";
		
		try {
			con = ConnectionUtil.getConnection();
			prmt = con.prepareStatement(sql);
			prmt.setInt(1,sid);
			rs =prmt.executeQuery();
			
			list = new ArrayList<Student>(0);
			while(rs.next())
			{
			list.add(new Student(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getDouble(4),
						rs.getString(5))
					);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	
	
	
}

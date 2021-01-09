package com.ge.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestSrv2 extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		//reading form data 
		String user=req.getParameter("t1");
		String pwd=req.getParameter("t2");
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		String qry=null;
		int result=0;
		try
		{
			//converting in single quotation
			user="'"+user+"'";
			pwd="'"+pwd+"'";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
			st=con.createStatement();
			qry="select count(*) from registration where uname="+user+" and pass="+pwd;
			rs=st.executeQuery(qry);
			while(rs.next())
			{
				result=rs.getInt(1);
			}
			if(result==0)
			{
				pw.println("<h1>Login Failed!</h1>");
				
			}
			else
			{
				RequestDispatcher rd=req.getRequestDispatcher("mainpage3.jsp");
				rd.forward(req, res);
			}
		}
		catch(Exception e)
		{
			
		}
		
		
		
	}

}





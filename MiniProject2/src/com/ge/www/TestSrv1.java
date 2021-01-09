package com.ge.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestSrv1 extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String uname=req.getParameter("t1");
		String pwd=req.getParameter("t2");
		String cpwd=req.getParameter("t3");
		String email=req.getParameter("t4");
		
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		String qry=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
			qry="insert into registration values(?,?,?,?)";
			ps=con.prepareStatement(qry);
			//set the values
			ps.setString(1,uname);
			ps.setString(2,pwd);
			ps.setString(3,cpwd);
			ps.setString(4,email);
			
			//execute
			result=ps.executeUpdate();
			if(result==0)
			{
				pw.println("Registration Failed");
			}
			else
			{
				RequestDispatcher rd=req.getRequestDispatcher("mainpage.jsp");
				rd.forward(req, res);
			}
			ps.close();
			con.close();
			
		}
		catch(Exception e)
		{
			pw.println(e);
		}

		pw.close();
	}

}







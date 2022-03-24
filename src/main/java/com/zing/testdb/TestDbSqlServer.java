//package com.zing.testdb;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.sql.*;
//
///**
// * Servlet implementation class TestDb
// */
//@WebServlet("/TestDbSqlServer")
//public class TestDbSqlServer extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=web_customer_tracker";
//		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//		String user = "sa";
//		String password = "sapassword";
//		try {
//			PrintWriter out = response.getWriter();
//			out.println("Connecting to database SQL SERVER: " + jdbcUrl);
//			Class.forName(driver);
//			Connection myConn = DriverManager.getConnection(jdbcUrl, user, password);
//			out.println("SUCCESS SQL SERVER: " + jdbcUrl);
//			System.out.println("Connection successful SQL SERVER:");
//			myConn.close();
//		} catch (Exception e) {
//			PrintWriter out = response.getWriter();
//			out.println(e);
//			// TODO: handle exception
//			e.printStackTrace();
//			throw new ServletException(e);
//		}
//	}
//
//}

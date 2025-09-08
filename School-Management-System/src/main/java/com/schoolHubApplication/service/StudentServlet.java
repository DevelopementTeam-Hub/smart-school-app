package com.schoolHubApplication.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("date")
public class StudentServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
		Date date=new Date();
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("<h1>Date and time : "+date+"</h1>");
		pw.println("<br><a href='Test.html'>HOME</a>");
		pw.close();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}

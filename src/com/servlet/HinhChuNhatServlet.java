package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hcn.php")
public class HinhChuNhatServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/hcn/form.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int chieuRong = Integer.parseInt(req.getParameter("chieuRong"));
		int chieuDai = Integer.parseInt(req.getParameter("chieuDai"));
		req.setAttribute("chuVi", (chieuDai+chieuRong)*2);
		req.setAttribute("dienTich", chieuDai*chieuRong);
		req.getRequestDispatcher("/views/hcn/result.jsp").forward(req, resp);
	}
}

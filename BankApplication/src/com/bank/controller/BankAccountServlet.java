package com.bank.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bank.pojo.Customer;
import com.bank.service.BankService;
import com.bank.service.BankServiceImpl;
import javax.*;

@WebServlet("*.app")
public class BankAccountServlet extends HttpServlet {

	BankService service = new BankServiceImpl();
	Customer customer = new Customer();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		HttpSession session = request.getSession();
		switch (action) {
		case "/withdraw.app":
			int id=Integer.parseInt(request.getParameter("custid"));
			int amount = Integer.parseInt(request.getParameter("amount"));
			System.out.println(amount);

				long res = service.withdraw(id,amount);
		
		

			session.setAttribute("Balance", res);
			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("balance.jsp");
			dispatcher.forward(request, response);
			break;

		case "/deposit.app":
			int depositamt = Integer.parseInt(request.getParameter("depositamount"));
			int id1=Integer.parseInt(request.getParameter("id"));
			System.out.println(depositamt);
			long res1=service.deposit(id1,depositamt);
			session.setAttribute("Balance",res1);
			 dispatcher = request.getRequestDispatcher("balance.jsp");
			dispatcher.forward(request, response);
			break;
		case "/addnewaccount.app":
			break;
		case "/viewall.app":
			List<Customer>list= service.viewAll();
			System.out.println(list);
			session.setAttribute("customers", list);
			 dispatcher = request.getRequestDispatcher("viewall.jsp");
				dispatcher.forward(request, response);
		case "/transferred.app":
			int idsender=Integer.parseInt(request.getParameter("id1"));
			int idrec=Integer.parseInt(request.getParameter("id2"));
			int transferamount=Integer.parseInt(request.getParameter("amount"));
			long result=service.fundTransfer(idsender, idrec, transferamount);
			session.setAttribute("Balance", result);
			dispatcher = request.getRequestDispatcher("transferred.jsp");
			dispatcher.forward(request, response);
			

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

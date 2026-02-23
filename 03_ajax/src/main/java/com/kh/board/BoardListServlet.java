package com.kh.board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BoardListServlet
 */
@WebServlet("/ajax/board/list")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardListServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  HttpSession session = request.getSession();

	        if(session.getAttribute("list") == null) {

	            ArrayList<String> list = new ArrayList<>();

	            list.add("kh게시판 1번글,admin,2024-06-05");
	            list.add("kh게시판 2번글,admin,2024-06-05");
	            list.add("kh게시판 3번글,mkm,2024-06-05");
	            list.add("kh게시판 4번글,user01,2024-06-05");
	            list.add("kh게시판 5번글,user02,2024-06-05");

	            session.setAttribute("list", list);
	        }
		request.getRequestDispatcher("/board/list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

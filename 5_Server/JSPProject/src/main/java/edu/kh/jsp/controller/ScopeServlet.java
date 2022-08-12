package edu.kh.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/EL/scope")
public class ScopeServlet extends HttpServlet {
	
	//a 태그 요청은 모두 GET 방식
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/* Servelt/JSP 내장 객체와 범위
		 
		 (공통) 특정 값을
		 
		 page : 현재 페이지(Servlet/JSP)에서만 사용 가능
		  
		 request : 현재 Servlet + 요청 위임한 JSP에서 사용 가능
		 
		 session : 현재 켜져있는 브라우저가 종료되기 전까지 어디서든 사용 가능
		 		   (ex. 로그인)
		
		 application : 배포한 웹 애플리케이션이 종료
		 
		 */
		
		// 1. page(생략)
		
		
		// 2. request scope
		req.setAttribute("message", "request scope에 저장된 메세지입니다.");
		
		
		// 3. session scope
		// 1) HttpSession 내장 객체 얻어오기
		HttpSession session = req.getSession();
		
		// 2) session 범위로 값 세팅(request와 방법 동일)
		session.setAttribute("sessionValue", "999");
		session.setAttribute("message", "session scope에 저장된 메세지입니다.");
		
		
		// 4. application scope
		// 1) ServletContext 내장 객체 얻어오기
		ServletContext application = req.getServletContext();
		
		// 2) application 범위로 값 세팅(request와 방법 동일)
		application.setAttribute("appValue", "세미 프로젝트 파이팅!");
		application.setAttribute("message", "application scope에 저장된 메세지입니다.");
		
		
		
		
		
		
		//JSP로 요청 위임
		String path = "/WEB-INF/views/el/scopeResult.jsp";
		RequestDispatcher dispatcher = req.getRequestDispatcher(path);
		
		dispatcher.forward(req, resp);
	}
	
}

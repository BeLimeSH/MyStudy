package edu.kh.community.member.model.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.google.gson.Gson;

import edu.kh.community.member.model.service.MemberService;
import edu.kh.community.member.model.vo.Member;

@WebServlet("/member/selectOne")
public class SelectOneServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//파라미터 얻어오기
		String memberEmail = req.getParameter("memberEmail");
		
		try {
			MemberService service = new MemberService();
			
			Member member = service.selectOne(memberEmail);
			
//			resp.getWriter().print(member);
			//print 매개변수로 참조형 변수가 작성되면
			//해당 참조형 변수의 toString() 메서드를 자동 호출해서 출력
			
			// ** Java 객체를 Javascript 객체로 변환하여 응답(출력) **
			
			// Java 객체 -> JSON(Javascript 객체 형태의 문자열) -> Javascript 객체
			
			//1) JSON 직접 작성 -> 오타 많음
//			String str = "{\"memberNickname\":\""+member.getMemberNickname()+"\"}";
//			resp.getWriter().print(str);
			
			//2) JSON-Simple 라이브러리에서 제공하는 JSONObject사용 -> 길다!
			/*
			 * if(member!=null) { JSONObject obj = new JSONObject();
			 * 
			 * obj.put("memberEmail", member.getMemberEmail()); obj.put("memberNickname",
			 * member.getMemberNickname()); obj.put("memberTel", member.getMemberTel());
			 * obj.put("memberAddress", member.getMemberAddress()); obj.put("enrollDate",
			 * member.getEnrollDate());
			 * 
			 * //JSONObject의 toString() 메서드는 JSON 형태로 출력될 수 있도록 오버라이딩이 되어있다!
			 * 
			 * resp.getWriter().print(obj.toString()); } else {
			 * resp.getWriter().print(member); //null }
			 */
			
			//3) GSON 라이브러리를 이용한 Java 객체 -> JSON 변환
//			new Gson().toJson(객체, 응답 스트림);
			// -> 매개변수에 작성된 객체를 JSON 형태로 변환한 후 스트림을 통해서 출력

			new Gson().toJson(member, resp.getWriter());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

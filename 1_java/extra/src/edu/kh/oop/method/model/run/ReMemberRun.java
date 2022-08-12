package edu.kh.oop.method.model.run;

import edu.kh.oop.method.model.service.ReMemberService;

public class ReMemberRun {
	
	public static void main(String[] args) {
		 
		ReMemberService service = new ReMemberService();
		
		service.displayMenu();
	}

}

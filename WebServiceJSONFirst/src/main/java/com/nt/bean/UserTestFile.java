package com.nt.bean;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UserTestFile {

	public static void main(String[] args) {
		try {
			User usr = new User();
			usr.setUid(999);
			usr.setUname("SAM");
			usr.setUpwd("NEWXYZ");
			usr.setUrole("EMPLOYEE");
			
			ObjectMapper om = new ObjectMapper();
			//String json = om.writeValueAsString(usr);
			//System.out.println(json);
//			om.writeValue(new File("e:/users.json"), usr);
			om.writeValue(new File("users.json"), usr);
			System.out.println("DONE");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

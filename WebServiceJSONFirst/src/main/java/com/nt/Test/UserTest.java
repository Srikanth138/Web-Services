package com.nt.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.bean.User;

public class UserTest {

	public static void main(String[] args) {
		try {
			User usr = new User();
			usr.setUid(10);
			usr.setUname("SAMPLE");
			usr.setUpwd("ABC123");
			usr.setUrole("ADMIN");

			ObjectMapper om = new ObjectMapper(); //jackson api 
			String json = om.writeValueAsString(usr);
			System.out.println(json);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

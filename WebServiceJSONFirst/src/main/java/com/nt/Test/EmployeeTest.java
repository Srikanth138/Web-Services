package com.nt.Test;
/**Q) What is ObjectMapper ?
A) This class is given by JACKSON, having logic to convert JSON<-->Object

Q) Why model class is required?
A) Class --> object --> JSON

Q) How to work with multiple classes?
A) Comes in next ssesion.....

Q) What is diff b/w JSON and JACKSON?
A) JSON is Object in Javascript
  JACKSON is converter : JSON<-->Object
 * */
import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.bean.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
			
		try {
			//1. create your class object
			Employee emp=new Employee();
			emp.setEid(100);
			emp.setEname("Srikanth");
			emp.setEsalary(10000.25);
			
			//2. create obj to ObjectMapper(C)
			ObjectMapper obj = new ObjectMapper();
			
			//3. call write__(object):json method
			String json = obj.writeValueAsString(emp);
			System.out.println(json);
			
//			obj.writeValue(new File("E:/stds.json"), obj);
//			System.out.println("DONE");
			
//			Note: writeValue(file,object):void
//			  this method is used to convert given object to a file 
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

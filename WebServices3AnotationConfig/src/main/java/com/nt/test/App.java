package com.nt.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.nt.model.Employee;
import com.nt.model.Student;

public class App {
	public static void main(String[] args) throws JAXBException {

		Student std = new Student();
		std.setStdId(100);
		std.setStdName("srikanth");
		std.setStdFee(10025.26);

		// create context object for Student
		JAXBContext context = JAXBContext.newInstance(Student.class);

		// create Marshaller object
		Marshaller m = context.createMarshaller();
		System.out.println(m.getClass().getName());

//		 call marshal method
		m.marshal(std, new File("std.xml")); // void type

		System.out.println(std);

		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setEmpName("sripatel");
		emp.setEmpSal(1200.02);
		emp.setEmpPwd("hello123");

		// create context object for Student
		JAXBContext context2 = JAXBContext.newInstance(Employee.class);

		// create Marshaller object
		Marshaller m2 = context2.createMarshaller();
		System.out.println(m2.getClass().getName());

		// call marshal method
		m2.marshal(emp, new File("emp.xml")); // void type

		System.out.println(emp);

	}
}

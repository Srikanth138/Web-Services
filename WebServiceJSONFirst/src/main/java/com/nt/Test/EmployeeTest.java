package com.nt.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.bean.Address;
import com.nt.bean.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

		try {
			// 1. create your class object
			Employee emp = new Employee();
			emp.setEid(100);
			emp.setEname("Srikanth");
			emp.setEsalary(10000.25);

			List<String> list = List.of("101", "102");// java 9 feature
			emp.setEprjs(list);
			Set<String> set = Set.of("hello", "hai");
			emp.setModules(set);

			Address addr = new Address();
			addr.setHno("2-126");
			addr.setLoc("Hyd");
			emp.setAddr(addr); // Has-A relation

//			Map map=Map.of(); //java 9 feature
			Map<String, Integer> map = new HashMap<String, Integer>();
			map.put("srikanth", 100);
			map.put("patel", 200);
			emp.setPrjver(map);

			// 2. create obj to ObjectMapper(C)
			ObjectMapper obj = new ObjectMapper();

			// 3. call write__(object):json method
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

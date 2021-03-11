package com.nt.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Employee {
	private int eid;
	private String ename;
	private double esalary;

	private List<String> eprjs;
	private Set<String> modules;

	private Map<String, Integer> prjver;

	private Address addr;// HAS-A
}

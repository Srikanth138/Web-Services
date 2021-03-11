package com.nt.StudentExam;

import java.util.List;
import java.util.Set;

import lombok.Data;

@Data
public class Student {
	private int sid;
	private String sname;
	private double sfee;
	private ExamData examdata;
	private Set<String> subjs;
	private List<Integer> mrks;

}

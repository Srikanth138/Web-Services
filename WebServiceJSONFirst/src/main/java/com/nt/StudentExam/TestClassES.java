package com.nt.StudentExam;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestClassES {

	public static void main(String[] args) throws JsonProcessingException {
		ExamData exam=new ExamData();
		exam.setGrade('a');
		exam.setResult("All pass");
		exam.setResult("2nd Class");
		exam.setTotalMarks(100);
		
		
		Student st=new Student();	
		st.setSid(101);
		st.setSname("srikanth");
		st.setSfee(45000.00);
		st.setExamdata(exam);
		
		Set<String> set=Set.of("java","c","C++");
		st.setSubjs(set);
		
		List<Integer> list=List.of(100,200,300);
		st.setMrks(list);
		
		// 2. create obj to ObjectMapper(C)
		ObjectMapper obj = new ObjectMapper();

		// 3. call write__(object):json method
		String json = obj.writeValueAsString(st);
		System.out.println(json);

	}

}

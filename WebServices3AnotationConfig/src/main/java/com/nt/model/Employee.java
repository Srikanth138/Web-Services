package com.nt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;
/* @XmlElement: It is used to provide alias names for variables.
 * Employee created but no data set (id-null,name-null,sal-null)
  
 * @XmlElement(name = "___", required = true) :
 This required says element value can not be set to null or empty
 we must provide some value.*/
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Employee {
	
	@XmlAttribute(name = "id")
	private Integer empId;
	@XmlElement(name = "employee-name",required = true)
	private String empName;
	@XmlElement(name="employee-salary")
	private Double empSal;
	@XmlTransient
	private String empPwd;
}

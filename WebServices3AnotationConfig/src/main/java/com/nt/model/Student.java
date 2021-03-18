package com.nt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
/*
 * @XmlRootElement
className -- Root Tag
 variables -- Child Tags
 
 * Only @XmlRootElement is active by default. Other Annotation are
 in disabled Mode. To activate other annotations wrote one
 variable(instance variable-feilds) use @XmlAccessorType(XmlAccessType.FIELD)
    
    @XmlAttribute
	By default every variable behaves like tag/element
    To convert one variable as attribute use this
    
    @XmlTransient : To avoid any variable using in Object--XML Conversion
    apply this annotation
    ->core level transient keyword we can you to not convert the values into in serializable. 
    
    @XmlElement: It is used to provide alias names for variables.
    
    int id=0;       //also a value , that needs memory to stroe
	Integer id=null //null is not a value, no memory required.
    */
    
@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
	
	@XmlAttribute(name = "id")
	private Integer stdId;
	@XmlElement(name = "Student-name")
	private String stdName;
	//To avoid any variable using in Object--XML Conversion apply this annotation
	private Double stdFee;

}

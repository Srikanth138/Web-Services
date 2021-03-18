package com.nt.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.Value;

@Data
@XmlRootElement
/*Must be applied over class name */
public class Student {
	private Integer stdId;
	private String stdName;
	private Double stdFee;

}

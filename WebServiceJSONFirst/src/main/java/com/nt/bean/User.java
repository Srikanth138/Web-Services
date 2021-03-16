package com.nt.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class User {

	@JsonProperty("user-id") //alias name
	private int uid;
	@JsonProperty("user-name")
	private String uname;
	@JsonIgnore //we can use it as a transient keyword.
	private String upwd; //we can use transient keyword we can't convert the password as a serializble
	@JsonProperty("user-authority")
	private String urole;
}

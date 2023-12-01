package com.example.demo.vo;

import lombok.Data;

@Data
public class member {
	private Integer id;
	private String memberno;
	private String name;
	private String username;
	private String password;
	private String phone;
	private String address;
	public member(String memberno, String name, String username, String password, String phone, String address) {
		super();
		this.memberno = memberno;
		this.name = name;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}
	public member() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

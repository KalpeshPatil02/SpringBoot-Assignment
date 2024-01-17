package com.kalpesh.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.TABLE)
	
//	@Column(name="rollno")
	private int id;
	
//	@Column(name="sname")
	private String name;
	
	private String address;
	
	private long contact;
	

}

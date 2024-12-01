package com.zaid.hibernate_program.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
public class CustomerDto {
	@Id
@GeneratedValue(generator="auto")
	@GenericGenerator(name="auto",strategy="increment")
	private int id;
	private String name;
	private String password;
	private String email;
	
}

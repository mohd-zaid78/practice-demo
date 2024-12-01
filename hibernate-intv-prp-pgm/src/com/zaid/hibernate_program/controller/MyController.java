package com.zaid.hibernate_program.controller;

import java.util.Scanner;

import com.zaid.hibernate_program.dao.CustomerDao;
import com.zaid.hibernate_program.entity.CustomerDto;

public class MyController {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for login and 2 for registration ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: CustomerDto dto = CustomerDao.logIn();
		if(dto!=null){
			System.out.println("login successfully your details below:");
			System.out.println(dto.getName()+" "+dto.getPassword()+" "+dto.getEmail());			
		}else{
			System.out.println("login failed please register first");
		}
			
			break;
			
        case 2: CustomerDao.Registration();
			
			break;

		default:
			break;
		}
		
		

	}

}

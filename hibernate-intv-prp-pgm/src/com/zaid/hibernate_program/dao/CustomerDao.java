package com.zaid.hibernate_program.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.zaid.hibernate_program.entity.CustomerDto;

public class CustomerDao {
	 static Scanner sc=new Scanner(System.in);
	public static Session getSession(){
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session ;
	}
	
	public static CustomerDto  logIn(){
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println("enter you password");
		String password = sc.next();
		Session session = getSession();
		session.delete(1);
		System.out.println("hello");
		//CustomerDto load = session.load(CustomerDto.class, "nawazz");
		//.out.println(load);
		Query query = session.createQuery("from CustomerDto where name='" +name+ "'and password='" +password+ "'");
		CustomerDto result = (CustomerDto) query.uniqueResult();
		return result;
//		if(result!=null){
//			System.out.println("login successfully your details below:");
//			System.out.println(result.getName()+" "+result.getPassword()+" "+result.getEmail());			
//		}else{
//			System.out.println("login failed please register first");
//		}
	}
	
	public static void Registration(){
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println("enter you password");
		String password = sc.next();
		System.out.println("enter your email");
		String email = sc.next();
		Session session = getSession();
		CustomerDto dto=new CustomerDto();
		dto.setName(name);
		dto.setPassword(password);
		dto.setEmail(email);
		Transaction transaction = session.beginTransaction();
		session.save(dto);
		
		transaction.commit();
		session.close();
		System.out.println("registion successfully done ");
		
	}

}

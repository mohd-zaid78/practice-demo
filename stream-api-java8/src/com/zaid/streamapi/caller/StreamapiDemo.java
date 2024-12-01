package com.zaid.streamapi.caller;
import com.zaid.streamapi.calling.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
public class StreamapiDemo {
											
	public static void main(String[] args) {
		List<Student> list=Arrays.asList(
				new Student(12,"zaid",9.33,"male"),
				new Student(13,"aleem",66.33,"male"),
				new Student(14,"lovely",76.33,"female"),
				new Student(15,"jhonny",84.33,"male"),
				new Student(16,"payal",67.33,"female"));

		
//==================================normal way ======================================
		Student st=list.get(0);
		for (Student student : list) {
			if(student.getMarks()>st.getMarks()){
				st=student;						
			}
		}
																									
		System.out.println(st);
														
		
//====================================using the stream api===============================		
		Stream<Student> stream = list.stream();
		Optional<Student> max = stream.max((t1,t2)->(int)(t1.getMarks()-t2.getMarks()));
		System.out.println(max);
		
		
//======================================using stream api with following standards===================		
	
		list.stream().max(Comparator.comparing(Student::getMarks)).ifPresent(System.out::println);
		
		
//=======================================using the stream api with the best and final standar ===============
		
		list.stream()     //converting the collection into straem
		.max(Comparator.comparing(Student::getMarks))  //find the maximum marks student details as optional
		.ifPresent(System.out::println);  //if present print it
		
		
//====================================using the stream api find the min student details===============================		
		Stream<Student> stream2 = list.stream();
		Optional<Student> min = stream2.min((t1,t2)->(int)(t1.getMarks()-t2.getMarks()));
		System.out.println(min);

//===============Check all the students are they above 60% or not without using the stream api==============
		
		boolean flag=true;
		for(Student student:list){
			if(student.getMarks()<60.00){
				flag=false;
			}
		}
		
		System.out.println("its true or false all the students marks above 60% " +flag);
		
		
//===============Check all the students are they above 60% or not with using the stream api==============
		
		boolean allMatch=list.stream().allMatch((l)->l.getMarks()>60.00);
		System.out.println(allMatch);
		
//===============Check anyone student above 60% or not with using the stream api==============
		
		boolean anyMatch = list.stream().anyMatch((p)->p.getMarks()>60);
		System.out.println(anyMatch);
	
//==========From the collection find the gender and save it into different different collection  without stream api=====
		
		List<Student> maleList=new ArrayList();
		List<Student> femaleList=new ArrayList();
		
		for (Student student : list) {
			if(student.getGender().equals("Male")){
				maleList.add(student);
			}else{
				femaleList.add(student);
			}
			
		}
		
		System.out.println("==========Female list=========");
		for (Student student : femaleList) {
			System.out.println(student);
			
		}
		System.out.println("==========Male list=========");
		for (Student student : maleList) {
			System.out.println(student);
			
		}
	
		
//==========From the collection find the gender and save it into different different collection  with using stream api=====	
		
		Map<String, List<Student>> collect = list.stream().collect(Collectors.groupingBy(Student::getGender));
		collect.forEach((gender,studentList)->{
			System.out.println("============"+gender+"===========");
			studentList.forEach(System.out::println);
		});
		
		
	}
	
}
 
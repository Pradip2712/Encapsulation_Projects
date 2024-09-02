package com.test;

import com.entity.Student;
import com.service.*;

public class Test {

	public static void main(String[] args) {

		Service ser = new Service();
		Student s1 = ser.m1();

		System.out.println(s1);

		s1.setRoll(25);	//set new roll num 
		System.out.println(s1.getRoll());

		s1.setName("Patil");
		System.out.println(s1.getName());

		s1.setMob(8459903965l);
		System.out.println(s1.getMob());

		s1.setAdd("karvenagar pune");
		System.out.println(s1.getAdd());

		System.out.println(s1);
		
		

	}

}

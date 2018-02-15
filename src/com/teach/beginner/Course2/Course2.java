package com.teach.beginner.Course2;

import org.junit.jupiter.api.Test;

public class Course2 {

	@Test
	public void topic01() {

		// class的宣告與點運算子
		User user = new User();
		System.out.println("user data: " + user.weight + ", " + user.height);

		user.weight += 20;
		user.height += 20;
		System.out.println("user data: " + user.weight + ", " + user.height);

	}

	@Test
	public void topic02() {

		// static修飾子
		User user1 = new User();
		System.out.println("user1 data: " + user1.weight + ", " + user1.height);
		System.out.println("come from: " + user1.planet);
		user1.planet = "Sun";

		User user2 = new User();
		System.out.println("user2 data: " + user2.weight + ", " + user2.height);
		System.out.println("come from: " + user2.planet);

	}

	@Test
	public void topic03() {

		// public private protected
		User user = new User();
		// System.out.println(user.age);
		// user.age = 100;

		System.out.println(user.getAge());
		user.setAge(100);
		System.out.println(user.getAge());

	}

	@Test
	public void topic04() {

		// extends
		UserSpecialized user = new UserSpecialized();
		System.out.println("user data: " + user.weight + ", " + user.height);
		System.out.println("come from: " + user.planet);
		// System.out.println("private: " + user.age);
		System.out.println("public function: " + user.getAge());

		System.out.println("new function: " + user.getName());

	}

	@Test
	public void topic05() {

		// practice example
//		circle cir = new circle();
//		cir.unit = 10;
//		System.out.println(cir.get_edge());
//
//		square squ = new square();
//		squ.unit = 10;
//		System.out.println(squ.get_edge());

	}

}

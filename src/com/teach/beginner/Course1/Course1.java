package com.teach.beginner.Course1;

public class Course1 {

	static int varGlobal = 0;

	public static void main(String[] args) {

		// 陣列
		int[] arrayInt1 = new int[12];
		int[] arrayInt2 = { 3, 4, 5 };

		System.out.println(arrayInt1[0]);
		System.out.println(arrayInt2[0]);

		// 使用loop操作array
		for (int i = 0; i < arrayInt1.length; i++) {
			System.out.println(arrayInt1[i]);
		}

		for (int i = 0; i < arrayInt2.length; i++) {
			System.out.println(arrayInt2[i]);
		}

		// 取代裡面的值
		for (int i = 0; i < arrayInt1.length; i++) {
			arrayInt1[i] = i;
		}

		for (int i = 0; i < arrayInt1.length; i++) {
			System.out.println(arrayInt1[i]);
		}

		// new
		arrayInt1 = new int[12];
		for (int i = 0; i < arrayInt1.length; i++)
			System.out.println(arrayInt1[i]);

		// 小數陣列與字串陣列
		Double[] arrayDouble = new Double[12];
		String[] arrayString = new String[12];

		// null
		System.out.println(arrayDouble[0]);
		System.out.println(arrayString[0]);

		if (arrayDouble[0] == null)
			System.out.println("Nothing in arrayDouble[0].");
		else
			System.out.println("There have something!!");

		// function
		theFunctionOfPrint("天氣很好");

		String varWeather = "天氣很不好";
		theFunctionOfPrint(varWeather);

		// function need correct type
		int varInt = 122;
//		theFunctionOfPrint(varInt);

		// return
		int varA = 10, varB = 17;
		System.out.println(varA + varB);

		int varC = add(varA, varB);
		System.out.println(varC);

		System.out.println(add(varA, varB));

		// static variable
		int unit = 10;
		System.out.println(varGlobal);
		AddtoGlobalVar(unit);
		System.out.println(varGlobal);
		AddtoGlobalVar(unit);
		System.out.println(varGlobal);

	}

	public static void AddtoGlobalVar(int A) {

		varGlobal += A;

	}

	public static int add(int A, int B) {

		int C = A + B;

		return C;

	}

	public static void theFunctionOfPrint(String str) {

		System.out.println(str);

	}

}

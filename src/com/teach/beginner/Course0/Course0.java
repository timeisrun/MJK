package com.teach.beginner.Course0;

import java.util.Scanner;

public class Course0 {

	public static void main(String[] args) {

		// 展示輸出且換行
		System.out.println("Output at console~");
		System.out.println("And this type will change line.");
		
		// 輸出不換行
		System.out.print("Output at console~");
		System.out.print("And this won't change line.");

		// 反斜線n
		System.out.println("Hello, my name is\nWayne.");

		// 宣告整數
		int varInt = 9999;
		System.out.println(varInt);

		// 四則運算
		int varA = 10, varB = 2;
		System.out.println("加法: " + (varA + varB));
		System.out.println("減法: " + (varA - varB));
		System.out.println("乘法: " + (varA * varB));
		System.out.println("除法: " + (varA / varB));

		// 其他運算
		System.out.println("取餘數: " + (varA % varB));
		System.out.println("比較case 1: " + (varA > varB));
		System.out.println("比較case 2: " + (varA == varB));
		System.out.println("比較case 3: " + (varA != varB));

		// 宣告小數
		Double varDouble = 123.456;
		System.out.println(varDouble);

		// 宣告字串
		String varString = "小明";
		System.out.println(varString);

		// 字串中的相加
		System.out.println("你好" + varString + ", 初次見面");
		System.out.printf("你好%s, 初次見面\n", varString);

		// 其他型態相加會轉換成字串
		System.out.println("你好" + varInt + "初次見面");
		System.out.println("你好" + varDouble + "初次見面");

		// 字元宣告 與 ascii code
		char varChar = 'a';
		System.out.println(varChar);
		System.out.println((int) varChar);

		// 輸入
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		String str = scn.nextLine();

		// 讀取多行資料
		while (scn.hasNext())
			System.out.println(scn.nextLine());

		// 選擇敘述
		int varSelect = 5;
		if (varSelect == 5) {
			System.out.println("varSelect is 5");
		} else if (varSelect > 10) {
			System.out.println("varSelect bigger then 10");
		} else {
			System.out.println("varSelect is: " + varSelect);
		}

		// 指令只有一行則可省略大括號
		if (varSelect == 5)
			System.out.println("varSelect is 5");
		else if (varSelect > 10)
			System.out.println("varSelect bigger then 10");
		else
			System.out.println("varSelect is: " + varSelect);

		// 迴圈敘述
		for (int i = 0; i < 10; i++) {
			System.out.println("For Loop: " + i);
		}

		int varWhile = 5;
		while (varWhile > 0) {
			System.out.println("While Loop: " + varWhile);
			varWhile--;
		}

		// switch運算
		int varSwitch = 1;
		switch (varSwitch) {
		case 1:
			System.out.println("值是1");
			break;
		case 2:
		case 3:
			System.out.println("值是3");
		case 4:
			System.out.println("我忘記加break了QQ");
			break;
		case 5:
			System.out.println("值是5, 後面沒break沒差");
		}

		// 三元運算子
		int varThree = 1;
		varThree = (varThree == 1) ? 2 : 3;
		System.out.println(varThree);

		// 轉型
		String varChange = "123";
		System.out.println(varChange + 1);
		System.out.println(varChange + (1 + 3));

		int varAfterChange = Integer.parseInt(varChange);
		System.out.println(varAfterChange + 1);

		// practice example
		int total = 0;
		for (int i = 1; i <= 50; i++) {
			total += i;
		}
		System.out.println("總和是" + total + "!!!");

	}

}

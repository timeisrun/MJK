package com.teach.beginner.Course0;

import java.util.Scanner;

public class Course0 {

	public static void main(String[] args) {

		// �i�ܿ�X�B����
		System.out.println("Output at console~");
		System.out.println("And this type will change line.");
		
		// ��X������
		System.out.print("Output at console~");
		System.out.print("And this won't change line.");

		// �ϱ׽un
		System.out.println("Hello, my name is\nWayne.");

		// �ŧi���
		int varInt = 9999;
		System.out.println(varInt);

		// �|�h�B��
		int varA = 10, varB = 2;
		System.out.println("�[�k: " + (varA + varB));
		System.out.println("��k: " + (varA - varB));
		System.out.println("���k: " + (varA * varB));
		System.out.println("���k: " + (varA / varB));

		// ��L�B��
		System.out.println("���l��: " + (varA % varB));
		System.out.println("���case 1: " + (varA > varB));
		System.out.println("���case 2: " + (varA == varB));
		System.out.println("���case 3: " + (varA != varB));

		// �ŧi�p��
		Double varDouble = 123.456;
		System.out.println(varDouble);

		// �ŧi�r��
		String varString = "�p��";
		System.out.println(varString);

		// �r�ꤤ���ۥ[
		System.out.println("�A�n" + varString + ", �즸����");
		System.out.printf("�A�n%s, �즸����\n", varString);

		// ��L���A�ۥ[�|�ഫ���r��
		System.out.println("�A�n" + varInt + "�즸����");
		System.out.println("�A�n" + varDouble + "�즸����");

		// �r���ŧi �P ascii code
		char varChar = 'a';
		System.out.println(varChar);
		System.out.println((int) varChar);

		// ��J
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		String str = scn.nextLine();

		// Ū���h����
		while (scn.hasNext())
			System.out.println(scn.nextLine());

		// ��ܱԭz
		int varSelect = 5;
		if (varSelect == 5) {
			System.out.println("varSelect is 5");
		} else if (varSelect > 10) {
			System.out.println("varSelect bigger then 10");
		} else {
			System.out.println("varSelect is: " + varSelect);
		}

		// ���O�u���@��h�i�ٲ��j�A��
		if (varSelect == 5)
			System.out.println("varSelect is 5");
		else if (varSelect > 10)
			System.out.println("varSelect bigger then 10");
		else
			System.out.println("varSelect is: " + varSelect);

		// �j��ԭz
		for (int i = 0; i < 10; i++) {
			System.out.println("For Loop: " + i);
		}

		int varWhile = 5;
		while (varWhile > 0) {
			System.out.println("While Loop: " + varWhile);
			varWhile--;
		}

		// switch�B��
		int varSwitch = 1;
		switch (varSwitch) {
		case 1:
			System.out.println("�ȬO1");
			break;
		case 2:
		case 3:
			System.out.println("�ȬO3");
		case 4:
			System.out.println("�ڧѰO�[break�FQQ");
			break;
		case 5:
			System.out.println("�ȬO5, �᭱�Sbreak�S�t");
		}

		// �T���B��l
		int varThree = 1;
		varThree = (varThree == 1) ? 2 : 3;
		System.out.println(varThree);

		// �૬
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
		System.out.println("�`�M�O" + total + "!!!");

	}

}

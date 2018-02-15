package com.teach.advanced.Course0;

import org.junit.jupiter.api.Test;

public class Course0 {

	public void topic01() {
		
		// �ֱ���
		
		// Ctrl + c => �ƻs
		System.out.println("�ƻs�ƻs");
		
		// Ctrl + v => �K�W
		
		// Ctrl + x => �ŤU
		System.out.println("���");
		
		// Ctrl + z => �_��
		System.out.println("�i�H�_��");
		
		// Ctrl + a => ����
		
		// Ctrl + s => �x�s
		
		// Ctrl + w => ����
		
		// Ctrl + f => �j�M
		
		// Ctrl + i => ����������¦�ƪ�
	System.out.println("�ƻs�ƻs");
System.out.println("�ƻs�ƻs");

		// Ctrl + Shift + f => �̷ӳ]�w�����۰ʱƪ�
System.out.println("�ƻs�ƻs");

for(int i=0;i<3;i++)System.out.println("�ƻs�ƻs");

int var = 19;
switch(var) {
case 19: break;
case 300: break;
}

		// Ctrl + Shift + r => �}�Ҹ귽

		// Ctrl + Shift + o => �פJ�ݨD�귽�B�������ϥθ귽
//		JFrame frame = new JFrame();

	}
	
	@Test
	public void topic02() {
		
		User user = new User("Moon", "�p��", 22, 63, 175);
		
		System.out.println(user.getAge());
		
		System.out.println(user.getName());
		
		user.setName("�p��");
		
		System.out.println(user.getName());
		
	}

	@Test
	public void topic03() {

		// StringBuilder

		String str = "a";

		long timestamp = System.currentTimeMillis();

		long memory = Runtime.getRuntime().maxMemory() - Runtime.getRuntime().freeMemory();

		for (int i = 0; i < 100000; i++) {

			str += "0";

			if (i == 9999) {

				output("plus", i, timestamp, memory);

			} else if (i == 49999) {

				output("plus", i, timestamp, memory);

			} else if (i == 99999) {

				output("plus", i, timestamp, memory);

			}

		}

		timestamp = System.currentTimeMillis();

		str = "a";

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 100000; i++) {

			sb.append(str).append("0");

			if (i == 9999) {

				output("sb", i, timestamp, memory);

			} else if (i == 49999) {

				output("sb", i, timestamp, memory);

			} else if (i == 99999) {

				output("sb", i, timestamp, memory);

			}

		}

	}

	public void output(String type, int status, long timestamp, long memory) {

		System.out.println(type + "\t" + status + "\t- ts: " + (System.currentTimeMillis() - timestamp) + ",\tm: "
				+ (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));

	}

}

package com.teach.advanced.Course0;

import org.junit.jupiter.api.Test;

public class Course0 {

	public void topic01() {
		
		// 快捷鍵
		
		// Ctrl + c => 複製
		System.out.println("複製複製");
		
		// Ctrl + v => 貼上
		
		// Ctrl + x => 剪下
		System.out.println("欠剪");
		
		// Ctrl + z => 復原
		System.out.println("可以復原");
		
		// Ctrl + a => 全選
		
		// Ctrl + s => 儲存
		
		// Ctrl + w => 關閉
		
		// Ctrl + f => 搜尋
		
		// Ctrl + i => 對選取部分基礎排版
	System.out.println("複製複製");
System.out.println("複製複製");

		// Ctrl + Shift + f => 依照設定全部自動排版
System.out.println("複製複製");

for(int i=0;i<3;i++)System.out.println("複製複製");

int var = 19;
switch(var) {
case 19: break;
case 300: break;
}

		// Ctrl + Shift + r => 開啟資源

		// Ctrl + Shift + o => 匯入需求資源且移除未使用資源
//		JFrame frame = new JFrame();

	}
	
	@Test
	public void topic02() {
		
		User user = new User("Moon", "小藍", 22, 63, 175);
		
		System.out.println(user.getAge());
		
		System.out.println(user.getName());
		
		user.setName("小綠");
		
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

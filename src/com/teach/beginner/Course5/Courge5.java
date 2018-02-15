package com.teach.beginner.Course5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class Courge5 {

	@Test
	public void readFile() {

		// read file
		try {
			String str;
			File file = new File("./file/index.txt");
			BufferedReader bfr = new BufferedReader(new FileReader(file));

			while ((str = bfr.readLine()) != null) {
				System.out.println(str);
			}

		} catch (IOException e1) {
			// TODO 自動產生的 catch 區塊
			e1.printStackTrace();
		}

	}

	@Test
	public void writeFile() {

		// write file
		try {
			String str;
			FileWriter fw = new FileWriter("./file/index.txt");
			BufferedWriter bfw = new BufferedWriter(fw);

			for (int i = 0; i < 10; i++) {
				bfw.write(Double.toString(Math.random()));
				bfw.newLine();
			}

			bfw.flush();
			fw.close();
		} catch (IOException e1) {
			// TODO 自動產生的 catch 區塊
			e1.printStackTrace();
		}

	}

}

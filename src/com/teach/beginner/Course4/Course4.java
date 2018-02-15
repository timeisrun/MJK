package com.teach.beginner.Course4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.teach.beginner.Course3.Course3;

public class Course4 {

	public static void main(String[] args) {

		JFrame frm = Course3.setJFrame(new JFrame());

		JPanel pnl = Course3.setJPanel(new JPanel());
		frm.add(pnl);

		JButton btn = addButton(pnl);

		// Timer
		Timer timer = new Timer(1, null);

		// print string
		timer = addTimer("a");

		timer.start();

		timer = addTimer("b");

		timer.start();

		timer.stop();
		
		// moving
		timer = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btn.setLocation(btn.getLocation().x + 10, btn.getLocation().y);
			}
		});

		timer.start();

	}

	public static JButton addButton(JPanel pnl) {

		JButton btn = new JButton();
		btn.setBounds(100, 100, 20, 20);
		btn.setBackground(Color.white);
		pnl.add(btn);

		return btn;

	}

	public static Timer addTimer(String output) {

		return new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println(output);
			}
		});

	}

}

package com.teach.beginner.Course3;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Course3 {

	public static void main(String[] args) {

		// JFrame
		JFrame frm = setJFrame(new JFrame());

		// JPanel
		JPanel pnl = setJPanel(new JPanel());
		frm.add(pnl);

		// JButton && Font
		addButton(pnl);

		// set button
		changeButtonSet(pnl);

		// JLabel
		addJLabel(pnl);

		// TextArea
		addTextArea(pnl);

		// TextField
		addTextField(pnl);

		// Action Button type 1
		addActionButton(pnl);
		
		// Action Button type 2
		
	}

	public static JFrame setJFrame(JFrame frm) {
		
		int screenwidth = (int)java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();

		frm.setLayout(null);
		frm.setBounds(100, 100, 500, 500);

		frm.setUndecorated(true);
		frm.setVisible(true);

		frm.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		return frm;

	}

	public static JPanel setJPanel(JPanel pnl) {

		pnl.setLayout(null);
		pnl.setBounds(0, 0, 500, 500);
		pnl.setBackground(Color.gray);

		return pnl;

	}

	public static void addButton(JPanel pnl) {

		// JButton and font
		String[] s = { "a", "b", "c", "d", "e", "f", "g", "h", "lalala", "dddd", "abcde" };

		JButton[] btn = new JButton[s.length];

		Font F0 = new Font("FangSong", Font.PLAIN, 20);

		for (int num = 0; num < s.length; num++) {

			btn[num] = new JButton(s[num]);
			btn[num].setBounds(0 + num * 51, 0, 50, 50);
			btn[num].setFont(F0);
			btn[num].setBackground(Color.gray);
			btn[num].setForeground(Color.white);
			pnl.add(btn[num]);

		}

	}

	public static void changeButtonSet(JPanel pnl) {

		JButton btn = new JButton();
		btn.setBounds(100, 100, 100, 100);
		pnl.add(btn);

		btn.setOpaque(true);
		btn.setContentAreaFilled(false);
		btn.setBorderPainted(false);

	}

	public static void addJLabel(JPanel pnl) {

		JLabel lab = new JLabel("今天天氣真好~");
		lab.setBounds(100, 100, 200, 80);
		pnl.add(lab);

	}

	public static void addTextArea(JPanel pnl) {

		TextArea txa = new TextArea("asd");
		txa.setBounds(100, 100, 200, 200);
		pnl.add(txa);

	}

	public static void addTextField(JPanel pnl) {

		TextField txf = new TextField("132222222222222222222222222222222222");
		txf.setBounds(100, 210, 100, 100);
		pnl.add(txf);

	}

	public static void addActionButton(JPanel pnl) {

		JButton btn = new JButton();
		btn.setBounds(100, 100, 100, 100);
		pnl.add(btn);

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn.setLocation(btn.getLocation().x + 10, btn.getLocation().y);
			}
		});

	}

}
